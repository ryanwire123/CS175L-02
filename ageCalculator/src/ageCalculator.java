import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.Period;
public class ageCalculator {

	
	public static void main(String[] args) {
		//User input date of birth
		String input = JOptionPane.showInputDialog("Enter your birthdate (yyyy-mm-dd): ");
		// Converting input into date 
		 LocalDate dateOfBirth = LocalDate.parse(input); 
		 // finding the current date
		 LocalDate currentDate = LocalDate.now(); 
		 //getting the period between the two dates
		 Period age  = Period.between(currentDate, dateOfBirth); 
		 // returning just the years that you are
		 int yearsOld  = Math.abs(age.getYears());
		 int months = Math.abs(age.getMonths());
		 JOptionPane.showMessageDialog(null, "You are " + yearsOld + " years and " + months + " months! ");

		
	}

}
