package tw.waterball.survive.io.poc.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Waterball (johnny850807@gmail.com)
 */
public class Server {
    private ServerSocket serverSocket;
    private DataInputStream in;
    private DataOutputStream out;

    public void start() throws IOException {
        serverSocket = new ServerSocket(8787);
        Socket socket = serverSocket.accept();
        in = new DataInputStream(socket.getInputStream());
        out = new DataOutputStream(socket.getOutputStream());
        new Thread(this::listenClientInputs).start();
    }

    private void listenClientInputs() {
        try {
            while (!serverSocket.isClosed()) {
                in.readByte();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
