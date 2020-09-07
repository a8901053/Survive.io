package tw.waterball.survive.io.router.protocol.factory;

import tw.waterball.survive.io.router.protocol.api.Api;
import tw.waterball.survive.io.router.protocol.protocols.Protocol;

public interface ProtocolFactory {
    Protocol createProtocol(Class<? extends Api> apiClass);
}
