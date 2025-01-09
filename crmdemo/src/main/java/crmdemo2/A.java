	package crmdemo2;
	
	class D{
		//hirarchial inheritence
	String s = "Java";
	public void display() {
		System.out.println("Display is in D Class");
	}
}
	class E extends D{
	int i = 10;
	public void show() {
		System.out.println("Show is in E Class");
	}
}
	class F extends D{
	char c ='B';
	public void see() {
		System.out.println("See is in F Class");
	}	
}
	public class A {
	public static void main(String[] args) {
		F f1 = new F();
		System.out.println(f1.c);
		f1.see();
		System.out.println(f1.s);
		f1.display();
		E e1 = new E();
		System.out.println(e1.i);
		e1.show();
		System.out.println(e1.s);
		e1.display();
	}
}