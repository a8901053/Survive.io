package tw.waterball.survive.io.poc.client;

import tw.waterball.survive.io.poc.game.GameLoop;
import tw.waterball.survive.io.poc.game.World;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * @author Waterball (johnny850807@gmail.com)
 */
public class Client {
    private Controller controller;
    private Socket socket;
    private DataInputStream in;
    private DataOutputStream out;

    public Client(Controller controller) {
        this.controller = controller;
    }

    public void start() throws IOException {
        socket = new Socket("localhost", 8787);
        in = new DataInputStream(socket.getInputStream());
        out = new DataOutputStream(socket.getOutputStream());
        new Thread(this::listenServerOutput).start();
    }

    public void movePlayer(int playerId) throws IOException {
        out.writeByte(OpCodes.MOVE);
        out.writeInt(playerId);
        out.flush();
    }

    public void haltPlayer(int playerId) throws IOException {
        out.writeByte(OpCodes.HALT);
        out.writeInt(playerId);
        out.flush();
    }

    public void shoot(int playerId) throws IOException {
        out.writeByte(OpCodes.SHOOT);
        out.writeInt(playerId);
        out.flush();
    }

    private void listenServerOutput() {
        while (!socket.isClosed()) {
            try {
                byte opcode = in.readByte();
                switch (opcode) {
                    case OpCodes.HALT:
                        controller.onPlayerHalt(in.readInt());
                        break;
                    case OpCodes.MOVE:
                        controller.onPlayerMove(in.readInt());
                        break;
                    case OpCodes.SHOOT:
                        controller.onPlayerShoot(in.readInt());
                        break;
                    case OpCodes.SYNC:
                        controller.onSyncWorld();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
