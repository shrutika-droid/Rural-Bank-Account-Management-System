package rbams;

//Custom exception
public class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String message) {
        super(message);
    }

}
