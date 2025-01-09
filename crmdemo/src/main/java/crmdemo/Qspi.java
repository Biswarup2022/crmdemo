package crmdemo;

public class Qspi {
	static String classroom = "Java";
	String tname;
	int cid;

	Qspi(String tname) {
		this.tname = tname;
	}

	Qspi(String tname, int cid) {
		this(tname);
		this.cid = cid;
	}

	public static void main() {
		Qspi q = new Qspi("Rajsekhar", 3214);
		System.out.println(q.cid);
		System.out.println(q.tname);
		System.out.println(q.classroom);
		System.out.println(classroom);
		System.out.println(Qspi.classroom);

	}
}
