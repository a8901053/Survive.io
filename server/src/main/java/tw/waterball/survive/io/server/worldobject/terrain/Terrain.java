package tw.waterball.survive.io.server.worldobject.terrain;

import tw.waterball.survive.io.server.worldobject.WorldObject;

public abstract class Terrain extends WorldObject {
    private boolean rigidBody;

    public Terrain(int terrainWidth, int terrainHeight) {
        super(terrainWidth, terrainHeight);
    }
}
