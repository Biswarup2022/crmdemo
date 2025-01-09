package crmdemo2;


public class AadharNumberException extends Throwable{
	String s;

	public AadharNumberException(String s) {
		super(s);
	}
}
