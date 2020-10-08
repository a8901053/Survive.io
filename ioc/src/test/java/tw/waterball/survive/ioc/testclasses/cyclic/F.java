package tw.waterball.survive.ioc.testclasses.cyclic;

import tw.waterball.survive.ioc.testclasses.acyclic.A;

/**
 * @author - wally55077@gmail.com
 */
public class F {
    private final A a;
    private final G g;

    public F(A a, G g) {
        this.a = a;
        this.g = g;
    }
}
