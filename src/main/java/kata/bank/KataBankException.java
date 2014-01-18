package kata.bank;

public class KataBankException extends RuntimeException {

    public KataBankException(String message){
        super(message);
    }

    public KataBankException(Throwable throwable) {
        super(throwable);
    }

    public KataBankException(){

    }
}
