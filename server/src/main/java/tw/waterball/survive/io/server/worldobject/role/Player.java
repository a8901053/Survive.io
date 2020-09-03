package tw.waterball.survive.io.server.worldobject.role;

import tw.waterball.survive.io.server.worldobject.WorldObject;
import tw.waterball.survive.io.server.worldobject.weapon.Weapon;
import tw.waterball.survive.io.server.Client;
import tw.waterball.survive.io.server.ClientSocketAdapter;

public class Player extends Role implements Client {
    private final Client client = new ClientSocketAdapter();

    public void reload() {

    }

    @Override
    public void onLoginSuccess() {
        client.onLoginSuccess();
    }

    @Override
    public void onHeartBeat() {
        client.onHeartBeat();
    }

    @Override
    public void onMoveForwardOrBackward(Role role) {
        client.onMoveForwardOrBackward(role);
    }

    @Override
    public void onMoveLeftwardOrLeftward(Role role) {
        client.onMoveLeftwardOrLeftward(role);
    }

    @Override
    public void onInJury(Role role, int damage) {
        client.onInJury(role, damage);
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
    public void onAttack(Role role) {
        client.onAttack(role);
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
    public void onUpdate(WorldObject gameObject) {
        client.onUpdate(gameObject);
    }
}
