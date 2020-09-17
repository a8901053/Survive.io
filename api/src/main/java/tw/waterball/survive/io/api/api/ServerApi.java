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

import tw.waterball.survive.io.api.dto.request.*;

/**
 * @author - a89010531111@gmail.com
 */
public interface ServerApi {

    void usePlayerWeapon(UsePlayerWeaponRequest request);

    void reloadPlayerGun(ReloadPlayerGunRequest request);

    void turnPlayerAngleTo(TurnPlayerAngleToRequest request);

    void movePlayerUp(MovePlayerUpRequest request);

    void movePlayerLeft(MovePlayerLeftRequest request);

    void movePlayerRight(MovePlayerRightRequest request);

    void movePlayerDown(MovePlayerDownRequest request);

    void pickUpWeaponToPlayer(PickUpWeaponToPlayerRequest request);

    void throwPlayerCurrentWeapon(ThrowPlayerCurrentWeaponRequest request);

    void switchPlayerCurrentWeapon(SwitchPlayerCurrentWeaponRequest request);

    void login(LoginRequest request);

}
