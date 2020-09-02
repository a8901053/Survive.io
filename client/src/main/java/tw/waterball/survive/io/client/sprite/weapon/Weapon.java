package tw.waterball.survive.io.client.sprite.weapon;


import tw.waterball.survive.io.client.sprite.Sprite;

public abstract class Weapon extends Sprite {
    private int heldPlayerId;
    private boolean isInFloor;
    private boolean isInBody;
    private String soundPath;

    public void setIsInFloor(boolean isInFloor) {

    }

    public abstract void attack();

}
