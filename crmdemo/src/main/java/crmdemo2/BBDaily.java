package crmdemo2;

import java.util.Scanner;
public class BBDaily 
{
	double balance;
	public BBDaily(double balance) {
		this.balance = balance;
	}

	public void addBalance(double bal) 
	{
			System.out.println("New Balance:"+ (balance+bal));
			balance=balance+bal;
			System.out.println(bal+" added Succesfully");
	}
	public void removeBalance(double bal) 
	{
		if(balance-bal<500) 
		{
			System.out.println("Rs500 balance must be there in wallet");
			System.out.println("Balance is still :"+balance);
		}
		else
		{
			System.out.println("New Balance:"+ (balance-bal));
			balance=balance-bal;
			System.out.println("balance "+ bal+ " is deducted");
			
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		BBDaily b=new BBDaily(5000);
		System.out.println("Balance added 5000 when Wallet is Created");
		System.out.println("Enter the amount you need to add in wallet");
		double add=sc.nextDouble();
		b.addBalance(add);
		System.out.println("Enter the amount you need to remove");
		double remove=sc.nextDouble();
		b.removeBalance(remove);
		System.out.println("");
		
	
	}
}
 