package tw.waterball.survive.io.server;

import tw.waterball.survive.io.server.worldobject.WorldObject;
import tw.waterball.survive.io.server.worldobject.role.Player;
import tw.waterball.survive.io.server.worldobject.role.Role;
import tw.waterball.survive.io.server.worldobject.weapon.Weapon;

public interface Client {

    void onLoginSuccessfully();

    void onHeartBeat();

    void onMoveForward(Role role);

    void onMoveBackward(Role role);

    void onMoveLeftward(Role role);

    void onMoveRightward(Role role);

    void onInjury(Role role, int damage);

    void onThrowWeapon(Weapon weapon);

    void onSwitchWeapon(Role role);

    void onReload(Role role);

    void onWeaponUsed(Role role);

    void onPickUpWeapon(Player player, Weapon weapon);

    void onTurn(Role role);

    void onDead(Role role);

    void onWorldObjectAddPlayerSight(WorldObject worldObject);

}
