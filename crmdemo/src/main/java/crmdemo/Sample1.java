package crmdemo;

class Bike {
	public void go() {
		System.out.println("Go to Bike");
	}
}

class Journey {
	Bike b;

	public void travel() {
		b = new Bike();
		b.go();
	}

}

public class Sample1 {
	public static void main(String[] args) {
		Journey j = new Journey();
		j.travel();
		j.b.go();

	}
}
