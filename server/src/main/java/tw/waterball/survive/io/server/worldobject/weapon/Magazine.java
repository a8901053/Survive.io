package tw.waterball.survive.io.server.worldobject.weapon;

public class Magazine {
    private int remainingBullets;
    private int capacity;

    public Magazine(int remainingBullets, int capacity) {
        this.remainingBullets = remainingBullets;
        this.capacity = capacity;
    }
}
