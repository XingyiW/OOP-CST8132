package lab7_dup;

public class DuplicateValueException extends Exception {

	private static final long serialVersionUID = 2L;

	// no-argument constructor specifies default error message
	public DuplicateValueException() {
		super("Number is already in array");
	}

	// constructor to allow customized error message
	public DuplicateValueException(String message) {
		super(message); //
	} // end class DuplicateValueException

}
