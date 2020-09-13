package tw.waterball.survive.io.server.worldobject.weapon;

/**
 * @author - a89010531111@gmail.com
 */
public class DroppedWeapon {
    private final Weapon weapon;

    public DroppedWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }
}
