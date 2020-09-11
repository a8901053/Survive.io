package tw.waterball.survive.io.api.api;

import tw.waterball.survive.io.api.dto.request.*;

public interface ServerApi {

    void useWeapon(UseWeaponRequest useWeaponRequest);

    void reload(ReloadRequest reloadRequest);

    void turnTo(TurnToRequest turnToRequest);

    void moveUp(MoveUpRequest moveUpRequest);

    void moveLeft(MoveLeftRequest moveLeftRequest);

    void moveRight(MoveRightRequest moveRightRequest);

    void moveDown(MoveDownRequest moveDownRequest);

    void pickUpWeapon(PickUpWeaponRequest pickUpWeaponRequest);

    void playerThrowCurrentWeapon(ThrowCurrentWeaponRequest throwCurrentWeaponRequest);

    void switchCurrentWeapon(SwitchCurrentWeaponRequest switchCurrentWeaponRequestWeaponRequest);

    void login(LoginRequest loginRequest);

}
