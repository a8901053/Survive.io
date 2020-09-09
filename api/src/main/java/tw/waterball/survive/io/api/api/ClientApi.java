package tw.waterball.survive.io.api.api;


import tw.waterball.survive.io.api.dto.RoleDTO;
import tw.waterball.survive.io.api.dto.TerrainDTO;
import tw.waterball.survive.io.api.dto.event.*;

import java.util.List;

public interface ClientApi {

    void onLoginSuccessfully(RoleDTO loginPlayerDTO);

    void onHeartBeat();

    void onMapLoaded(List<TerrainDTO> terrainDTOs);

    void onMoveForward(MoveForwardEvent moveForwardEvent);

    void onMoveBackward(MoveBackwardEvent moveBackwardEvent);

    void onMoveLeftward(MoveLeftwardEvent moveLeftwardEvent);

    void onMoveRightward(MoveRightwardEvent moveRightwardEvent);

    void onInjured(InjuredEvent injuredEvent);

    void onThrowCurrentWeapon(ThrowCurrentWeaponEvent throwCurrentWeaponEvent);

    void onSwitchWeapon(SwitchWeaponEvent switchWeaponEvent);

    void onReload(ReloadEvent reloadEvent);

    void onWeaponUsed(UseWeaponEvent useWeaponEvent);

    void onPickUpWeapon(PickUpWeaponEvent pickUpWeaponEvent);

    void onTurn(TurnEvent turnEvent);

    void onDead(DeadEvent deadEvent);

}
