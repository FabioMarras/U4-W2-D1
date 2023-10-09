package exceptions;

public class MoreThanZeroException extends RuntimeException {
    public MoreThanZeroException(int number) {
        super("Hai inserito lo zero, provane uno superiore");
    }
}
