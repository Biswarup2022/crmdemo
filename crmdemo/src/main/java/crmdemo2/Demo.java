package crmdemo2;

public class Demo {
		int a;
		Demo(){
			System.out.println("Demo()");
			  }
		public static void main(String[] args) {
			Demo d1 = new Demo();
			System.out.println(d1.a);
			Demo d2 = new Demo();
			System.out.println(d2.a);
		}
}
