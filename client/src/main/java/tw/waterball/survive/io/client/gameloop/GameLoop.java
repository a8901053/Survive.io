package tw.waterball.survive.io.client.gameloop;

import tw.waterball.survive.io.client.controller.SpriteContainer;
import tw.waterball.survive.io.client.view.GameView;

public class GameLoop {
    private GameView gameView;
    private SpriteContainer spriteContainer;

    public GameLoop(GameView gameView, SpriteContainer spriteContainer) {
        this.gameView = gameView;
        this.spriteContainer = spriteContainer;
    }

    public void start() {

    }
}
