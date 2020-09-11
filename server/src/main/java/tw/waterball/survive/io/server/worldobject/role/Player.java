package tw.waterball.survive.io.server.worldobject.role;


import tw.waterball.survive.io.api.api.ClientApi;
import tw.waterball.survive.io.api.dto.RoleDTO;
import tw.waterball.survive.io.api.dto.TerrainDTO;
import tw.waterball.survive.io.api.dto.event.*;

import java.util.List;

public class Player extends Role implements ClientApi {
    private final static int WEAPON_SLOTS_AMOUNT = 2;
    private final ClientApi clientApi;

    public Player(ClientApi clientApi) {
        super(WEAPON_SLOTS_AMOUNT);
        this.clientApi = clientApi;
    }

    @Override
    public void onLoginSuccessfully(RoleDTO loginPlayerDTO) {
        clientApi.onLoginSuccessfully(loginPlayerDTO);
    }

    @Override
    public void onHeartBeat() {
        clientApi.onHeartBeat();
    }

    @Override
    public void onMapLoaded(List<TerrainDTO> terrainDTOs) {
        clientApi.onMapLoaded(terrainDTOs);
    }

    @Override
    public void onMoveUp(MoveUpEvent moveUpEventEvent) {
        clientApi.onMoveUp(moveUpEventEvent);
    }

    @Override
    public void onMoveDown(MoveDownEvent moveDownEvent) {
        clientApi.onMoveDown(moveDownEvent);
    }

    @Override
    public void onMoveLeft(MoveLeftEvent moveLeftEvent) {
        clientApi.onMoveLeft(moveLeftEvent);
    }

    @Override
    public void onMoveRight(MoveRightEvent moveRightEvent) {
        clientApi.onMoveRight(moveRightEvent);
    }

    @Override
    public void onInjured(InjuredEvent injuredEvent) {
        clientApi.onInjured(injuredEvent);
    }

    @Override
    public void onThrowCurrentWeapon(ThrowCurrentWeaponEvent throwCurrentWeaponEvent) {
        clientApi.onThrowCurrentWeapon(throwCurrentWeaponEvent);
    }

    @Override
    public void onSwitchCurrentWeapon(SwitchCurrentWeaponEvent switchCurrentWeaponEvent) {
        clientApi.onSwitchCurrentWeapon(switchCurrentWeaponEvent);
    }

    @Override
    public void onReload(ReloadEvent reloadEvent) {
        clientApi.onReload(reloadEvent);
    }

    @Override
    public void onWeaponUsed(UseWeaponEvent useWeaponEvent) {
        clientApi.onWeaponUsed(useWeaponEvent);
    }

    @Override
    public void onPickUpWeapon(PickUpWeaponEvent pickUpWeaponEvent) {
        clientApi.onPickUpWeapon(pickUpWeaponEvent);
    }

    @Override
    public void onTurnTo(TurnToEvent turnToEvent) {
        clientApi.onTurnTo(turnToEvent);
    }

    @Override
    public void onDead(DeadEvent deadEvent) {
        clientApi.onDead(deadEvent);
    }
}
