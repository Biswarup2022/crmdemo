package crmdemo;

public class GetClassPrac {
	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
		} catch (Exception e) {
			Class c = e.getClass();
			System.out.println(c.getName());
			System.out.println(c.getSuperclass().getName());
		}
	}
}
