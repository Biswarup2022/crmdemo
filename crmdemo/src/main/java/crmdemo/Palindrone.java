package crmdemo;

import java.util.Scanner;

public class Palindrone {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = s.nextInt();
		int res = 0;
		int temp = num;
		while (num > 0) {
			res = res * 10 + num % 10;
			num = num / 10;
		}
		if (res == temp) {
			System.out.println("The given number is Palindrone");
		} else
			System.out.println("The given number is not Palindrone");
	}
}
