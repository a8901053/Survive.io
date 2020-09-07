package tw.waterball.survive.io.router.protocol.protocols;

import tw.waterball.survive.io.router.protocol.api.Api;
import tw.waterball.survive.io.router.protocol.router.Router;

import java.io.InputStream;
import java.io.OutputStream;

public interface Protocol {
    Router createRouter(InputStream inputStream);

    Api createApi(OutputStream outputStream);
}
