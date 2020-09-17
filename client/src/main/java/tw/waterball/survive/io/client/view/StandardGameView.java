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

package tw.waterball.survive.io.client.view;

import tw.waterball.survive.io.client.sprite.Sprite;
import tw.waterball.survive.io.client.sprite.role.RoleSprite;
import tw.waterball.survive.io.client.sprite.weapon.WeaponSprite;

import java.util.List;

/**
 * @author - c11037at@gmail.com
 */
public class StandardGameView extends GameView {

    @Override
    public void launch() {

    }

    @Override
    public void onRender(List<Sprite> sprites) {

    }

    @Override
    public void onWeaponUsed(WeaponSprite weaponSprite) {

    }

    @Override
    public void onPlayerLoginSuccessfully() {

    }

    @Override
    public void onPlayerNameExists() {

    }

    @Override
    public void onNoBulletsToReload() {

    }

    @Override
    public void onMagazineIsFull() {

    }

    @Override
    public void onPickUpWeapon(RoleSprite roleSprite) {

    }

    @Override
    public void onThrowWeapon(RoleSprite roleSprite) {

    }

    @Override
    public void onInjured(RoleSprite roleSprite, int damage) {

    }

    @Override
    public void onSwitchCurrentWeapon(RoleSprite roleSprite) {

    }

    @Override
    public void onReload(RoleSprite roleSprite) {

    }

    @Override
    public void onDead(RoleSprite roleSprite) {

    }

    @Override
    public void onMove(RoleSprite roleSprite) {

    }

    @Override
    public void onTurn(RoleSprite roleSprite) {

    }
}

