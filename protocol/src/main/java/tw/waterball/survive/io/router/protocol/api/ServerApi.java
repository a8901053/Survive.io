package tw.waterball.survive.io.router.protocol.api;

public interface ServerApi extends Api {

    void useWeapon(int playerId);

    void reload(int playerId);

    void turn(int playerId, float angle);

    void moveForward(int playerId);

    void moveLeftward(int playerId);

    void moveRightward(int playerId);

    void moveBackward(int playerId);

    void pickUpWeapon(int playerId, int weaponId);

    void playerCurrentThrowWeapon(int playerId, int currentWeaponId);

    void switchWeapon(int playerId, int weaponSlotIndex);

}
