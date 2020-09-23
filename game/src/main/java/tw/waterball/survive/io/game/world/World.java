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
import tw.waterball.survive.io.game.sprite.role.Player;
import tw.waterball.survive.io.game.sprite.role.Role;

import java.util.List;

public class World {
    private SpriteContainer spriteContainer;

    public boolean containsPlayers() {
        return false;
    }

    public boolean isFullMonstersInMap() {
        return false;
    }

    public boolean isPlayerNameExists(String playerName) {
        return false;
    }

    public void setUpNewWorld() {

    }

    public void setUpNewMonster() {

    }

    public void addPlayer(Player player) {

    }

    public void addNewPlayer(String playerName) {

    }

    public void addSprite(Sprite sprite) {

    }

    public List<Sprite> getSpritesOfAroundPlayer(Player player) {
        return null;
    }

    public List<Player> getPlayersOfAroundSprite(Sprite sprite) {
        return null;
    }

    public void removeSprite(Sprite sprite) {

    }

    public void giveRoleMoney(int money, Role role) {

    }

    public void handleDeadRole(Role deadRole, Role attacker) {

    }

    public void dropRoleWeapon(Role role) {

    }

    public void broadCastPlayersOfAroundSprite(Sprite sprite, Event event) {

    }

    public Player findPlayerByName(String playerName) {
        return null;
    }

    public Player findPlayerById(int playerId) {
        return null;
    }

    public Sprite findSpriteById(int id) {
        return null;
    }

}
