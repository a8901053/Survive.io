package tw.waterball.survive.io.protocol.protocols;

import tw.waterball.survive.io.protocol.router.Router;

import java.io.InputStream;
import java.io.OutputStream;

public interface Protocol<T> {
    Router createRouter(InputStream inputStream);

    T createApi(OutputStream outputStream);
}
