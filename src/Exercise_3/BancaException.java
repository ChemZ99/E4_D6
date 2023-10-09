package Exercise_3;

public class BancaException extends RuntimeException {
    String message = "";

    BancaException (String message) {
        super();
        this.message = message;
        System.err.println(message.toString());
    }



}
