package prog.comunes;

public class EdadInvalidaException extends IllegalArgumentException{
	private static final long serialVersionUID = 1L;

	public EdadInvalidaException (String message) {
		super(message);
	}
}
