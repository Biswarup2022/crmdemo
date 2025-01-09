package crmdemo2;


public class Addition {
	public static void add(int i){
		System.out.println(i+1);
	}
	public static void add(String s, int i){
		System.out.println(s+i);
	}
	public static void add(String s, String p) {
		System.out.println(s+p);
	}
	public static void main(String[] args) {
		add(10);
		add("hgfashgfc",10);
		add("jhvcjhvad","hdvgjhd");
		
		
	}
}
