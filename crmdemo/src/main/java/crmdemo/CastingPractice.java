package crmdemo;

public class CastingPractice {
	public static void main(String[] args) {
		short s = 25;
		byte b = (byte) s;
		System.out.println(b + " " + s);
		int i = 564711;
		long l = i;
		System.out.println(i + " " + l);
		double d = i;
		System.out.println(i + " " + d);
	}
}
