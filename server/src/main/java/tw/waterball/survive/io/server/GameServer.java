package tw.waterball.survive.io.server;

import tw.waterball.survive.io.protocol.router.Router;
import tw.waterball.survive.io.server.nio.NioServer;

import java.io.IOException;


public class GameServer {
    private final int serverPort = 8888;
    private Router router;

    public void start() {
        try {
            NioServer.create(serverPort).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void read() {

    }

    public void onPlayerNameExists() {

    }

}
