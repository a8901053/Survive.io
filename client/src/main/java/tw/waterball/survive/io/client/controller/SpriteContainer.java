package tw.waterball.survive.io.client.controller;

import tw.waterball.survive.io.client.sprite.Sprite;

import java.util.ArrayList;
import java.util.List;

public class SpriteContainer {
    private final List<Sprite> sprites = new ArrayList<>();
    private final List<Sprite> map = new ArrayList<>();

    public List<Sprite> getSprites() {
        return sprites;
    }

    public List<Sprite> getMap() {
        return map;
    }
}
