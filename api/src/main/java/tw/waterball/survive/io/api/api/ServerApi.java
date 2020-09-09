package tw.waterball.survive.io.api.api;

import tw.waterball.survive.io.api.dto.request.*;

public interface ServerApi {

    void useWeapon(UseWeaponRequest useWeaponRequest);

    void reload(ReloadRequest reloadRequest);

    void turn(TurnRequest turnRequest);

    void moveForward(MoveForwardRequest moveForwardRequest);

    void moveLeftward(MoveLeftwardRequest moveLeftwardRequest);

    void moveRightward(MoveRightwardRequest moveRightwardRequest);

    void moveBackward(MoveBackwardRequest moveBackwardRequest);

    void pickUpWeapon(PickUpWeaponRequest pickUpWeaponRequest);

    void playerThrowCurrentWeapon(ThrowCurrentWeaponRequest throwCurrentWeaponRequest);

    void switchWeapon(SwitchWeaponRequest switchWeaponRequest);

    void login(LoginRequest loginRequest);

}
