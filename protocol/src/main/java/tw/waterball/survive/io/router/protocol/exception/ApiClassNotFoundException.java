package tw.waterball.survive.io.router.protocol.exception;

public class ApiClassNotFoundException extends RuntimeException {
    public ApiClassNotFoundException() {
    }

    public ApiClassNotFoundException(String message) {
        super(message);
    }

    public ApiClassNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ApiClassNotFoundException(Throwable cause) {
        super(cause);
    }

    public ApiClassNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
