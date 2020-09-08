package tw.waterball.survive.io.router.protocol.protocols;

import tw.waterball.survive.io.router.protocol.api.Api;
import tw.waterball.survive.io.router.protocol.api.ClientApi;
import tw.waterball.survive.io.router.protocol.api.ServerApi;
import tw.waterball.survive.io.router.protocol.exception.ApiClassNotFoundException;
import tw.waterball.survive.io.router.protocol.router.Router;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

public class StandardProtocol implements Protocol {

    private Class<? extends Api> apiClass;

    public StandardProtocol(Class<? extends Api> apiClass) {
        this.apiClass = apiClass;
    }


    @Override
    public Router createRouter(InputStream inputStream) {
        return new StandardRouter(inputStream);
    }

    @Override
    public Api createApi(OutputStream outputStream) {
        try {
            return (Api) apiClass.getConstructors()[0].newInstance(outputStream);
        } catch (Exception e) {
            throw new ApiClassNotFoundException();
        }
    }

    private static class StandardRouter implements Router {

        private final InputStream in;

        private StandardRouter(InputStream in) {
            this.in = in;
        }

        @Override
        public void startRouting() {

        }
    }

    private static class StandardClientApi implements ClientApi {
        private final OutputStream out;

        public StandardClientApi(OutputStream out) {
            this.out = out;
        }

        @Override
        public void onLoginSuccessfully(List<Object> map, List<Object> playersInViewPort, Object player) {

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
        public void onWorldObjectJoinsPlayerViewPort(Object worldObject) {

        }
    }

    private static class StandardServerApi implements ServerApi {
        private final OutputStream out;

        public StandardServerApi(OutputStream out) {
            this.out = out;
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

        @Override
        public void login(String playerName) {

        }
    }
}
