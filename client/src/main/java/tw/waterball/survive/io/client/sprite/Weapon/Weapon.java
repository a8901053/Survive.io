package tw.waterball.survive.io.client.sprite.Weapon;


import tw.waterball.survive.io.client.sprite.Sprite;

public abstract class Weapon extends Sprite {
    private int heldPlayerId;
    private boolean isInFloor;
    private boolean isInBody;
    private String soundPath;

    public void setIsInFloor(boolean isInFloor) {

    }

    public void setIsInBody(boolean isInBody) {

    }

    public abstract void attack();

}
