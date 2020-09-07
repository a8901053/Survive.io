package tw.waterball.survive.io.router.protocol.protocols;

import tw.waterball.survive.io.router.protocol.api.Api;
import tw.waterball.survive.io.router.protocol.api.ClientApi;
import tw.waterball.survive.io.router.protocol.router.Router;

import java.io.InputStream;
import java.io.OutputStream;

public class ClientProtocol implements Protocol {

    @Override
    public Router createRouter(InputStream inputStream) {
        return new ProtocolRouter(inputStream);
    }

    @Override
    public Api createApi(OutputStream outputStream) {
        return new ProtocolApi(outputStream);
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

    private static class ProtocolApi implements ClientApi {
        private OutputStream outputStream;

        public ProtocolApi(OutputStream outputStream) {
            this.outputStream = outputStream;
        }

        @Override
        public void onLoginSuccessfully(byte[] map, byte[] player) {

        }

        @Override
        public void onHeartBeat() {

        }

        @Override
        public void onMoveForward(int roleId, int roleY) {

        }

        @Override
        public void onMoveBackward(int roleId, int roleY) {

        }

        @Override
        public void onMoveLeftward(int roleId, int roleX) {

        }

        @Override
        public void onMoveRightward(int roleId, int roleX) {

        }

        @Override
        public void onInjured(int id, int damage) {

        }

        @Override
        public void onThrowCurrentWeapon(int roleId, int currentWeaponId) {

        }

        @Override
        public void onSwitchWeapon(int roleId, int weaponSlotIndex) {

        }

        @Override
        public void onReload(int roleId) {

        }

        @Override
        public void onWeaponUsed(int roleId) {

        }

        @Override
        public void onPickUpWeapon(int roleId, int weaponId) {

        }

        @Override
        public void onTurn(int roleId, float angle) {

        }

        @Override
        public void onDead(int id) {

        }

        @Override
        public void onWorldObjectJoinsPlayerViewPort(byte[] worldObject) {

        }
    }
}
