package crmdemo2;


import java.util.Scanner;

public class User {
	public static boolean isValid(long mob) {
		int count=0;
		while(mob>0) {
			count++;
			mob/=10;
		}
		return count==10;
	}
		public static void main(String[] args) throws InvalidMobileNumberException {
			System.out.println("enter mobile number");
			long num = new Scanner(System.in).nextLong();
			if (isValid(num))
				System.out.println("Mobile Number is Valid");
			else
				throw new InvalidMobileNumberException("Invalid Mobile Number");
			}
		
}
