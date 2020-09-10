package tw.waterball.survive.io.client.sprite.weapon;


import tw.waterball.survive.io.client.sprite.Sprite;

public abstract class WeaponSprite extends Sprite {
    private int holderId;
    private boolean isOnTheGround;
    private String soundPath;

    public void setOnTheGround(boolean onTheGround) {
        isOnTheGround = onTheGround;
    }

    public abstract void useWeapon();
}
