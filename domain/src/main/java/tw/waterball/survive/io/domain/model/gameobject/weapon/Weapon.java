package tw.waterball.survive.io.domain.model.gameobject.weapon;

import tw.waterball.survive.io.domain.model.gameobject.GameObject;
import tw.waterball.survive.io.domain.model.gameobject.role.Role;

public abstract class Weapon extends GameObject {
	private WeaponName weaponName;
	private Role currentHeldThisWeaponRole;
	private int damage;
	private boolean isInFloor;

	public abstract void attack();

	public void setIsInFloor(boolean isInFloor) {

	}

}
