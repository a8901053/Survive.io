package tw.waterball.survive.io.poc.sprite;

import tw.waterball.survive.io.poc.world.World;

import java.awt.*;


public abstract class Sprite {
    protected Rectangle body;
    protected World world;
    protected float angle;
    private int id;

    public Sprite(int spriteWidth, int spriteHeight) {
        this.body = new Rectangle(new Dimension(spriteWidth, spriteHeight));
    }

    public abstract void onUpdate();

    public int getX() {
        return body.x;
    }

    public void setX(int x) {
        body.setLocation(x, body.y);
    }

    public int getY() {
        return body.y;
    }

    public void setY(int y) {
        body.setLocation(body.x, y);
    }

    public float getAngle() {
        return angle;
    }

}
