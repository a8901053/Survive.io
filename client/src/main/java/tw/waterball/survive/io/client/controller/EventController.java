package tw.waterball.survive.io.client.controller;

import tw.waterball.survive.io.client.prototypefactory.SpritePrototypeFactory;
import tw.waterball.survive.io.client.sprite.Role.Role;
import tw.waterball.survive.io.client.sprite.Sprite;
import tw.waterball.survive.io.client.sprite.Terrain.Terrain;
import tw.waterball.survive.io.client.view.GameView;
import tw.waterball.survive.io.domain.model.gameobject.GameObject;

public abstract class EventController {
	private Sprite[] sprites;
	private Terrain[] map;
	private SpritePrototypeFactory spritePrototypeFactory;
	private GameView gameView;

	public void onPlayerSufferJury(int id, int damage) {

	}

	public void onSufferJury(Role role, int damage) {

	}

	public void onThrowWeapon(int weaponId) {

	}

	public void onSwitchWeapon(int id) {

	}

	public abstract void onReload(int id);

	public void onAttack(int id) {

	}

	public void onPickUpWeapon(int id, int weaponId) {

	}

	public void onTurn(int id) {

	}

	public abstract void onDead(int id);

	public abstract void onUpdate(GameObject gameObject);

	public void onPlayerLoginSuccess() {

	}

}
