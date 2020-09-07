package tw.waterball.survive.io.server.worldobject.role;


import tw.waterball.survive.io.router.protocol.api.ClientApi;

public class Player extends Role {
    private final ClientApi clientApi;

    public Player(ClientApi clientApi) {
        this.clientApi = clientApi;
    }

    public void reload() {

    }
}
