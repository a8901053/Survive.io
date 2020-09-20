package tw.waterball.survive.io.poc.game;

import java.util.Set;

/**
 * @author Waterball (johnny850807@gmail.com)
 */
public class Role extends Sprite {
    protected Set<Direction> directions;
    protected State state = new Halt();

    @Override
    public void onUpdate() {
        state.onUpdate();
    }

    @Override
    public void onCollisionWith(Sprite other) {

    }

    public void move(Direction direction) {
        directions.add(direction);
    }

    public void clearMove(Direction direction) {
        directions.remove(direction);
    }

    protected abstract class State {
        abstract void onUpdate();
    }

    protected class Halt extends State {
        @Override
        void onUpdate() {

        }
    }

    protected class Moving extends State {
        @Override
        void onUpdate() {

        }
    }

    public Set<Direction> getDirections() {
        return directions;
    }
}
