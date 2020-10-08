package tw.waterball.survive.ioc.testclasses.cyclic;

/**
 * @author - wally55077@gmail.com
 */
public class H {
    private final F f;

    public H(F f) {
        this.f = f; //loop-back
    }
}
