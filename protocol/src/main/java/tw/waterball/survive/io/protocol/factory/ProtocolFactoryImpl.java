package tw.waterball.survive.io.protocol.factory;

import tw.waterball.survive.io.protocol.protocols.Protocol;
import tw.waterball.survive.io.protocol.protocols.StandardProtocol;


public class ProtocolFactoryImpl implements ProtocolFactory {

    @Override
    public <T> Protocol<T> createProtocol(Class<T> apiClass) {
        return new StandardProtocol<>(apiClass);
    }
}
