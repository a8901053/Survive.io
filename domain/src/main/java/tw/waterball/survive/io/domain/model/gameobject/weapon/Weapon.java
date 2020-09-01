package tw.waterball.survive.io.domain.model.gameobject.weapon;

import tw.waterball.survive.io.domain.model.gameobject.GameObject;
import tw.waterball.survive.io.domain.model.gameobject.role.Role;

public abstract class Weapon extends GameObject {
	private WeaponName weaponName;
	private int damage;
	private Role currentHeldThisWeaponRole;
	private boolean isInFloor;
	private boolean isInBody;

	public abstract void attack();

	public void setIsInFloor(boolean isInFloor) {

	}

}
