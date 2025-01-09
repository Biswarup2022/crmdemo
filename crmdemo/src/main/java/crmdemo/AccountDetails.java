package crmdemo;

import java.util.Scanner;

public class AccountDetails {

	String accName;
	long accId;

	public AccountDetails(String accName, long accId) {
		super();
		this.accName = accName;
		this.accId = accId;
	}
		public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your Name :");
		String accName = s.nextLine();
		System.out.println("Enter Your Account ID :");
		long accId = s.nextLong();
		}
		
}
