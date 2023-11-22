package ExceptionHandling;

public class InsufficientBalanceException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InsufficientBalanceException(String string) {
		super(string);
	}
	

}
