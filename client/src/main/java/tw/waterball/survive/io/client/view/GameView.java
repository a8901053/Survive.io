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


import tw.waterball.survive.io.client.controller.PlayerController;
import tw.waterball.survive.io.client.sprite.Sprite;
import tw.waterball.survive.io.client.sprite.role.RoleSprite;
import tw.waterball.survive.io.client.sprite.weapon.WeaponSprite;

import java.util.List;


public abstract class GameView {
    private State state;
    private PlayerController playerController;

    public abstract void launch();

    public abstract void onRender(List<Sprite> sprites);

    public abstract void onWeaponUsed(WeaponSprite weaponSprite);

    public abstract void onPlayerLoginSuccessfully();

    public abstract void onPlayerNameExists();

    public abstract void onNoBulletsToReload();

    public abstract void onMagazineIsFull();

    public abstract void onPickUpWeapon(RoleSprite roleSprite);

    public abstract void onThrowWeapon(RoleSprite roleSprite);

    public abstract void onInjured(RoleSprite roleSprite, int damage);

    public abstract void onSwitchCurrentWeapon(RoleSprite roleSprite);

    public abstract void onReload(RoleSprite roleSprite);

    public abstract void onDead(RoleSprite roleSprite);

    public abstract void onMove(RoleSprite roleSprite);

    public abstract void onTurn(RoleSprite roleSprite);
}