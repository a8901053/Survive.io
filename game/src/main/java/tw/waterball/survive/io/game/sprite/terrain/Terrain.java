package tw.waterball.survive.io.game.sprite.terrain;

import tw.waterball.survive.io.game.sprite.Sprite;

public abstract class Terrain extends Sprite {
    private boolean rigidBody;

    public Terrain(int terrainWidth, int terrainHeight) {
        super(terrainWidth, terrainHeight);
    }
}
