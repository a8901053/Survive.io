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
