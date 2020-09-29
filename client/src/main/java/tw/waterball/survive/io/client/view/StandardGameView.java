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

package tw.waterball.survive.io.client.view;

import tw.waterball.survive.io.client.controller.PlayerController;
import tw.waterball.survive.io.game.sprite.Sprite;
import tw.waterball.survive.io.game.sprite.role.Role;
import tw.waterball.survive.io.game.sprite.weapon.Weapon;

import javax.swing.*;
import java.awt.*;
import java.util.Collections;
import java.util.List;

/**
 * @author - timt1028@gmail.com
 */
public class StandardGameView extends GameView {
    private PlayerController playerController;
    private Canvas canvasGame = new Canvas();

    public StandardGameView(PlayerController playerController) {
        this.playerController = playerController;
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocation(300, 300);
        setSize(600, 600);
        setContentPane(canvasGame);
    }

    @Override
    public void launch() {
        setVisible(true);
    }

    @Override
    public void onRender(List<Sprite> sprites) {
        canvasGame.onRender(sprites);
    }

    @Override
    public void onWeaponUsed(Weapon weapon) {

    }

    @Override
    public void onPlayerLoginSuccessfully() {

    }

    @Override
    public void onPlayerNameExists() {

    }

    @Override
    public void onNoBulletsToReload() {

    }

    @Override
    public void onMagazineIsFull() {

    }

    @Override
    public void onPickUpWeapon(Role role) {

    }

    @Override
    public void onThrowWeapon(Role role) {

    }

    @Override
    public void onInjured(Role role, int damage) {

    }

    @Override
    public void onSwitchCurrentWeapon(Role role) {

    }

    @Override
    public void onReload(Role role) {

    }

    @Override
    public void onDead(Role role) {

    }

    @Override
    public void onMove(Role role) {

    }

    @Override
    public void onTurn(Role role) {

    }

    @Override
    public void onUpdate(List<Sprite> sprites) {

    }

    private class Canvas extends JPanel {
        private List<Sprite> sprites = Collections.emptyList();

        public void onRender(List<Sprite> sprites) {
            this.sprites = sprites;
            repaint();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            drawBackground(g);
            sprites.forEach(sprite -> paintSprite(g, sprite));
        }

        private void paintSprite(Graphics g, Sprite sprite) {
        }

        private void drawBackground(Graphics g) {
            g.setColor(Color.ORANGE);
            g.fillRect(0, 0, 500, 300);
        }
    }
}

