package tw.waterball.survive.ioc.testclasses.acyclic;

/**
 * @author - wally55077@gmail.com
 */
public class D {
    private final B b;
    private final E e;

    public D(B b, E e) {
        this.b = b;
        this.e = e;
    }
}
