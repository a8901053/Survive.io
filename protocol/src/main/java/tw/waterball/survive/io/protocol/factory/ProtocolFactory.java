package tw.waterball.survive.io.protocol.factory;

import tw.waterball.survive.io.protocol.protocols.Protocol;

public interface ProtocolFactory {
    <T> Protocol<T> createProtocol(Class<T> apiClass);
}
