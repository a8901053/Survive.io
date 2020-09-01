package tw.waterball.survive.io.server.model.gameobject.role;

import tw.waterball.survive.io.server.model.gameobject.GameObject;
import tw.waterball.survive.io.server.model.gameobject.weapon.Weapon;
import tw.waterball.survive.io.server.server.Client;

public class Player extends Role implements Client {
	private Client client;

	public void reload() {

	}

	@Override
	public void onLoginSuccess() {

	}

	@Override
	public void onHeartBeat() {

	}

	@Override
	public void onSufferJury(Role role, int damage) {

	}

	@Override
	public void onThrowWeapon(Weapon weapon) {

	}

	@Override
	public void onSwitchWeapon(Role role) {

	}

	@Override
	public void onReload(Role role) {

	}

	@Override
	public void onAttack(Role role) {

	}

	@Override
	public void onPickUpWeapon(Player player, Weapon weapon) {

	}

	@Override
	public void onTurn(Role role) {

	}

	@Override
	public void onDead(Role role) {

	}

	@Override
	public void onUpdate(GameObject gameObject) {

	}
}
