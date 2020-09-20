package tw.waterball.survive.io.poc.game;

/**
 * @author Waterball (johnny850807@gmail.com)
 */
public interface SpriteContainer {
    void addSprite(Sprite sprite);
    void removeSprite(Sprite sprite);
    void onUpdate();
}
