package tw.waterball.survive.io.game.exception;

public class NoMagazinesException extends RuntimeException {
    public NoMagazinesException() {
    }

    public NoMagazinesException(String message) {
        super(message);
    }

    public NoMagazinesException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoMagazinesException(Throwable cause) {
        super(cause);
    }

    public NoMagazinesException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
