package tw.waterball.survive.io.router.protocol.protocols;

import tw.waterball.survive.io.router.protocol.api.Api;
import tw.waterball.survive.io.router.protocol.api.ServerApi;
import tw.waterball.survive.io.router.protocol.router.Router;

import java.io.InputStream;
import java.io.OutputStream;

public class ServerProtocol implements Protocol {

    @Override
    public Router createRouter(InputStream inputStream) {
        return new ProtocolRouter(inputStream);
    }

    @Override
    public Api createApi(OutputStream outputStream) {
        return new ProtocolApis(outputStream);
    }

    private static class ProtocolRouter implements Router {

        private InputStream inputStream;

        public ProtocolRouter(InputStream inputStream) {
            this.inputStream = inputStream;
        }

        @Override
        public void startRouting() {

        }
    }

    private static class ProtocolApis implements ServerApi {
        private OutputStream outputStream;

        public ProtocolApis(OutputStream outputStream) {
            this.outputStream = outputStream;
        }

        @Override
        public void useWeapon(int playerId) {

        }

        @Override
        public void reload(int playerId) {

        }

        @Override
        public void turn(int playerId, float angle) {

        }

        @Override
        public void moveForward(int playerId) {

        }

        @Override
        public void moveLeftward(int playerId) {

        }

        @Override
        public void moveRightward(int playerId) {

        }

        @Override
        public void moveBackward(int playerId) {

        }

        @Override
        public void pickUpWeapon(int playerId, int weaponId) {

        }

        @Override
        public void playerCurrentThrowWeapon(int playerId, int currentWeaponId) {

        }

        @Override
        public void switchWeapon(int playerId, int weaponSlotIndex) {

        }
    }
}
