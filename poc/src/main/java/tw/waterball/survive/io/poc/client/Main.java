package tw.waterball.survive.io.poc.client;

import tw.waterball.survive.io.poc.game.GameLoop;
import tw.waterball.survive.io.poc.game.World;

import java.io.IOException;

/**
 * @author Waterball (johnny850807@gmail.com)
 */
public class Main {

    public static void main(String[] args) throws IOException {
        World world = new World();
        GameLoop gameLoop = new GameLoop(world);
        Controller controller = new Controller(gameLoop, world);
        Client client = new Client(controller);
        GameView gameView = new GameView(controller);
        gameView.launch();
        // client.start();
    }
}
