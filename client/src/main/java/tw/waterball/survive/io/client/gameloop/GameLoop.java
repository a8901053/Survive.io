package tw.waterball.survive.io.client.gameloop;

import tw.waterball.survive.io.client.sprite.Sprite;
import tw.waterball.survive.io.client.view.GameView;

import java.util.List;

public class GameLoop {
    private GameView gameView;
    private List<Sprite> sprites;

    public GameLoop(GameView gameView, List<Sprite> sprites) {
        this.gameView = gameView;
        this.sprites = sprites;
    }

    public void start() {

    }
}
