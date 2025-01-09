package crmdemo2;
import java.util.Scanner;

public class VoterDriver {
		public static void isValid(int age) throws VotingException {

			if(age<18) {
				
				throw new VotingException("Invalid Age for Voting");
				}
			else
				System.out.println("You are eligible for voting");
		}
				public static void main(String[] args) throws VotingException {
					System.out.println("Enter Your Age :");
					int age = new Scanner(System.in).nextInt();
					isValid(age);
				}
		}

