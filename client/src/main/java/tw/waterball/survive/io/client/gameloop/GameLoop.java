package tw.waterball.survive.io.client.gameloop;

import tw.waterball.survive.io.client.controller.SpriteContainer;
import tw.waterball.survive.io.client.sprite.Sprite;
import tw.waterball.survive.io.client.view.GameView;

import java.util.List;

public class GameLoop {
    private GameView gameView;
    private SpriteContainer spriteContainer;
    private List<Sprite> sprites;

    public GameLoop(GameView gameView, SpriteContainer spriteContainer) {
        this.gameView = gameView;
        this.spriteContainer = spriteContainer;
    }

    public void start() {

    }
}
