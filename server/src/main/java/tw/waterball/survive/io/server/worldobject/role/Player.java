package tw.waterball.survive.io.server.worldobject.role;

import tw.waterball.survive.io.server.Client;
import tw.waterball.survive.io.server.ClientSocketAdapter;
import tw.waterball.survive.io.server.worldobject.WorldObject;
import tw.waterball.survive.io.server.worldobject.weapon.Weapon;

public class Player extends Role implements Client {
    private final Client client = new ClientSocketAdapter();

    public void reload() {

    }

    @Override
    public void onLoginSuccessfully() {
        client.onLoginSuccessfully();
    }

    @Override
    public void onHeartBeat() {
        client.onHeartBeat();
    }

    @Override
    public void onMoveForward(Role role) {

        client.onMoveForward(role);
    }

    @Override
    public void onMoveBackward(Role role) {
        client.onMoveBackward(role);
    }

    @Override
    public void onMoveLeftward(Role role) {
        client.onMoveLeftward(role);
    }

    @Override
    public void onMoveRightward(Role role) {
        client.onMoveRightward(role);
    }

    @Override
    public void onInjury(Role role, int damage) {
        client.onInjury(role, damage);
    }

    @Override
    public void onThrowWeapon(Weapon weapon) {
        client.onThrowWeapon(weapon);
    }

    @Override
    public void onSwitchWeapon(Role role) {
        client.onSwitchWeapon(role);
    }

    @Override
    public void onReload(Role role) {
        client.onReload(role);
    }

    @Override
    public void onWeaponUsed(Role role) {
        client.onWeaponUsed(role);
    }

    @Override
    public void onPickUpWeapon(Player player, Weapon weapon) {
        client.onPickUpWeapon(player, weapon);
    }

    @Override
    public void onTurn(Role role) {
        client.onTurn(role);
    }

    @Override
    public void onDead(Role role) {
        client.onDead(role);
    }

    @Override
    public void onWorldObjectAddPlayerSight(WorldObject worldObject) {
        client.onWorldObjectAddPlayerSight(worldObject);
    }
}
