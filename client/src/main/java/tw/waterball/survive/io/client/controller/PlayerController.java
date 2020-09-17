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

package tw.waterball.survive.io.client.controller;


import tw.waterball.survive.io.api.api.ServerApi;
import tw.waterball.survive.io.client.sprite.role.PlayerSprite;
import tw.waterball.survive.io.client.sprite.weapon.WeaponSprite;
import tw.waterball.survive.io.client.view.GameView;

public class PlayerController {
    private PlayerSprite clientPlayerSprite;
    private WeaponSprite playerCurrentWeaponSprite;
    private GameView gameView;
    private SpriteContainer spriteContainer;
    private ServerApi serverApi;


    public void usePlayerWeapon() {

    }

    public void reloadPlayerGun() {

    }

    public void turnPlayerAngleTo(float angle) {

    }

    public void movePlayerUp() {

    }

    public void movePlayerLeft() {

    }

    public void movePlayerRight() {

    }

    public void movePlayerDown() {

    }

    public void throwPlayerCurrentWeapon() {

    }

    public void switchPlayerCurrentWeapon(int weaponSlotIndex) {

    }


    public WeaponSprite getCurrentPlayerWeapon() {
        return null;
    }

    public void setCurrentWeapon(WeaponSprite weaponSprite) {

    }

}

