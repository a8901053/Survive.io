package tw.waterball.survive.io.server.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;

import java.util.Iterator;

/**
 * @author swshawnwu@gmail.com(ShawnWu)
 */
public class NioServer {

    private ServerSocketChannel socketChannel = ServerSocketChannel.open();
    private Selector selector = Selector.open();
    private SelectionKey selection;
    private ByteBuffer buffer;
    private boolean serverStatus;

    private static NioServer nioServer;

    public static NioServer create(int port) throws IOException {
        if (nioServer == null)
            nioServer = new NioServer(port);
        return nioServer;
    }

    private NioServer(int port) throws IOException {
        socketChannel.configureBlocking(false);
        socketChannel.socket().bind(new InetSocketAddress(port));
        socketChannel.register(selector, SelectionKey.OP_ACCEPT);
    }

    public void start() throws IOException {
        serverStatus = true;
        while (serverStatus) {
            int eventSize = selector.select();
            if (eventSize != 0) {
                Iterator<SelectionKey> keyIterator = selector.selectedKeys().iterator();
                while (keyIterator.hasNext()) {
                    selection = keyIterator.next();
                    keyIterator.remove();
                    if (selection.isValid()) {
                        if (selection.isAcceptable()) {
                            registerClient();
                        } else if (selection.isReadable()) {
                            read();
                        } else if (selection.isWritable()) {
                            write();
                        }
                    }
                }
            }
        }
    }

    public void stop() {
        serverStatus = false;
    }

    private void registerClient() throws IOException {
        SocketChannel client = socketChannel.accept();
        client.configureBlocking(false);
        client.register(selector, SelectionKey.OP_READ);
        client.write(ByteBuffer.wrap("Hello".getBytes()));
    }

    private void read() throws IOException {
        buffer = ByteBuffer.allocate(1024);
        SocketChannel client = (SocketChannel) selection.channel();
        int readByte = client.read(buffer);
        if (readByte > 0)
            buffer.flip();
        selection.interestOps(SelectionKey.OP_WRITE);
    }

    private void write() throws IOException {
        SocketChannel client = (SocketChannel) selection.channel();
        byte[] data = new byte[buffer.limit()];

        for (int i = 0; i < buffer.limit(); i++)
            data[i] = buffer.get();

        System.out.println(new String(data));
        client.write(ByteBuffer.wrap(data));
        buffer.clear();
        selection.interestOps(SelectionKey.OP_READ);
    }

    public static void main(String[] args) {
        try {
            NioServer.create(8888).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
