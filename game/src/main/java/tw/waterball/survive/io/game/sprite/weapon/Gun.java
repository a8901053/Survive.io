package tw.waterball.survive.io.game.sprite.weapon;

import java.util.List;

public class Gun extends Weapon {
    private int bulletsShotAtOnce;
    private Magazine magazine;

    public Gun(int gunWidth, int gunHeight) {
        super(gunWidth, gunHeight);
    }

    @Override
    public void onUpdate() {

    }

    public void reload(List<Magazine> magazines) {
    }

    @Override
    public void useWeapon() {

    }
}
