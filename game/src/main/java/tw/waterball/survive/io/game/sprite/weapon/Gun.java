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

package tw.waterball.survive.io.game.sprite.weapon;

import java.util.List;

public class Gun extends Weapon {
    private int bulletsShotAtOnce;
    private Magazine magazine;

    public Gun(int gunWidth, int gunHeight) {
        super(gunWidth, gunHeight);
    }

    @Override
    public void onUpdate() {

    }

    public void reload(List<Magazine> magazines) {
    }

    @Override
    public void useWeapon() {

    }
}
