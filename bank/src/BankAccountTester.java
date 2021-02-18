import java.util.Scanner;
public class BankAccountTester {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double amount = 0;
		System.out.println("Enter the starting balance of your bank account: ");
		amount = in.nextDouble();
		BankAccount myBankAccount = new BankAccount(amount);
		myBankAccount.withdraw(500.00);
		myBankAccount.deposit(1500.00);
		System.out.println("The balance of your account is " + myBankAccount.getBalance());
	}

	
	

}
