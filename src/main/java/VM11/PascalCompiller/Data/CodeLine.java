package VM11.PascalCompiller.Data;

public class CodeLine {
	protected String _code;
	protected String _comment;
	
	public CodeLine (String code, String comment) {
		_code = code;
		_comment = comment;
	}
	
	public void setCode(String code) { _code = code; }
	public String getCode() { return _code; }
	
	public void setComment(String comment) { _comment = comment; }
	public String getComment() { return _comment; }
}
