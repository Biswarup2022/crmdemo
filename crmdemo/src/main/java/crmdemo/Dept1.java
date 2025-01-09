package crmdemo;

public class Dept1 {
	int id;
	String dname, loc;

	public Dept1(int id, String dname, String loc) {
		super();
		this.id = id;
		this.dname = dname;
		this.loc = loc;
	}

	public String toString() {
		return "dept details:" + id + " " + dname + " " + loc + "\n..";
	}
}
