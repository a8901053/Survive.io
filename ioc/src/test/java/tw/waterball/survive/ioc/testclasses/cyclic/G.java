package tw.waterball.survive.ioc.testclasses.cyclic;

/**
 * @author - wally55077@gmail.com
 */
public class G {
    private final H h;

    public G(H h) {
        this.h = h;
    }
}
