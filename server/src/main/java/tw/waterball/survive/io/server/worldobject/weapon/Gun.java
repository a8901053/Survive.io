package tw.waterball.survive.io.server.worldobject.weapon;

import java.util.List;

public class Gun extends Weapon {
    private int bulletsShotAtOnce;
    private Magazine magazine;

    public Gun(int gunWidth, int gunHeight) {
        super(gunWidth, gunHeight);
    }

    public void reload(List<Magazine> magazines) {
    }

    @Override
    public void useWeapon() {

    }
}
