package tw.waterball.survive.ioc.testclasses.acyclic;

/**
 * @author - wally55077@gmail.com
 */
public class A {
    private final B b;
    private final C c;

    public A(B b, C c) {
        this.b = b;
        this.c = c;
    }
}
