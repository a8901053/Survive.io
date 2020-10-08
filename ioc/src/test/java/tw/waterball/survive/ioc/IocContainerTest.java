package tw.waterball.survive.ioc;

import org.junit.BeforeClass;
import org.junit.Test;
import tw.waterball.survive.ioc.exceptions.CycleDependencyException;
import tw.waterball.survive.ioc.testclasses.acyclic.A;
import tw.waterball.survive.ioc.testclasses.cyclic.F;

import static org.junit.Assert.*;

/**
 * @author - wally55077@gmail.com
 */
public class IocContainerTest {

    private static IocContainer iocContainer;

    @BeforeClass
    public static void init() {
        iocContainer = new IocContainer();
    }

    public void scanAcyclicPackage() {
        iocContainer.scan("tw.waterball.survive.ioc.testclasses.acyclic");
    }

    @Test
    public void whenScanCyclicPackage_thenShouldThrowCycleDependencyException() {
        assertThrows(CycleDependencyException.class,
                () -> iocContainer.scan("tw.waterball.survive.ioc.testclasses.cyclic"));
    }

    @Test
    public void givenAClassType_whenDependencyInjectionInstantiate_thenShouldGetAInstance() {
        scanAcyclicPackage();
        Class<A> aClass = A.class;
        A a = iocContainer.getInstanceByClass(aClass);
        assertEquals(aClass, a.getClass());
    }

    @Test
    public void givenFClassType_whenDependencyInjectionInstantiate_thenShouldThrowCycleDependencyException() {
        assertThrows(CycleDependencyException.class,
                () -> iocContainer.getInstanceByClass(F.class));
    }

    @Test
    public void givenAClassInstantiated_whenGetAClass_thenShouldGetSingletonInstance() {
        scanAcyclicPackage();
        Class<A> aClass = A.class;
        A a1 = iocContainer.getInstanceByClass(aClass);
        A a2 = iocContainer.getInstanceByClass(aClass);
        assertSame(a1, a2);
    }
}