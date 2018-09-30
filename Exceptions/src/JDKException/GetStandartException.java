package JDKException;

public class GetStandartException extends Exception {

    public GetStandartException(Exception ex,String message) {
        super(message);
    }
}
