package tw.waterball.survive.io.poc.game;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Waterball (johnny850807@gmail.com)
 */
public class World implements SpriteContainer {
    private List<Sprite> sprites = new ArrayList<>(20);
    private Player p1;
    private Player p2;

    public void setP1(Player p1) {
        this.p1 = p1;
    }

    public void setP2(Player p2) {
        this.p2 = p2;
    }

    public Player getP1() {
        return p1;
    }

    public Player getP2() {
        return p2;
    }

    @Override
    public void addSprite(Sprite sprite) {
        sprites.add(sprite);
    }

    @Override
    public void removeSprite(Sprite sprite) {
        sprites.remove(sprite);
    }

    @Override
    public void onUpdate() {
        sprites.forEach(Sprite::onUpdate);
        performCollisionDetection();
    }

    private void performCollisionDetection() {
        for (int i = 0; i < sprites.size() - 1; i++) {
            for (int j = i + 1; j < sprites.size(); j++) {
                Sprite s1 = sprites.get(i);
                Sprite s2 = sprites.get(j);
                if (s1.collideWith(s2)) {
                    s1.onCollisionWith(s2);
                    s2.onCollisionWith(s1);
                }
            }
        }
    }
}
