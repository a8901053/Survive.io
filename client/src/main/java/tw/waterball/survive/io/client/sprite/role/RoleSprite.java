package tw.waterball.survive.io.client.sprite.role;


import tw.waterball.survive.io.client.sprite.Sprite;
import tw.waterball.survive.io.client.sprite.weapon.MagazineSprite;
import tw.waterball.survive.io.client.sprite.weapon.WeaponSlotSprite;

import java.util.List;


public abstract class RoleSprite extends Sprite {
    private int hp;
    private int maxHp;
    private int speed;
    private int money;
    private String name;
    private List<WeaponSlotSprite> weaponSlotSprites;
    private List<MagazineSprite> magazineSprites;
    private WeaponSlotSprite currentWeaponSlotSprite;

    public void injury(int damage) {

    }

    public boolean isDead() {
        return false;
    }
}
