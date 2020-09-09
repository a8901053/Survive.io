package tw.waterball.survive.io.server.worldobject.role;


import tw.waterball.survive.io.api.api.ClientApi;
import tw.waterball.survive.io.api.dto.RoleDTO;
import tw.waterball.survive.io.api.dto.TerrainDTO;
import tw.waterball.survive.io.api.dto.event.*;

import java.util.List;

public class Player extends Role implements ClientApi {
    private final ClientApi clientApi;

    public Player(ClientApi clientApi) {
        this.clientApi = clientApi;
    }

    public void reload() {

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
    public void onMoveForward(MoveForwardEvent moveForwardEvent) {
        clientApi.onMoveForward(moveForwardEvent);
    }

    @Override
    public void onMoveBackward(MoveBackwardEvent moveBackwardEvent) {
        clientApi.onMoveBackward(moveBackwardEvent);
    }

    @Override
    public void onMoveLeftward(MoveLeftwardEvent moveLeftwardEvent) {
        clientApi.onMoveLeftward(moveLeftwardEvent);
    }

    @Override
    public void onMoveRightward(MoveRightwardEvent moveRightwardEvent) {
        clientApi.onMoveRightward(moveRightwardEvent);
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
    public void onSwitchWeapon(SwitchWeaponEvent switchWeaponEvent) {
        clientApi.onSwitchWeapon(switchWeaponEvent);
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
    public void onTurn(TurnEvent turnEvent) {
        clientApi.onTurn(turnEvent);
    }

    @Override
    public void onDead(DeadEvent deadEvent) {
        clientApi.onDead(deadEvent);
    }

}
