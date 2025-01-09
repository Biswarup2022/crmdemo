package crmdemo;

public class Func {
	public static void main(String[] args) {
		Atm a = new AtmFunc();
		a.deposit(2000);
		a.withdraw(10000);
		a.pinChange(1234);

	}

}

abstract class Atm {
	abstract void pinChange(int pin);

	abstract double withdraw(double amount);

	abstract void deposit(double amount);
}

class AtmFunc extends Atm {
	void pinChange(int pin) {
		System.out.println("Pin Changed to :" + pin);
	}

	double withdraw(double amount) {
		System.out.println("Amount Withdrawal :" + amount);
		return amount;
	}

	void deposit(double amount) {
		System.out.println("Amount Deposited :" + amount);
	}
}
