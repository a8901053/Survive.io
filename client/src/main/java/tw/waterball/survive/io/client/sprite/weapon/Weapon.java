package tw.waterball.survive.io.client.sprite.weapon;


import tw.waterball.survive.io.client.sprite.Sprite;

public abstract class Weapon extends Sprite {
    private int heldPlayerId;
    private boolean isOnFloor;
    private String soundPath;

    public void setIsOnFloor(boolean isOnFloor) {

    }

    public abstract void useWeapon();

}
