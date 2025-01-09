package crmdemo;

public class StringReverse {
	public static void main(String[] args) {
		String s = "Biswarup is a test engineer";
		String[] sp = s.split(" ");
		String res = "";
		for (int i = sp.length - 1; i >= 0; i--) {
			res += sp[i] + " ";
		}
		System.out.println(res.trim());
	}
}
