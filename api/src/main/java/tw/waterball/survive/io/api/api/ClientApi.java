package tw.waterball.survive.io.api.api;


import tw.waterball.survive.io.api.dto.RoleDTO;
import tw.waterball.survive.io.api.dto.TerrainDTO;
import tw.waterball.survive.io.api.dto.event.*;

import java.util.List;

/**
 * @author - a89010531111@gmail.com
 */
public interface ClientApi {

    void onPlayerLoginSuccessfully(RoleDTO loginPlayerDTO);

    void onPlayerHeartBeat();

    void onPlayerMapLoaded(List<TerrainDTO> terrainDTOs);

    void onRoleMovesUp(RoleMovesUpEvent event);

    void onRoleMovesDown(RoleMovesDownEvent event);

    void onRoleMovesLeft(RoleMovesLeftEvent event);

    void onRoleMovesRight(RoleMovesRightEvent event);

    void onRoleInjured(RoleInjuredEvent event);

    void onRoleThrowsCurrentWeapon(RoleThrowsCurrentWeaponEvent event);

    void onRoleSwitchesCurrentWeapon(RoleSwitchesCurrentWeaponEvent event);

    void onRoleReloadsGun(RoleReloadsGunEvent event);

    void onRoleWeaponUsed(RoleUsesWeaponEvent event);

    void onRolePicksUpWeapon(RolePicksUpWeaponEvent event);

    void onRoleTurnsAngleTo(RoleTurnsAngleToEvent event);

    void onRoleDies(RoleDiesEvent event);

}
