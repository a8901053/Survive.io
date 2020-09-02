package tw.waterball.survive.io.client.sprite.role;


import tw.waterball.survive.io.client.sprite.Sprite;
import tw.waterball.survive.io.client.sprite.weapon.Magazine;
import tw.waterball.survive.io.client.sprite.weapon.WeaponSlot;

import java.util.List;


public abstract class Role extends Sprite {
    private int hp;
    private int maxHp;
    private int speed;
    private int money;
    private String name;
    private List<WeaponSlot> weaponSlots;
    private List<Magazine> magazines;
    private WeaponSlot currentWeaponSlot;

    public void sufferJury(int damage) {

    }

    public boolean isDead() {
        return false;
    }
}
