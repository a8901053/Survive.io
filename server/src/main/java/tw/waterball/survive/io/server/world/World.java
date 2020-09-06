package tw.waterball.survive.io.server.world;

import tw.waterball.survive.io.server.prototypefactory.WorldObjectPrototypeFactory;
import tw.waterball.survive.io.server.worldobject.WorldObject;
import tw.waterball.survive.io.server.worldobject.role.Monster;
import tw.waterball.survive.io.server.worldobject.role.Player;
import tw.waterball.survive.io.server.worldobject.role.Role;
import tw.waterball.survive.io.server.worldobject.terrain.Terrain;

import java.util.List;

public class World {
    private WorldObjectPrototypeFactory worldObjectPrototypeFactory;
    private List<WorldObject> worldObjects;
    private List<Player> players;
    private List<Monster> monsters;
    private List<Terrain> map;

    public boolean checkHavePlayersInGame() {
        return false;
    }

    public boolean isAliveMonsterAmountReachTheUpperLimitInMap() {
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

    public void addWorldObject(WorldObject worldObject) {

    }

    public List<WorldObject> getWorldObjectsOfAroundPlayer(Player player) {
        return null;
    }

    public List<Player> getPlayersOfAroundWorldObject(WorldObject worldObject) {
        return null;
    }

    public void removeWorldObject(WorldObject worldObject) {

    }

    public void giveRoleMoney(int money, Role role) {

    }

    public void handleDeadRole(Role deadRole, Role attacker) {

    }

    public void dropRoleWeapon(Role role) {

    }

    public void broadCastPlayersOfAroundWorldObject(WorldObject worldObject, Event event) {

    }

    public Player findPlayerByName(String playerName) {
        return null;
    }

    public Player findPlayerById(int playerId) {
        return null;
    }

    public WorldObject findWorldObjectById(int id) {
        return null;
    }

}
