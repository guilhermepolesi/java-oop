import java.io.Serial;

public class AccountException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;

    public AccountException(String msg) {
        super(msg);
    }

}
