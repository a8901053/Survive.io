package tw.waterball.survive.ioc.testclasses.acyclic;

/**
 * @author - wally55077@gmail.com
 */
public class C {
    private final B b;
    private final D d;

    public C(B b, D d) {
        this.b = b;
        this.d = d;
    }
}
