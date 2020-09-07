package tw.waterball.survive.io.client.controller;

import tw.waterball.survive.io.client.prototypefactory.SpritePrototypeFactory;
import tw.waterball.survive.io.client.view.GameView;
import tw.waterball.survive.io.router.protocol.api.ClientApi;

public class EventController implements ClientApi {
    private SpriteContainer spriteContainer;
    private SpritePrototypeFactory spritePrototypeFactory;
    private GameView gameView;


    @Override
    public void onLoginSuccessfully(byte[] map, byte[] player) {

    }

    @Override
    public void onHeartBeat() {

    }

    @Override
    public void onMoveForward(int roleId, int roleY) {

    }

    @Override
    public void onMoveBackward(int roleId, int roleY) {

    }

    @Override
    public void onMoveLeftward(int roleId, int roleX) {

    }

    @Override
    public void onMoveRightward(int roleId, int roleX) {

    }

    @Override
    public void onInjured(int id, int damage) {

    }

    @Override
    public void onThrowCurrentWeapon(int roleId, int currentWeaponId) {

    }

    @Override
    public void onSwitchWeapon(int roleId, int weaponSlotIndex) {

    }

    @Override
    public void onReload(int roleId) {

    }

    @Override
    public void onWeaponUsed(int roleId) {

    }

    @Override
    public void onPickUpWeapon(int roleId, int weaponId) {

    }

    @Override
    public void onTurn(int roleId, float angle) {

    }

    @Override
    public void onDead(int id) {

    }

    @Override
    public void onWorldObjectJoinsPlayerViewPort(byte[] worldObject) {

    }
}
