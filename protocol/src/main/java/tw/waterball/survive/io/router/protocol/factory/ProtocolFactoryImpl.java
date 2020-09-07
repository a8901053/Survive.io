package tw.waterball.survive.io.router.protocol.factory;

import tw.waterball.survive.io.router.protocol.api.Api;
import tw.waterball.survive.io.router.protocol.api.ClientApi;
import tw.waterball.survive.io.router.protocol.api.ServerApi;
import tw.waterball.survive.io.router.protocol.exception.ApiClassNotFoundException;
import tw.waterball.survive.io.router.protocol.protocols.ClientProtocol;
import tw.waterball.survive.io.router.protocol.protocols.Protocol;
import tw.waterball.survive.io.router.protocol.protocols.ServerProtocol;

public class ProtocolFactoryImpl implements ProtocolFactory {

    @Override
    public Protocol createProtocol(Class<? extends Api> apiClass) {
        if (ServerApi.class.equals(apiClass)) {
            return new ServerProtocol();
        } else if (ClientApi.class.equals(apiClass)) {
            return new ClientProtocol();
        }
        throw new ApiClassNotFoundException();
    }
}
