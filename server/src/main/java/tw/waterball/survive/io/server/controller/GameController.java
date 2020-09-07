package tw.waterball.survive.io.server.controller;

import tw.waterball.survive.io.router.protocol.api.ServerApi;
import tw.waterball.survive.io.server.world.World;

public class GameController implements ServerApi {
    private World world;

    @Override
    public void useWeapon(int playerId) {

    }

    @Override
    public void reload(int playerId) {

    }

    @Override
    public void turn(int playerId, float angle) {

    }

    @Override
    public void moveForward(int playerId) {

    }

    @Override
    public void moveLeftward(int playerId) {

    }

    @Override
    public void moveRightward(int playerId) {

    }

    @Override
    public void moveBackward(int playerId) {

    }

    @Override
    public void pickUpWeapon(int playerId, int weaponId) {

    }

    @Override
    public void playerCurrentThrowWeapon(int playerId, int currentWeaponId) {

    }

    @Override
    public void switchWeapon(int playerId, int weaponSlotIndex) {

    }
}
