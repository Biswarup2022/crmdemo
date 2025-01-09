package crmdemo;

public class TestPin {
	public static void main(String[] args) {
		Pin p = new Pin(1234);
		System.out.println(p.getPin());
		p.setPin(5678);
		System.out.println(p.getPin());
	}
}
