package tw.waterball.survive.io.poc.game;

import java.util.HashSet;
import java.util.Set;

import static tw.waterball.survive.io.poc.utils.DelayUtils.delay;

/**
 * @author Waterball (johnny850807@gmail.com)
 */
public class GameLoop {
    private SpriteContainer container;
    private Set<Listener> listeners = new HashSet<>();
    private boolean running;

    public GameLoop(SpriteContainer spriteContainer) {
        this.container = spriteContainer;
    }

    public void start() {
        running = true;
        new Thread(this::loop).start();
    }

    private void loop() {
        while (running) {
            container.onUpdate();
            listeners.forEach(Listener::onUpdate);
            delay(15);
        }
    }

    public void stop() {
        running = false;
    }

    public interface Listener {
        void onUpdate();
    }

}
