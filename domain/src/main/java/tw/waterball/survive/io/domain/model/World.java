package tw.waterball.survive.io.domain.model;

import tw.waterball.survive.io.domain.model.gameobject.GameObject;
import tw.waterball.survive.io.domain.model.gameobject.role.Monster;
import tw.waterball.survive.io.domain.model.gameobject.role.Player;
import tw.waterball.survive.io.domain.model.gameobject.role.Role;
import tw.waterball.survive.io.domain.model.gameobject.terrain.Terrain;
import tw.waterball.survive.io.domain.model.prototypefactory.GameObjectPrototypeFactory;

import java.util.List;

public class World {
    private GameObjectPrototypeFactory gameObjectPrototypeFactory;
    private List<GameObject> gameObjects;
    private List<Player> players;
    private List<Monster> monsters;
    private List<Terrain> maps;

    public boolean checkHavePlayersInGame() {
        return false;
    }

    public boolean checkMonsterAliveAmountInRange() {
        return false;
    }

    public boolean checkHaveSamePlayer(String playerName) {
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

    public void addGameObject(GameObject gameObject) {

    }

    public List<GameObject> getGameObjectsNearThisPlayer(Player player) {
        return null;
    }

    public List<Player> getPlayersNearThisGameObject(GameObject gameObject) {
        return null;
    }

    public void removeGameObject(GameObject sprite) {

    }

    public void giveMoneyToRole(int money, Role role) {

    }

    public void roleIsDead(Role deadRole, Role attacker) {

    }

    public void dropThisPlayerWeapon() {

    }

    public void broadCastPlayersNearThisGameObject(GameObject gameObject, Event event) {

    }

    public Player findPlayerByName(String playerName) {
        return null;
    }

    public Player findPlayerById(int playerId) {
        return null;
    }

    public GameObject findGameObjectById(int id) {
        return null;
    }

}
