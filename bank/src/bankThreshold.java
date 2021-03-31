import java.util.Scanner;
public class bankThreshold {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the starting balance of your bank account: ");
		System.out.println("Enter the interest rate for this account: ");
		BankAccount myBankAccount = new BankAccount(in.nextDouble(), in.nextDouble());
		int months = 0;
		System.out.println("Enter a threshold amount:");
		while(in.hasNextDouble()) {
			double threshold = in.nextDouble();
			while(myBankAccount.balance <= threshold) {
				myBankAccount.calcInterest();
				months++;
			}
			System.out.println("It will take " + months + " months to reach: " + threshold);
		    System.out.println("Enter another threshold amount or enter 'End'");	
		}
			
		}

	}


