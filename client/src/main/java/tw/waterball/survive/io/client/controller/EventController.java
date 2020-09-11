package tw.waterball.survive.io.client.controller;

import tw.waterball.survive.io.api.api.ClientApi;
import tw.waterball.survive.io.api.dto.RoleDTO;
import tw.waterball.survive.io.api.dto.TerrainDTO;
import tw.waterball.survive.io.api.dto.event.*;
import tw.waterball.survive.io.client.prototypefactory.SpritePrototypeFactory;
import tw.waterball.survive.io.client.view.GameView;

import java.util.List;

public class EventController implements ClientApi {
    private SpriteContainer spriteContainer;
    private SpritePrototypeFactory spritePrototypeFactory;
    private GameView gameView;


    @Override
    public void onLoginSuccessfully(RoleDTO loginPlayerDTO) {

    }

    @Override
    public void onHeartBeat() {

    }

    @Override
    public void onMapLoaded(List<TerrainDTO> terrainDTOs) {

    }

    @Override
    public void onMoveUp(MoveUpEvent moveUpEventEvent) {

    }

    @Override
    public void onMoveDown(MoveDownEvent moveDownEvent) {

    }

    @Override
    public void onMoveLeft(MoveLeftEvent moveLeftEvent) {

    }

    @Override
    public void onMoveRight(MoveRightEvent moveRightEvent) {

    }

    @Override
    public void onInjured(InjuredEvent injuredEvent) {

    }

    @Override
    public void onThrowCurrentWeapon(ThrowCurrentWeaponEvent throwCurrentWeaponEvent) {

    }

    @Override
    public void onSwitchCurrentWeapon(SwitchCurrentWeaponEvent switchCurrentWeaponEvent) {

    }

    @Override
    public void onReload(ReloadEvent reloadEvent) {

    }

    @Override
    public void onWeaponUsed(UseWeaponEvent useWeaponEvent) {

    }

    @Override
    public void onPickUpWeapon(PickUpWeaponEvent pickUpWeaponEvent) {

    }

    @Override
    public void onTurnTo(TurnToEvent turnToEvent) {

    }

    @Override
    public void onDead(DeadEvent deadEvent) {

    }

}
