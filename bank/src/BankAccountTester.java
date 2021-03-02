import java.util.Scanner;
public class BankAccountTester {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the starting balance of your bank account: ");
		System.out.println("Enter the interest rate for this account: ");
		BankAccount myBankAccount = new BankAccount(in.nextDouble(), in.nextDouble());
		System.out.println("Enter the amount you would like to deposit: ");
		myBankAccount.deposit(in.nextDouble());
		System.out.println("Enter the amount you would like to withdraw: ");
		myBankAccount.withdraw(in.nextDouble());
		System.out.println("Enter the amount you would like to withdraw: ");
		myBankAccount.withdraw(in.nextDouble());
		System.out.println("If you want to generate interest, enter 'Yes'");
		myBankAccount.getInterest(in.next());
		
		
	}

	
	

}
