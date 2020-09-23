/*
 *  Copyright 2020 Johnny850807 (Waterball) 潘冠辰
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package tw.waterball.survive.io.game.sprite;

import tw.waterball.survive.io.game.world.World;

import java.awt.*;


public abstract class Sprite {
    protected Rectangle body;
    protected World world;
    protected float angle;
    private int id;

    public Sprite(int spriteWidth, int spriteHeight) {
        this.body = new Rectangle(new Dimension(spriteWidth, spriteHeight));
    }

    public abstract void onUpdate();

    public int getX() {
        return body.x;
    }

    public void setX(int x) {
        body.setLocation(x, body.y);
    }

    public int getY() {
        return body.y;
    }

    public void setY(int y) {
        body.setLocation(body.x, y);
    }

    public float getAngle() {
        return angle;
    }

}
