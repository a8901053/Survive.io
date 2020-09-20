package tw.waterball.survive.io.poc.client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author Waterball (johnny850807@gmail.com)
 */
public class GameView extends JFrame implements KeyListener {
    private final Controller controller;

    public GameView(Controller controller) {
        this.controller = controller;
        setSize(500, 500);
        setContentPane(new Canvas());
    }

    public void launch() {
        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    private class Canvas extends JPanel {
        public Canvas() {
            repaint();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.black);
            g.fillRect(0, 0, 500, 500);
        }
    }
}
