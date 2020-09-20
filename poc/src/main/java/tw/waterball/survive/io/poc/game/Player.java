package tw.waterball.survive.io.poc.game;

/**
 * @author Waterball (johnny850807@gmail.com)
 */
public class Player extends Role {

    public void shoot() {
        state = new Shooting(state);
    }


    private class Shooting extends Role.State {
        private State previousState;

        public Shooting(State previousState) {
            this.previousState = previousState;
        }

        @Override
        void onUpdate() {
            previousState.onUpdate();

            // TODO shoot
        }
    }
}
