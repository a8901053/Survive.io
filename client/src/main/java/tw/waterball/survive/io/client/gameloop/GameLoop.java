package tw.waterball.survive.io.client.gameloop;

import tw.waterball.survive.io.client.controller.SpriteContainer;
import tw.waterball.survive.io.client.view.GameView;

/**
 * @author - timt1028@gmail.com
 */
public class GameLoop {

    private GameView gameView;
    private SpriteContainer spriteContainer;

    public GameLoop(GameView gameView, SpriteContainer spriteContainer) {
        this.gameView = gameView;
        this.spriteContainer = spriteContainer;
    }

    public void start() {
        new Thread(() -> {
            while (true) {
                delay(15);
                gameView.onRender(spriteContainer.getSprites());
            }
        }).start();
    }

    private void delay(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
