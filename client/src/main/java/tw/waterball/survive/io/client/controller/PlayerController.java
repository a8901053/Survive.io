package tw.waterball.survive.io.client.controller;

import tw.waterball.survive.io.client.sprite.role.PlayerSprite;
import tw.waterball.survive.io.client.sprite.weapon.WeaponSprite;
import tw.waterball.survive.io.client.view.GameView;
import tw.waterball.survive.io.router.protocol.api.ServerApi;

public class PlayerController {
    private PlayerSprite clientPlayerSprite;
    private WeaponSprite playerCurrentWeaponSprite;
    private GameView gameView;
    private SpriteContainer spriteContainer;
    private ServerApi serverApi;

    public void playerUseWeapon() {

    }

    public void playerReload() {

    }

    public void playerTurn(float angle) {

    }

    public void playerMoveForward() {

    }

    public void playerMoveLeftward() {

    }

    public void playerMoveRightward() {

    }

    public void playerMoveBackward() {

    }

    public void playerThrowCurrentWeapon() {

    }

    public void playerSwitchWeapon(int weaponSlotIndex) {

    }

    public WeaponSprite getCurrentPlayerWeapon() {
        return null;
    }

    public void setCurrentWeapon(WeaponSprite weaponSprite) {

    }

}
