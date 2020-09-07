package tw.waterball.survive.io.router.protocol.api;


public interface ClientApi extends Api {

    void onLoginSuccessfully(byte[] map, byte[] player);

    void onHeartBeat();

    void onMoveForward(int roleId, int roleY);

    void onMoveBackward(int roleId, int roleY);

    void onMoveLeftward(int roleId, int roleX);

    void onMoveRightward(int roleId, int roleX);

    void onInjured(int id, int damage);

    void onThrowCurrentWeapon(int roleId, int currentWeaponId);

    void onSwitchWeapon(int roleId, int weaponSlotIndex);

    void onReload(int roleId);

    void onWeaponUsed(int roleId);

    void onPickUpWeapon(int roleId, int weaponId);

    void onTurn(int roleId, float angle);

    void onDead(int id);

    void onWorldObjectJoinsPlayerViewPort(byte[] worldObject);
}
