package tw.waterball.survive.io.poc.game;

import java.awt.*;
import java.util.Set;

/**
 * @author Waterball (johnny850807@gmail.com)
 */
public abstract class Sprite {
    protected float angle;
    protected Rectangle body;

    public abstract void onUpdate();

    public boolean collideWith(Sprite other) {
        return getBody().intersects(other.getBody());
    }

    public Rectangle getBody() {
        return body;
    }

    public float getAngle() {
        return angle;
    }

    public abstract void onCollisionWith(Sprite other);
}
