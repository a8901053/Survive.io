package tw.waterball.survive.io.poc.sprite.terrain;

import tw.waterball.survive.io.poc.sprite.Sprite;

public abstract class Terrain extends Sprite {
    private boolean rigidBody;

    public Terrain(int terrainWidth, int terrainHeight) {
        super(terrainWidth, terrainHeight);
    }
}
