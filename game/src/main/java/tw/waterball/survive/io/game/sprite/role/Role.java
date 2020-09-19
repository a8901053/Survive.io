package tw.waterball.survive.io.game.sprite.role;

import tw.waterball.survive.io.game.sprite.Sprite;
import tw.waterball.survive.io.game.sprite.weapon.Magazine;
import tw.waterball.survive.io.game.sprite.weapon.Weapon;
import tw.waterball.survive.io.game.sprite.weapon.WeaponSlot;

import java.util.List;
import java.util.Optional;

/**
 * @author - a89010531111@gmail.com
 */
public abstract class Role extends Sprite {
    private final WeaponSlot[] weaponSlots;
    private String name;
    private int money;
    private int speed;
    private int def;
    private int hp;
    private int maxHp;
    private List<Magazine> magazines;
    private WeaponSlot currentWeaponSlot;

    public Role(int weaponSlotsSize, int roleWidth, int roleHeight) {
        super(roleWidth, roleHeight);
        weaponSlots = new WeaponSlot[weaponSlotsSize];
        initWeaponSlots();
    }

    private void initWeaponSlots() {
        for (int i = 0; i < weaponSlots.length; i++) {
            weaponSlots[i] = new WeaponSlot();
        }
    }

    public void turnAngleTo(float angle) {
        this.angle = angle;
    }

    public void moveDown() {
        body.setLocation(body.x, body.y + speed);
    }

    public void moveUp() {
        body.setLocation(body.x, body.y - speed);
    }

    public void moveLeft() {
        body.setLocation(body.x - speed, body.y);
    }

    public void moveRight() {
        body.setLocation(body.x + speed, body.y);
    }

    public void useWeapon() {
        Optional.ofNullable(currentWeaponSlot.getWeapon())
                .ifPresent(Weapon::useWeapon);
    }

    public void switchCurrentWeapon(int weaponIndex) {
        currentWeaponSlot = weaponSlots[weaponIndex];
    }

    public void reload() {

    }

    public void throwCurrentWeapon() {

    }

    public void pickUpWeapon() {

    }

    public void injure(Role attackRole, int damage) {
        hp -= damage;
    }

    public boolean isDead() {
        return hp <= 0;
    }

    public void putWeaponToSlot(Weapon weapon, int weaponSlotIndex) {
        weaponSlots[weaponSlotIndex].setWeapon(weapon);
    }

    public Weapon getWeaponBySlotIndex(int weaponSlotIndex) {
        return weaponSlots[weaponSlotIndex].getWeapon();
    }

    public Weapon getCurrentWeapon() {
        return currentWeaponSlot.getWeapon();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
