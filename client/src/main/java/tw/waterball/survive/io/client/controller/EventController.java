package tw.waterball.survive.io.client.controller;

import tw.waterball.survive.io.client.prototypefactory.SpritePrototypeFactory;
import tw.waterball.survive.io.client.sprite.Sprite;
import tw.waterball.survive.io.client.sprite.Terrain.Terrain;
import tw.waterball.survive.io.client.view.GameView;

import java.util.List;

public class EventController {
	private List<Sprite> sprites;
	private List<Terrain> map;
	private SpritePrototypeFactory spritePrototypeFactory;
	private GameView gameView;

	public void onSufferJury(int id, int damage) {

	}

	public void onThrowWeapon(int weaponId) {

	}

	public void onSwitchWeapon(int playerId) {

	}

	public void onReload(int playerId){

	}

	public void onAttack(int playerId) {

	}

	public void onPickUpWeapon(int playerId, int weaponId) {

	}

	public void onTurn(int playerId) {

	}

	public void onDead(int playerId){

	}

	public void onUpdate(Sprite sprite){

	}

	public void onPlayerLoginSuccess() {

	}

}
