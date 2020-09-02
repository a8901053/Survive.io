package tw.waterball.survive.io.server;

import tw.waterball.survive.io.domain.model.gameobject.GameObject;
import tw.waterball.survive.io.domain.model.gameobject.role.Player;
import tw.waterball.survive.io.domain.model.gameobject.role.Role;
import tw.waterball.survive.io.domain.model.gameobject.weapon.Weapon;

public interface Client {

    void onLoginSuccess();

    void onHeartBeat();

    void onMoveForwardOrBackward(Role role);

    void onMoveLeftwardOrLeftward(Role role);

    void onSufferJury(Role role, int damage);

    void onThrowWeapon(Weapon weapon);

    void onSwitchWeapon(Role role);

    void onReload(Role role);

    void onAttack(Role role);

    void onPickUpWeapon(Player player, Weapon weapon);

    void onTurn(Role role);

    void onDead(Role role);

    void onUpdate(GameObject gameObject);

}
