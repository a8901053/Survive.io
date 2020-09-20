package tw.waterball.survive.io.poc.sprite.weapon;


import tw.waterball.survive.io.poc.sprite.Sprite;
import tw.waterball.survive.io.poc.sprite.role.Role;

public abstract class Weapon extends Sprite {
    private WeaponName weaponName;
    private Role weaponHolder;
    private int damage;

    public Weapon(int weaponWidth, int weaponHeight) {
        super(weaponWidth, weaponHeight);
    }

    public abstract void useWeapon();
}
