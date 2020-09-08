package tw.waterball.survive.io.router.protocol.factory;

import tw.waterball.survive.io.router.protocol.api.Api;
import tw.waterball.survive.io.router.protocol.protocols.Protocol;
import tw.waterball.survive.io.router.protocol.protocols.StandardProtocol;


public class ProtocolFactoryImpl implements ProtocolFactory {

    @Override
    public Protocol createProtocol(Class<? extends Api> apiClass) {
        return new StandardProtocol(apiClass);
    }
}
