package tw.waterball.survive.io.server;


import tw.waterball.survive.io.domain.model.gameobject.GameObject;
import tw.waterball.survive.io.domain.model.gameobject.role.Player;
import tw.waterball.survive.io.domain.model.gameobject.role.Role;
import tw.waterball.survive.io.domain.model.gameobject.weapon.Weapon;

public class ClientSocketAdapter implements Client {

	@Override
	public void onLoginSuccess() {

	}

	@Override
	public void onHeartBeat() {

	}

	@Override
	public void onMoveForwardOrBackward(Role role) {

	}

	@Override
	public void onMoveLeftwardOrLeftward(Role role) {

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
