package crmdemo;

public class Employee implements Cloneable {
	String name;
	int eid;
	double salary;

	public Employee(String name, int eid, double salary) {
		super();
		this.name = name;
		this.eid = eid;
		this.salary = salary;
	}

	public String toString() {
		return name + " " + eid + " " + salary;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e1 = new Employee("Smith", 857, 54644);
		Employee e2 = (Employee) e1.clone();
		System.out.println(e1);
		System.out.println(e2);

	}
}
