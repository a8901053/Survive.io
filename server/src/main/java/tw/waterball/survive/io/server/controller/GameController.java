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

package tw.waterball.survive.io.server.controller;

import tw.waterball.survive.io.api.api.ServerApi;
import tw.waterball.survive.io.api.dto.request.*;
import tw.waterball.survive.io.game.world.World;

public class GameController implements ServerApi {
    private World world;


    @Override
    public void usePlayerWeapon(UsePlayerWeaponRequest request) {

    }

    @Override
    public void reloadPlayerGun(ReloadPlayerGunRequest request) {

    }

    @Override
    public void turnPlayerAngleTo(TurnPlayerAngleToRequest request) {

    }

    @Override
    public void movePlayerUp(MovePlayerUpRequest request) {

    }

    @Override
    public void movePlayerLeft(MovePlayerLeftRequest request) {

    }

    @Override
    public void movePlayerRight(MovePlayerRightRequest request) {

    }

    @Override
    public void movePlayerDown(MovePlayerDownRequest request) {

    }

    @Override
    public void pickUpWeaponToPlayer(PickUpWeaponToPlayerRequest request) {

    }

    @Override
    public void throwPlayerCurrentWeapon(ThrowPlayerCurrentWeaponRequest request) {

    }

    @Override
    public void switchPlayerCurrentWeapon(SwitchPlayerCurrentWeaponRequest request) {

    }

    @Override
    public void login(LoginRequest request) {

    }
}
