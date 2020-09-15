package tw.waterball.survive.io.game.sprite.weapon;


import tw.waterball.survive.io.game.sprite.Sprite;
import tw.waterball.survive.io.game.sprite.role.Role;

public abstract class Weapon extends Sprite {
    private WeaponName weaponName;
    private Role weaponHolder;
    private int damage;

    public Weapon(int weaponWidth, int weaponHeight) {
        super(weaponWidth, weaponHeight);
    }

    public abstract void useWeapon();
}
