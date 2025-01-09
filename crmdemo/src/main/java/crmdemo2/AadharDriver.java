package crmdemo2;

import java.util.Scanner;
	
public class AadharDriver {
		public static boolean isValid(long aad) {
			int count=0;
			while(aad>0) {
				count++;
				aad/=10;
			}
			return count==12;
		}
			public static void main(String[] args) throws AadharNumberException {
				System.out.println("enter Aadhar number");
				long num = new Scanner(System.in).nextLong();
				if (isValid(num))
					System.out.println("Aadhar Number is Valid");
				else
					throw new AadharNumberException("Invalid Aadhar Number");
				}
			
	}
