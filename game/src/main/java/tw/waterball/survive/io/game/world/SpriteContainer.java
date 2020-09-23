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

package tw.waterball.survive.io.game.world;

import tw.waterball.survive.io.game.sprite.Sprite;
import tw.waterball.survive.io.game.sprite.role.Monster;
import tw.waterball.survive.io.game.sprite.role.Player;
import tw.waterball.survive.io.game.sprite.terrain.Terrain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author - a89010531111@gmail.com
 */
public class SpriteContainer {
    private final List<Sprite> sprites = new ArrayList<>();
    private final List<Player> players = new ArrayList<>();
    private final List<Monster> monsters = new ArrayList<>();
    private final List<Terrain> map = new ArrayList<>();

    public List<Sprite> getSprites() {
        return sprites;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public List<Monster> getMonsters() {
        return monsters;
    }

    public List<Terrain> getMap() {
        return map;
    }

    public void addSprite(Sprite sprite) {
        sprites.add(sprite);
    }
}
