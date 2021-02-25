import java.util.Scanner;
public class ATM {
	 static Scanner in = new Scanner(System.in);
	static double balance;
	static int answer;
	
	public ATM(double amount) {
		balance = amount;
	    
	}
	public static void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Your deposit of " + amount + " was successful ");
		 System.out.println("Would you like to perform another action?: \n1.Yes\n2.No ");
			answer = in.nextInt();
			if (answer == 1) {
				menu();
			}
			if (answer == 2){
				exit();
			}
		}
	
	public static void withdraw(double amount) {
		 if (balance >= amount) {
             balance = balance - amount;
             System.out.println("Your withdrawl of " + amount + " was successful");
         } else {
             System.out.println("Insufficient Funds");
             System.out.println("Please select a different amount: ");
             withdraw(in.nextDouble());
             }
		 System.out.println("Would you like to perform another action?: \n1.Yes\n2.No ");
			answer = in.nextInt();
			if (answer == 1) {
				menu();
			}
			if (answer == 2){
				exit();
			}
	} 
	public static void viewBalance() {
		System.out.println("You have a balance of: " + balance);
		 System.out.println("Would you like to perform another action?: \n1.Yes\n2.No");
			answer = in.nextInt();
			if (answer == 1) {
				menu();
			}
			if (answer == 2){
				exit();
			}
	}
	public static void exit() {
		System.out.println("Have a nice day");
		return;
	}
	public static void menu() {
		 System.out.println("Choose one of the following: \n1.Display Balance\n2.Deposit\n3.Withdraw\n4.Exit");
		 int choose  = in.nextInt();
		 
		 if (choose == 1) {
			 viewBalance();
			 menu();
		 }
		 if (choose == 2) {
			 System.out.println("How much would you like to deposit: ");
			 deposit(in.nextDouble());
			 menu();
		 }
		 if(choose == 3) {
			 System.out.println("How much would you like to deposit: ");
			 withdraw(in.nextDouble());
			 menu();
		 }
		 if (choose == 4) {
			 exit();
		 }		 
			 
 }
	
    public static void main(String[] args) {
        
       System.out.println("Enter the starting balance of this account: ");
       ATM ryansBank = new ATM(in.nextDouble());
       ryansBank.menu();       
    }      
}       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       