package tw.waterball.survive.io.poc.client;

import tw.waterball.survive.io.poc.game.Direction;
import tw.waterball.survive.io.poc.game.GameLoop;
import tw.waterball.survive.io.poc.game.Player;
import tw.waterball.survive.io.poc.game.World;

import java.awt.*;

/**
 * @author Waterball (johnny850807@gmail.com)
 */
public class Controller {
    private GameLoop gameLoop;
    private World world;

    public Controller(GameLoop gameLoop, World world) {
        this.gameLoop = gameLoop;
        this.world = world;
    }

    public void move(Direction direction) {
        world.getP1().move(direction);
    }

    public void halt() {

    }

    public void shoot() {

    }

    public void onPlayerMove(int playerId) {

    }

    public void onPlayerHalt(int playerId) {

    }

    public void onBulletMove(int bulletId) {

    }

    public void onPlayerShoot(int playerId) {

    }

    public void onSyncWorld() {

    }
}
