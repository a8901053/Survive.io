/*
 *  Copyright 2020 Johnny850807 (Waterball) 潘冠辰
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package tw.waterball.survive.ioc;

import tw.waterball.survive.ioc.exceptions.CycleDependencyException;

import java.lang.reflect.Constructor;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author - wally55077@gmail.com
 */
public final class IocContainer {

    private static final int STATE_NONE = 0;
    private static final int STATE_VISITED = 1;
    private static final int STATE_FINISHED = 2;
    private final Map<Class<?>, Object> instanceMap = new ConcurrentHashMap<>();
    private final Map<Class<?>, Integer> stateMap = new ConcurrentHashMap<>();

    /**
     * Give a package name , it would scan whole module and DI all the Classes.
     **/
    public void scan(String packageName) {
        ModuleClassesScannerUtil
                .scanClassesByPackageName(packageName)
                .forEach(this::instantiateByDfs);
    }

    /**
     * @return The instance of the given class
     **/
    @SuppressWarnings("unchecked")
    public <T> T getInstanceByClass(Class<T> type) {
        if (!instanceMap.containsKey(type)) {
            instanceMap.put(type, instantiateByDfs(type));
        }
        return (T) instanceMap.get(type);
    }

    private <T> T instantiateByDfs(Class<T> type) {
        verifyConstructorSize(type);
        return injectDependencies(type, type.getConstructors()[0]);
    }

    /**
     * @throws IllegalStateException constructors length over one.
     */
    private <T> void verifyConstructorSize(Class<T> type) {
        int length = type.getConstructors().length;
        if (length > 1) {
            throw new IllegalStateException("Expect " + type.getSimpleName() +
                    " only one constructor, given " + length + ".");
        }
    }

    private <T> T injectDependencies(Class<T> type, Constructor<?> constructor) {
        Class<?>[] paramTypes = constructor.getParameterTypes();
        Object[] instances = new Object[paramTypes.length];
        for (int index = 0; index < paramTypes.length; index++) {
            injectDependencyOnClass(paramTypes[index], instances, index);
        }
        return newInstanceByClassType(type, constructor, instances);
    }

    /**
     * @throws CycleDependencyException cycle detected
     */
    private void injectDependencyOnClass(Class<?> paramType, Object[] instances,
                                         int index) {
        verifyParamClassTypeState(paramType);
        switch (stateMap.get(paramType)) {
            case STATE_VISITED:
                throw new CycleDependencyException();
            case STATE_NONE:
                stateMap.put(paramType, STATE_VISITED);
                Object value = instantiateByDfs(paramType);
                instanceMap.put(paramType, value);
            case STATE_FINISHED:
                instances[index] = instanceMap.get(paramType);
        }
    }

    private void verifyParamClassTypeState(Class<?> paramType) {
        if (!stateMap.containsKey(paramType)) {
            stateMap.put(paramType, STATE_NONE);
        }
    }

    @SuppressWarnings("unchecked")
    private <T> T newInstanceByClassType(Class<T> type, Constructor<?> constructor,
                                         Object[] instances) {
        try {
            stateMap.put(type, STATE_FINISHED);
            return (T) constructor.newInstance(instances);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
