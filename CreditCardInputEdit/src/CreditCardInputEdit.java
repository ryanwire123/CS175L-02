import java.util.Scanner;
public class CreditCardInputEdit {
	static String cardNumber;
	static int i;
	public void stringEdit() {
		 while (i < cardNumber.length())
		    { 
		    	
		       char ch = cardNumber.charAt(i);
		       if (cardNumber.equals( "-99")) {
		    	   System.out.println("Goodbye");
		    	   System.exit(0);
		       }
		       else if (ch == ' '|| ch =='-')         
		       {
		    	   // Remove the character at position i
		          String before = cardNumber.substring(0, i);
		          String after = cardNumber.substring(i + 1);
		          cardNumber = before + after;
		       }
		       else
		       {
		          i++;
		       }
		    }
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a credit card number or -99 to end:");
		CreditCardInputEdit x = new CreditCardInputEdit();
			while(in.hasNext()) {
				cardNumber = in.next();
				i = 0;
				x.stringEdit();
				System.out.println(cardNumber);
			    System.out.println("Enter a credit card number or -99 to end:");
				
		   	}

		
		}
	}		



	


