package tw.waterball.survive.io.api.api;


import tw.waterball.survive.io.api.dto.RoleDTO;
import tw.waterball.survive.io.api.dto.TerrainDTO;
import tw.waterball.survive.io.api.dto.event.*;

import java.util.List;

public interface ClientApi {

    void onLoginSuccessfully(RoleDTO loginPlayerDTO);

    void onHeartBeat();

    void onMapLoaded(List<TerrainDTO> terrainDTOs);

    void onMoveUp(MoveUpEvent moveUpEventEvent);

    void onMoveDown(MoveDownEvent moveDownEvent);

    void onMoveLeft(MoveLeftEvent moveLeftEvent);

    void onMoveRight(MoveRightEvent moveRightEvent);

    void onInjured(InjuredEvent injuredEvent);

    void onThrowCurrentWeapon(ThrowCurrentWeaponEvent throwCurrentWeaponEvent);

    void onSwitchCurrentWeapon(SwitchCurrentWeaponEvent switchCurrentWeaponEvent);

    void onReload(ReloadEvent reloadEvent);

    void onWeaponUsed(UseWeaponEvent useWeaponEvent);

    void onPickUpWeapon(PickUpWeaponEvent pickUpWeaponEvent);

    void onTurnTo(TurnToEvent turnToEvent);

    void onDead(DeadEvent deadEvent);

}
