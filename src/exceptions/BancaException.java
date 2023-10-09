package exceptions;

public class BancaException extends RuntimeException{
    public BancaException(String messaggio) {
        super(messaggio);
    }
}
