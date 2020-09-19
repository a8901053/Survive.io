package tw.waterball.survive.io.client.controller;


import tw.waterball.survive.io.api.api.ServerApi;
import tw.waterball.survive.io.client.view.GameView;
import tw.waterball.survive.io.game.sprite.role.Player;
import tw.waterball.survive.io.game.sprite.weapon.Weapon;
import tw.waterball.survive.io.game.world.SpriteContainer;

public class PlayerController {
    private Player clientPlayer;
    private GameView gameView;
    private SpriteContainer spriteContainer;
    private ServerApi serverApi;

    public void setGameView(GameView gameView) {
        this.gameView = gameView;
    }

    public void usePlayerWeapon() {

    }

    public void reloadPlayerGun() {

    }

    public void turnPlayerAngleTo(float angle) {

    }

    public void movePlayerUp() {

    }

    public void movePlayerLeft() {

    }

    public void movePlayerRight() {

    }

    public void movePlayerDown() {

    }

    public void throwPlayerCurrentWeapon() {

    }

    public void switchPlayerCurrentWeapon(int weaponSlotIndex) {

    }


    public Weapon getCurrentPlayerWeapon() {
        return null;
    }

    public void setCurrentWeapon(Weapon weapon) {

    }

}

