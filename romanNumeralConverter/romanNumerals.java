import java.util.Scanner;
public class romanNumerals {
	static int yearDesired;
	public void yearCalc() {
		//created a method to make the main method cleaner and the code more usable
		//breaking apart the input
				int millenia = yearDesired / 1000%10;
				int century = yearDesired / 100%10;
				int decade = yearDesired / 10%10;
				int years = yearDesired / 1%10;
				//begin if statements
				if (millenia == 1) {
					System.out.print("Your year in roman numerals is M");
				}else if(millenia == 2) {
					System.out.print("Your year in roman numerals is MM");
				}else if(millenia == 3) {
					System.out.print("Your year in roman numerals is MMM");
				}
				if (century == 1) {
					System.out.print("C");
				}else if(century == 2) {
					System.out.print("CC");
				}else if(century == 3) {
					System.out.print("CCC");
				}else if(century == 4) {
					System.out.print("CD");
				}else if(century == 5) {
					System.out.print("D");
				}else if(century == 6) {
					System.out.print("DC");
				}else if(century == 7) {
					System.out.print("DCC");
				}else if(century == 8) {
					System.out.print("DCCC");
				}else if(century == 9) {
					System.out.print("CM");
				}	
				if (decade == 1) {
					System.out.print("X");
				}else if(decade == 2) {
					System.out.print("XX");
				}else if(decade == 3) {
					System.out.print("XXX");
				}else if(decade == 4) {
					System.out.print("XL");
				}else if(decade == 5) {
					System.out.print("L");
				}else if(decade == 6) {
					System.out.print("LX");
				}else if(decade == 7) {
					System.out.print("LXX");
				}else if(decade == 8) {
					System.out.print("LXXX");
				}else if(decade == 9) {
					System.out.print("XC");
				}	
				if (years == 1) {
					System.out.print("I");
				}else if(years == 2) {
					System.out.print("II");
				}else if(years == 3) {
					System.out.print("III");
				}else if(years == 4) {
					System.out.print("IV");
				}else if(years == 5) {
					System.out.print("V");
				}else if(years == 6) {
					System.out.print("VI");
				}else if(years == 7) {
					System.out.print("VII");
				}else if(years == 8) {
					System.out.print("VIII");
				}else if(years == 9) {
					System.out.print("IX");
				}	

	}
	public static void main(String[] args) {
		//creating a scanner object
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a year between 0 and 3999 to convert to roman numerals!:");
		//created an object to call the method
		romanNumerals numb = new romanNumerals();
		//created a loop to continuously ask for years until user decides to end the program
		while(in.hasNextInt()) {
			//calling the method for calculating the roman numerals
			yearDesired = in.nextInt();
			numb.yearCalc();
			System.out.println("\nEnter another year to calculate again or enter 'END'");
		}
		System.out.println("You ended the program have a wonderful day!");
	}

}
