package tw.waterball.survive.io.protocol.protocols;

import tw.waterball.survive.io.protocol.router.Router;

import java.io.InputStream;
import java.io.OutputStream;

public class StandardProtocol<T> implements Protocol<T> {

    private final Class<T> apiClass;

    public StandardProtocol(Class<T> apiClass) {
        this.apiClass = apiClass;
    }


    @Override
    public Router createRouter(InputStream inputStream) {
        return new StandardRouter(inputStream);
    }

    @SuppressWarnings("unchecked")
    @Override
    public T createApi(OutputStream outputStream) {
        try {
            return (T) apiClass.getConstructors()[0].newInstance(outputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static class StandardRouter implements Router {
        private final InputStream in;

        private StandardRouter(InputStream in) {
            this.in = in;
        }

        @Override
        public void startRouting() {

        }
    }
}
