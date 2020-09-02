package tw.waterball.survive.io.client.clients;

public interface Server {

    void attack(int playerId);
    void reload(int playerId);
    void turn(int playerId,float angle);
    void moveForward(int playerId);
    void moveLeftward(int playerId);
    void moveRightward(int playerId);
    void moveBackward(int playerId);
    void pickUpWeapon(int playerId);
    void playerThrowWeapon(int playerId);
    void switchWeapon(int playerId);

}
