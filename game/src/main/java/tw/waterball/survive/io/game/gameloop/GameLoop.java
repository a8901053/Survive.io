package tw.waterball.survive.io.game.gameloop;

import tw.waterball.survive.io.game.sprite.Sprite;
import tw.waterball.survive.io.game.world.SpriteContainer;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author - a89010531111@gmail.com
 */
public class GameLoop {
    private final SpriteContainer spriteContainer;
    private final Set<Listener> gameListeners = new HashSet<>();
    private boolean running = false;

    public GameLoop(SpriteContainer spriteContainer) {
        this.spriteContainer = spriteContainer;
    }

    public void start() {
        running = true;
        new Thread(() -> {
            while (running) {
                delay(15);
                spriteContainer.getSprites().forEach(Sprite::onUpdate);
                for (Listener gameListener : gameListeners) {
                    gameListener.onUpdate(spriteContainer.getSprites());
                }
            }
        }).start();
    }

    public void stop() {
        running = false;
    }

    private void delay(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void addListener(Listener listener) {
        gameListeners.add(listener);
    }


    public interface Listener {
        void onUpdate(List<Sprite> sprites);
    }
}
