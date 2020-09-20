package tw.waterball.survive.io.poc.sprite.role;

import tw.waterball.survive.io.api.api.ClientApi;
import tw.waterball.survive.io.api.dto.RoleDTO;
import tw.waterball.survive.io.api.dto.TerrainDTO;
import tw.waterball.survive.io.api.dto.event.*;

import java.util.List;

/**
 * @author - a89010531111@gmail.com
 */
public class Player extends Role implements ClientApi {
    private final static int WEAPON_SLOTS_SIZE = 2;
    private final ClientApi clientApi;

    public Player(int playerWidth, int playerHeight, ClientApi clientApi) {
        super(WEAPON_SLOTS_SIZE, playerWidth, playerHeight);
        this.clientApi = clientApi;
    }

    @Override
    public void onPlayerLoginSuccessfully(RoleDTO loginPlayerDTO) {
        clientApi.onPlayerLoginSuccessfully(loginPlayerDTO);
    }

    @Override
    public void onPlayerHeartBeat() {
        clientApi.onPlayerHeartBeat();
    }

    @Override
    public void onPlayerMapLoaded(List<TerrainDTO> terrainDTOs) {
        clientApi.onPlayerMapLoaded(terrainDTOs);
    }

    @Override
    public void onRoleMovesUp(RoleMovesUpEvent event) {
        clientApi.onRoleMovesUp(event);
    }

    @Override
    public void onRoleMovesDown(RoleMovesDownEvent event) {
        clientApi.onRoleMovesDown(event);
    }

    @Override
    public void onRoleMovesLeft(RoleMovesLeftEvent event) {
        clientApi.onRoleMovesLeft(event);
    }

    @Override
    public void onRoleMovesRight(RoleMovesRightEvent event) {
        clientApi.onRoleMovesRight(event);
    }

    @Override
    public void onRoleInjured(RoleInjuredEvent event) {
        clientApi.onRoleInjured(event);
    }

    @Override
    public void onRoleThrowsCurrentWeapon(RoleThrowsCurrentWeaponEvent event) {
        clientApi.onRoleThrowsCurrentWeapon(event);
    }

    @Override
    public void onRoleSwitchesCurrentWeapon(RoleSwitchesCurrentWeaponEvent event) {
        clientApi.onRoleSwitchesCurrentWeapon(event);
    }

    @Override
    public void onRoleReloadsGun(RoleReloadsGunEvent event) {
        clientApi.onRoleReloadsGun(event);
    }

    @Override
    public void onRoleWeaponUsed(RoleUsesWeaponEvent event) {
        clientApi.onRoleWeaponUsed(event);
    }

    @Override
    public void onRolePicksUpWeapon(RolePicksUpWeaponEvent event) {
        clientApi.onRolePicksUpWeapon(event);
    }

    @Override
    public void onRoleTurnsAngleTo(RoleTurnsAngleToEvent event) {
        clientApi.onRoleTurnsAngleTo(event);
    }

    @Override
    public void onRoleDies(RoleDiesEvent event) {
        clientApi.onRoleDies(event);
    }

    @Override
    public void onUpdate() {

    }
}
