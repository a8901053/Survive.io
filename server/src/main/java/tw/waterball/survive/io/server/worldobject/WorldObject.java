package tw.waterball.survive.io.server.worldobject;

import tw.waterball.survive.io.server.world.World;

import java.awt.*;


public abstract class WorldObject {
    protected Rectangle body = new Rectangle(0, 0, 0, 0);
    protected World world;
    protected float angle;
    private int id;

    public WorldObject() {

    }

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
