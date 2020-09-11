package tw.waterball.survive.io.client.sprite.weapon;


import tw.waterball.survive.io.client.sprite.Sprite;

public abstract class WeaponSprite extends Sprite {
    private int holderId;
    private String soundPath;

    public abstract void useWeapon();
}
