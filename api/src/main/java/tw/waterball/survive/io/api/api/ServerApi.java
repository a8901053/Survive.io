package tw.waterball.survive.io.api.api;

import tw.waterball.survive.io.api.dto.request.*;

/**
 * @author - a89010531111@gmail.com
 */
public interface ServerApi {

    void usePlayerWeapon(UsePlayerWeaponRequest request);

    void reloadPlayerGun(ReloadPlayerGunRequest request);

    void turnPlayerAngleTo(TurnPlayerAngleToRequest request);

    void movePlayerUp(MovePlayerUpRequest request);

    void movePlayerLeft(MovePlayerLeftRequest request);

    void movePlayerRight(MovePlayerRightRequest request);

    void movePlayerDown(MovePlayerDownRequest request);

    void pickUpWeaponToPlayer(PickUpWeaponToPlayerRequest request);

    void throwPlayerCurrentWeapon(ThrowPlayerCurrentWeaponRequest request);

    void switchPlayerCurrentWeapon(SwitchPlayerCurrentWeaponRequest request);

    void login(LoginRequest request);

}
