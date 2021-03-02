/**
		   A bank account has a balance and a mechanism for
		   applying interest or fees at the end of the month.
		*/
		public class BankAccount
		{
		   private double balance;
		   double interestPct;
		   

		   /**
		      Constructs a bank account with zero balance.
		   */
		   public BankAccount(double amount, double interest)
		   {
		     balance = amount;
		     interestPct = interest;
		     
		     
		   }

		   /**
		      Makes a deposit into this account.
		      @param amount the amount of the deposit
		   */
		   public void deposit(double amount)
		   {
		      balance = balance + amount;
		      System.out.println("Deposited: " + amount);
		      
		   }

		   /**
		      Makes a withdrawal from this account, or charges a penalty if
		      sufficient funds are not available.
		      @param amount the amount of the withdrawal
		   */
		   public void withdraw(double amount)
		   {
		    
		      if (balance >= amount) {
                  balance = balance - amount;
                  System.out.println("Withdrew: " + amount);
              } else {
                  System.out.println("Insufficient Funds");
                  
                  }
		   }
		   /**
		      Gets the current balance of this bank account.
		      @return the current balance
		   */
		   public void getInterest(String answer)
		   {
			  if (answer.equalsIgnoreCase("Yes")) {
				 double newBalance = (balance * interestPct) + balance;
				 System.out.println("Interest: " + (balance * interestPct));
				 System.out.println("The account balance is: " + newBalance);
			  }else {
				 System.out.println("The account balance is: " + balance);
				  
			  }
		   }
		   
		  
		}
	


