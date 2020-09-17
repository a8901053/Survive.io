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

package tw.waterball.survive.io.client.sprite.role;


import tw.waterball.survive.io.client.sprite.Sprite;
import tw.waterball.survive.io.client.sprite.weapon.MagazineSprite;
import tw.waterball.survive.io.client.sprite.weapon.WeaponSlotSprite;

import java.util.List;


public abstract class RoleSprite extends Sprite {
    private int hp;
    private int maxHp;
    private int speed;
    private int money;
    private String name;
    private List<WeaponSlotSprite> weaponSlotSprites;
    private List<MagazineSprite> magazineSprites;
    private WeaponSlotSprite currentWeaponSlotSprite;

    public void injure(int damage) {

    }

    public boolean isDead() {
        return false;
    }
}
