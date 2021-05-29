package VM11.PascalCompiller.Exceptions;

/*!
 * \brief Ислючение, возникающее во время разбора логических выражений
 */
public class LogicException extends Exception {
	private static final long serialVersionUID = 1L;

	public LogicException(String message) {
		super(message);
	}
}
