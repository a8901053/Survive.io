package tw.waterball.survive.io.server;


import tw.waterball.survive.io.server.worldobject.WorldObject;
import tw.waterball.survive.io.server.worldobject.role.Player;
import tw.waterball.survive.io.server.worldobject.role.Role;
import tw.waterball.survive.io.server.worldobject.weapon.Weapon;

public class ClientSocketAdapter implements Client {

	@Override
	public void onLoginSuccessfully() {

	}

	@Override
	public void onHeartBeat() {

	}

	@Override
	public void onMoveForward(Role role) {

	}

	@Override
	public void onMoveBackward(Role role) {

	}

	@Override
	public void onMoveLeftward(Role role) {

	}

	@Override
	public void onMoveRightward(Role role) {

	}


	@Override
	public void onInjury(Role role, int damage) {

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
	public void onWeaponUsed(Role role) {

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
	public void onWorldObjectAddPlayerSight(WorldObject worldObject) {

	}
}
