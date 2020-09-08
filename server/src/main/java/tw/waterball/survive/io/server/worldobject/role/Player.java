package tw.waterball.survive.io.server.worldobject.role;


import tw.waterball.survive.io.router.protocol.api.ClientApi;

import java.util.List;

public class Player extends Role implements ClientApi {
    private final ClientApi clientApi;

    public Player(ClientApi clientApi) {
        this.clientApi = clientApi;
    }

    public void reload() {

    }

    @Override
    public void onLoginSuccessfully(List<Object> map, List<Object> playersInViewPort, Object player) {
        clientApi.onLoginSuccessfully(map, playersInViewPort, player);
    }

    @Override
    public void onHeartBeat() {
        clientApi.onHeartBeat();
    }

    @Override
    public void onMoveForward(int roleId, int roleY) {
        clientApi.onMoveForward(roleId, roleY);
    }

    @Override
    public void onMoveBackward(int roleId, int roleY) {
        clientApi.onMoveBackward(roleId, roleY);
    }

    @Override
    public void onMoveLeftward(int roleId, int roleX) {
        clientApi.onMoveLeftward(roleId, roleX);
    }

    @Override
    public void onMoveRightward(int roleId, int roleX) {
        clientApi.onMoveRightward(roleId, roleX);
    }

    @Override
    public void onInjured(int id, int damage) {
        clientApi.onInjured(id, damage);
    }

    @Override
    public void onThrowCurrentWeapon(int roleId, int currentWeaponId) {
        clientApi.onThrowCurrentWeapon(roleId, currentWeaponId);
    }

    @Override
    public void onSwitchWeapon(int roleId, int weaponSlotIndex) {
        clientApi.onSwitchWeapon(roleId, weaponSlotIndex);
    }

    @Override
    public void onReload(int roleId) {
        clientApi.onReload(roleId);
    }

    @Override
    public void onWeaponUsed(int roleId) {
        clientApi.onWeaponUsed(roleId);
    }

    @Override
    public void onPickUpWeapon(int roleId, int weaponId) {
        clientApi.onPickUpWeapon(roleId, weaponId);
    }

    @Override
    public void onTurn(int roleId, float angle) {
        clientApi.onTurn(roleId, angle);
    }

    @Override
    public void onDead(int id) {
        clientApi.onDead(id);
    }

    @Override
    public void onWorldObjectJoinsPlayerViewPort(Object worldObject) {
        clientApi.onWorldObjectJoinsPlayerViewPort(worldObject);
    }
}
