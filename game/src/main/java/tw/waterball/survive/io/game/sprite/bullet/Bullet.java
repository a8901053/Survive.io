package tw.waterball.survive.io.game.sprite.bullet;

import tw.waterball.survive.io.game.sprite.Sprite;

public class Bullet extends Sprite {
    private int damage;
    private int shootingRange;

    public Bullet(int bulletWidth, int bulletHeight) {
        super(bulletWidth, bulletHeight);
    }

    @Override
    public void onUpdate() {

    }
}
