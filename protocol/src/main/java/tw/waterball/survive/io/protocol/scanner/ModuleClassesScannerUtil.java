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

package tw.waterball.survive.io.protocol.scanner;

import java.io.File;
import java.net.URL;
import java.net.URLDecoder;
import java.util.*;

/**
 * @author - wally55077@gmail.com
 */

public final class ModuleClassesScannerUtil {

    private ModuleClassesScannerUtil() {

    }

    /**
     * Give a package name to this method ,
     * it would scan whole module and returns all of Classes with a Set.
     **/
    public static Set<Class<?>> scanClassesByPackageName(String packageName) {
        Set<Class<?>> classes = new HashSet<>();
        String packageDirName = packageName.replace('.', '/');
        try {
            findClassesByFileProtocol(packageName, classes, packageDirName);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return classes;
    }

    private static void findClassesByFileProtocol(String packageName, Set<Class<?>> classes, String packageDirName) throws Exception {
        Enumeration<URL> dirs = Thread.currentThread().getContextClassLoader().getResources(packageDirName);
        while (dirs.hasMoreElements()) {
            URL url = dirs.nextElement();
            String protocol = url.getProtocol();
            if ("file".equals(protocol)) {
                String filePath = URLDecoder.decode(url.getFile(), "UTF-8");
                findClassesInPackageOnFileSystem(packageName, filePath, classes);
            }
        }
    }

    private static void findClassesInPackageOnFileSystem(String packageName, String packagePath, Set<Class<?>> classes) {
        File directory = new File(packagePath);
        if (directory.exists() && directory.isDirectory()) {
            File[] dirFiles = directory.listFiles();
            Arrays.stream(Objects.requireNonNull(dirFiles))
                    .parallel()
                    .forEach(file -> findClassesInDirectory(packageName, classes, file, file.getName()));
        }
    }

    private static void findClassesInDirectory(String packageName, Set<Class<?>> classes, File file, String fileName) {
        if (file.isDirectory()) {
            findClassesInPackageOnFileSystem(packageName + "." + fileName, file.getAbsolutePath(), classes);
        } else {
            findClassByClassName(packageName, classes, fileName);
        }
    }

    private static void findClassByClassName(String packageName, Set<Class<?>> classes, String fileName) {
        try {
            String className = fileName.substring(0, fileName.length() - 6);
            String path = packageName + '.' + className;
            classes.add(Thread.currentThread().getContextClassLoader().loadClass(path));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
