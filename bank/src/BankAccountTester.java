import java.util.Scanner;
public class BankAccountTester {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the starting balance of your bank account: ");
		BankAccount myBankAccount = new BankAccount(in.nextDouble());
		System.out.println("Enter the amount you would like to withdraw: ");
		myBankAccount.withdraw(in.nextDouble());
		System.out.println("Enter the amount you would like to deposit: ");
		myBankAccount.deposit(in.nextDouble());
		System.out.println("The balance of your account is " + myBankAccount.getBalance());
	}

	
	

}
