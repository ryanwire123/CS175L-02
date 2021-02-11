// importing a scanner
import java.util.Scanner;
public class mailMerge {

	public static void main(String[] args) {
		// initializing a scanner
		Scanner in = new Scanner(System.in);
		// initializing strings
		String text1 = "Dear <first name> <last name>,";
		String text2 = "Please confirm that your address is <houseNumber> <street>";
		String text3 = "Your answer is: <yORn>, Goodbye!";
		// beginning replacement
		System.out.println("Please enter your first name: ");
		text1 = text1.replace("<first name>", in.nextLine());
		System.out.println("Please enter your last name: ");
		text1 = text1.replace("<last name>", in.nextLine());
		System.out.println("Please enter your house number: ");
		text2 = text2.replace("<houseNumber>", in.nextLine());
		System.out.println("Please enter your street: ");
		text2 = text2.replace("<street>", in.nextLine());
		System.out.println(text1);
		System.out.println(text2);
		System.out.println("Is this correct?: ");
		text3 = text3.replace("<yORn>", in.nextLine());
		System.out.println(text3);
		
		
 
	}

}
