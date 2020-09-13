package tw.waterball.survive.io.server.worldobject.bullet;

import tw.waterball.survive.io.server.worldobject.WorldObject;

public class Bullet extends WorldObject {
    private int damage;
    private int shootingRange;

    public Bullet(int bulletWidth, int bulletHeight) {
        super(bulletWidth, bulletHeight);
    }
}
