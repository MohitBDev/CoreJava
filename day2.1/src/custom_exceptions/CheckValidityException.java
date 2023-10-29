package custom_exceptions;

@SuppressWarnings("serial")
public class CheckValidityException extends RuntimeException{
	
	public CheckValidityException (String msg) {
		super(msg);
	}

}
