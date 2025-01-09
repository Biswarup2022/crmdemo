package crmdemo;

class Employee1 implements Cloneable

{
	String name;
	int eid;
	double salary;
	Dept1 d;

	public Employee1(String name, int eid, double salary, int id, String dname, String loc) {
		super();
		this.name = name;
		this.eid = eid;
		this.salary = salary;
		d = new Dept1(id, dname, loc);
	}

	public String toString() {
		return "Employee1 details:" + name + " " + eid + " " + salary + "\n" + d.toString();
	}

	public Object clone() {
		return new Employee1(name, eid, salary, d.id, d.dname, d.loc);
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee1 original = new Employee1("Smith", 857, 54644, 10, "Sales", "Nagavara");
		System.out.println(original);
		Employee1 duplicate = (Employee1) original.clone();
		System.out.println(duplicate);
		duplicate.d.loc = "Hennur";
		System.out.println(duplicate);
		System.out.println(original);
	}
}
