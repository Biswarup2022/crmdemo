package crmdemo2;



public class InvalidMobileNumberException extends Throwable{
	
	String s;

	public InvalidMobileNumberException(String s) {
		super();
		this.s = s;
	}
	public String toString() {
		return s;
		
	}
	

}
