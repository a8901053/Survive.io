package tw.waterball.survive.io.poc.utils;

/**
 * @author Waterball (johnny850807@gmail.com)
 */
public class DelayUtils {
    public static void delay(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
