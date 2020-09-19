package tw.waterball.survive.io.client.controller;

import tw.waterball.survive.io.api.api.ClientApi;
import tw.waterball.survive.io.api.dto.RoleDTO;
import tw.waterball.survive.io.api.dto.TerrainDTO;
import tw.waterball.survive.io.api.dto.event.*;
import tw.waterball.survive.io.client.view.GameView;
import tw.waterball.survive.io.game.world.SpriteContainer;

import java.util.List;

public class EventController implements ClientApi {
    private SpriteContainer spriteContainer;
    private GameView gameView;

    public void setSpriteContainer(SpriteContainer spriteContainer) {
        this.spriteContainer = spriteContainer;
    }

    @Override
    public void onPlayerLoginSuccessfully(RoleDTO loginPlayerDTO) {

    }

    @Override
    public void onPlayerHeartBeat() {

    }

    @Override
    public void onPlayerMapLoaded(List<TerrainDTO> terrainDTOs) {

    }

    @Override
    public void onRoleMovesUp(RoleMovesUpEvent event) {

    }

    @Override
    public void onRoleMovesDown(RoleMovesDownEvent event) {

    }

    @Override
    public void onRoleMovesLeft(RoleMovesLeftEvent event) {

    }

    @Override
    public void onRoleMovesRight(RoleMovesRightEvent event) {

    }

    @Override
    public void onRoleInjured(RoleInjuredEvent event) {

    }

    @Override
    public void onRoleThrowsCurrentWeapon(RoleThrowsCurrentWeaponEvent event) {

    }

    @Override
    public void onRoleSwitchesCurrentWeapon(RoleSwitchesCurrentWeaponEvent event) {

    }

    @Override
    public void onRoleReloadsGun(RoleReloadsGunEvent event) {

    }

    @Override
    public void onRoleWeaponUsed(RoleUsesWeaponEvent event) {

    }

    @Override
    public void onRolePicksUpWeapon(RolePicksUpWeaponEvent event) {

    }

    @Override
    public void onRoleTurnsAngleTo(RoleTurnsAngleToEvent event) {

    }

    @Override
    public void onRoleDies(RoleDiesEvent event) {

    }
}
