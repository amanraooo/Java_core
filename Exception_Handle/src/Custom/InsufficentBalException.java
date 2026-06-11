package Custom;

public class InsufficentBalException extends Exception{
	public InsufficentBalException(String msg)
	{
		super(msg);
	}
}