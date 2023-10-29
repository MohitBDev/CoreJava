package custom_exceptions;

@SuppressWarnings("serial") // => compile time annotation , to tell javac to ignore serialization related
							// warning
public class SpeedOutOfRangeException extends RuntimeException {
	public SpeedOutOfRangeException(String errMesg) {
		super(errMesg);
	}
}
