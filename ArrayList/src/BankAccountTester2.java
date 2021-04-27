import java.util.ArrayList;
import java.util.Arrays;
public class BankAccountTester2 {

	public static void main(String[] args) {
		//creating bank account objects
		BankAccount gil = new BankAccount("Gil", 500);
		BankAccount joe = new BankAccount("Joe",1000);
		BankAccount fred = new BankAccount("Fred",2000);
		BankAccount sally = new BankAccount("Sally",2500);
		
		// Creating an Array list
		ArrayList<BankAccount> accountList = new ArrayList<>();
		accountList.add(gil);
		accountList.add(joe);
		accountList.add(fred);
		
		
		//Enhanced Loop
		for(BankAccount bankaccount: accountList) {
			System.out.println(bankaccount.getAccount());
		}
		
		//Adding fourth account
		accountList.add(sally);
		
		//Using an enhanced loop to find and print highest balance
		double max = Integer.MIN_VALUE;
		for(BankAccount bankaccount: accountList) {
			double x = (bankaccount.getBalance());
			if (x > max)
			    max = x;		
	}
		if(max == 2500.00) {
			System.out.println(sally.getAccount());
		}	else if(max == 2000.00) {
			System.out.println(fred.getAccount());
		}	else if(max == 1000.00) {
			System.out.println(joe.getAccount());
		}	else if(max == 500.00) {
			System.out.println(gil.getAccount());
		}	
		
		//Removing Sally
		accountList.remove(sally);
		
		//finding the new highest amount
		double max2 = Integer.MIN_VALUE;
		for(BankAccount bankaccount: accountList) {
			double x = (bankaccount.getBalance());
			if (x > max2)
			    max2 = x;
			}	if(max2 == 2500.00) {
				System.out.println(sally.getAccount());
			}	else if(max2 == 2000.00) {
				System.out.println(fred.getAccount());
			}	else if(max2 == 1000.00) {
				System.out.println(joe.getAccount());
			}	else if(max2 == 500.00) {
				System.out.println(gil.getAccount());
			}		
		
	}
}


