package exceptii;

public class CifreInvalideException extends IllegalArgumentException {
    public CifreInvalideException(String message){
        super(message);
    }
}
