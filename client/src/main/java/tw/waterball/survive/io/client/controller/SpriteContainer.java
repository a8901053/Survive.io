package tw.waterball.survive.io.client.controller;

import tw.waterball.survive.io.client.sprite.Sprite;

import java.util.ArrayList;
import java.util.List;

public class SpriteContainer {

    private List<Sprite> sprites = new ArrayList<>();

    public void addSprite(Sprite sprite) {
        sprites.add(sprite);
    }

    public void removeSprite(Sprite sprite) {
        sprites.remove(sprite);
    }

    public List<Sprite> getSprites() {
        return sprites;
    }
}
