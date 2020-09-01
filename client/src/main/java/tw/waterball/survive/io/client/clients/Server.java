package tw.waterball.survive.io.client.clients;

public interface Server {

    void attack();
    void reload();
    void turn(float angle);
    void moveForward();
    void moveLeftward();
    void moveRightward();
    void moveBackward();
    void pickUpWeapon();
    void playerThrowWeapon();
    void switchWeapon();

}
