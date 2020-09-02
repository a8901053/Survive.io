package tw.waterball.survive.io.domain.model.gameobject.role;

import tw.waterball.survive.io.domain.model.gameobject.GameObject;
import tw.waterball.survive.io.domain.model.gameobject.weapon.Magazine;
import tw.waterball.survive.io.domain.model.gameobject.weapon.Weapon;
import tw.waterball.survive.io.domain.model.gameobject.weapon.WeaponSlot;

import java.util.List;

public abstract class Role extends GameObject {
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

	public void sufferInjury(Role attackRole, int damage) {

	}

	public boolean isDead() {
		return false;
	}

	public void giveThisRoleMoneyToAttacker(Role attackRole) {

	}

	public void dropThisRoleWeapon() {

	}

	public void setCurrentWeapon(Weapon weapon) {

	}

	public void throwWeapon() {

	}

}
