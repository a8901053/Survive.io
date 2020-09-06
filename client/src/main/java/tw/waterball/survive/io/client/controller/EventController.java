package tw.waterball.survive.io.client.controller;

import tw.waterball.survive.io.client.prototypefactory.SpritePrototypeFactory;
import tw.waterball.survive.io.client.sprite.Sprite;
import tw.waterball.survive.io.client.view.GameView;

public class EventController {
    private SpriteContainer spriteContainer;
    private SpritePrototypeFactory spritePrototypeFactory;
    private GameView gameView;

    public void onSufferingInjury(int id, int damage) {

    }

    public void onThrowWeapon(int weaponId) {

    }

    public void onSwitchWeapon(int roleId) {

    }

    public void onReload(int roleId) {

    }

    public void onWeaponUsed(int roleId) {

    }

    public void onPickUpWeapon(int roleId, int weaponId) {

    }

    public void onTurn(int roleId, float angle) {

    }

    public void onDead(int id) {

    }

    public void onSpriteAddPlayerSight(Sprite sprite) {

    }

    public void onPlayerLoginSuccessfully() {

    }

}
