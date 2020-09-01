package tw.waterball.survive.io.server.model.gameobject.weapon;

import tw.waterball.survive.io.server.model.gameobject.bullet.Bullet;
import java.util.Collection;

public class Gun extends Weapon {
	private int totalBullet;
	private int currentBullet;
	private int inOneShotBullet;
	private Collection<Bullet> bullet;
	private Magazine magazine;

	public void reload(Magazine magazine) {

	}

	public void attack() {

	}
}
