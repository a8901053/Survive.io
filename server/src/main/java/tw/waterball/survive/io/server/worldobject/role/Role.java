package tw.waterball.survive.io.server.worldobject.role;

import tw.waterball.survive.io.server.worldobject.WorldObject;
import tw.waterball.survive.io.server.worldobject.weapon.Magazine;
import tw.waterball.survive.io.server.worldobject.weapon.Weapon;
import tw.waterball.survive.io.server.worldobject.weapon.WeaponSlot;

import java.util.List;

public abstract class Role extends WorldObject {
	private String name;
	private int money;
	private int speed;
	private int def;
	private int hp;
	private int maxHp;
	private List<WeaponSlot> weaponSlots;
	private List<Magazine> magazines;
	private WeaponSlot currentWeaponSlot;

	public void turn(float angle) {

	}

	public void moveBackward() {

	}

	public void moveForward() {

	}

	public void moveLeftward() {

	}

	public void moveRightward() {

	}

	public void reload() {

	}

	public void useWeapon() {

	}

	public void switchWeapon() {

	}

	public void injury(Role attackRole, int damage) {

	}

	public boolean isDead() {
		return false;
	}

	public void giveAttackerMoney(Role attackRole) {

	}

	public void dropRoleWeapon() {

	}

	public void setCurrentWeapon(Weapon weapon) {

	}

	public void throwWeapon() {

	}

}
