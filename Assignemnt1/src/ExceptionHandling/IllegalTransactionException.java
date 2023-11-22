package ExceptionHandling;

public class IllegalTransactionException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IllegalTransactionException(String string) {
		super(string);
	}

}
