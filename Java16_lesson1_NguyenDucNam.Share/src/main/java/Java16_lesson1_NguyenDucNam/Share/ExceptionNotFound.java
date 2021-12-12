package Java16_lesson1_NguyenDucNam.Share;

public class ExceptionNotFound extends Exception{
	
	private String message ;


	public ExceptionNotFound(String message) {
		super(message);
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}

	
}
