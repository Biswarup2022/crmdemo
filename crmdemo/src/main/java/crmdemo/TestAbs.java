package crmdemo;

import java.util.Scanner;

abstract class Sample
	{
		public abstract int add(int a, int b);
	}
	class Demo extends Sample
	{
		public int add(int a, int b)
		{
			return a+b;
		}
	}
	public class TestAbs
	{
		public static void main(String[] args)
		{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the 1st Number :");
		int a = s.nextInt();
		System.out.println("Enter the 2nd Number :");
		int b = s.nextInt();
		Demo d = new Demo();
		System.out.println(d.add(a, b));
		}
}
