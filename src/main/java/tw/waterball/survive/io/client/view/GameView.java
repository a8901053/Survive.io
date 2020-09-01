package tw.waterball.survive.io.client.view;


import tw.waterball.survive.io.client.controller.PlayerController;
import tw.waterball.survive.io.client.sprite.Sprite;
import tw.waterball.survive.io.client.sprite.Weapon.Weapon;
import tw.waterball.survive.io.server.model.gameobject.role.Role;

public abstract class GameView {
	private State state;
	private PlayerController playerController;

	public void launch() {

	}

	public void onRender(Sprite[] sprites) {

	}

	public void onAttack(String soundPath, Role role) {

	}

	public void onPlayerLoginSuccess() {

	}

	public void onPlayerSameName() {

	}

	public void onNoBulletToLoad() {

	}

	public void onMagazineIsFull() {

	}

	public void onPickUpWeapon(Role role) {

	}

	public void onThrowWeapon(Weapon weapon) {

	}

	public void onSufferInjury(int damage, Role role) {

	}

	public void onSwitchWeapon(Role role) {

	}

	public void onReload(Role role) {

	}

	public void onDead(Role role) {

	}

	public void onMove(Role role) {

	}

	public void onTurn(Role role) {

	}


}
