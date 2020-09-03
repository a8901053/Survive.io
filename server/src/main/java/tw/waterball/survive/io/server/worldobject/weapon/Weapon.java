package tw.waterball.survive.io.server.worldobject.weapon;

import tw.waterball.survive.io.server.worldobject.WorldObject;
import tw.waterball.survive.io.server.worldobject.role.Role;

public abstract class Weapon extends WorldObject {
	private WeaponName weaponName;
	private Role currentHeldThisWeaponRole;
	private int damage;
	private boolean isInFloor;

	public abstract void attack();

	public void setIsInFloor(boolean isInFloor) {

	}

}
