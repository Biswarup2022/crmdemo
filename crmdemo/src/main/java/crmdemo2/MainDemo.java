package crmdemo2;


class Demo1 {
	
	public void insta() {
		System.out.println("Welcome to Meta");
	}
}
 class Demo2 extends Demo1{
	public void insta() {
		System.out.println("Welcome to Fb");
}
 }
 class Demo3 extends Demo1{
		public void insta() {
			System.out.println("Welcome to WA");
		}	
	}
public class MainDemo{
	public static void main(String[] args) {
			Demo2 d1 = new Demo2 ();
			d1.insta();
			Demo3 d2 =  new Demo3 ();
			d2.insta();
			Demo1 d = new Demo2 ();
			d.insta();
			Demo2 d4 = (Demo2)d;
			d4.insta();
	} 
	}
	