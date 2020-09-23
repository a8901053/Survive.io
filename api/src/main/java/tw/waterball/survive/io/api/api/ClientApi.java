/*
 *  Copyright 2020 Johnny850807 (Waterball) 潘冠辰
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

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
