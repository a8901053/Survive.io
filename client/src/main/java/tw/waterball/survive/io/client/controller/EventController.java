package tw.waterball.survive.io.client.controller;

import tw.waterball.survive.io.client.prototypefactory.SpritePrototypeFactory;
import tw.waterball.survive.io.client.sprite.Sprite;
import tw.waterball.survive.io.client.sprite.terrain.Terrain;
import tw.waterball.survive.io.client.view.GameView;

import java.util.List;

public abstract class EventController {
    private List<Sprite> sprites;
    private List<Terrain> map;
    private SpritePrototypeFactory spritePrototypeFactory;
    private GameView gameView;

    public void onSufferJury(int id, int damage) {

    }

    public void onThrowWeapon(int weaponId) {

    }

    public void onSwitchWeapon(int roleId) {

    }

    public void onReload(int roleId) {

    }

    public void onAttack(int roleId) {

    }

    public void onPickUpWeapon(int roleId, int weaponId) {

    }

    public void onTurn(int roleId, float angle) {

    }

    public void onDead(int id) {

    }

    public void onUpdate(Sprite sprite) {

    }

    public void onPlayerLoginSuccess() {

    }

}
