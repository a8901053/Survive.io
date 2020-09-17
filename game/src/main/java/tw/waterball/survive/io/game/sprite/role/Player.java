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

package tw.waterball.survive.io.game.sprite.role;

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
