import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class RoachSimulation {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Enter starting roach population:");
	    int initialPop = (int) Double.parseDouble(input);
		RoachPopulation bugs = new RoachPopulation(initialPop);
		DecimalFormat wholeFormat = new DecimalFormat("0");
		DecimalFormat pctFormat = new DecimalFormat("00%");
		JOptionPane.showMessageDialog(null, "The initial roach population is  " + wholeFormat.format(bugs.getRoaches()));
		int cycle = 1;
		while (bugs.getRoaches() > 0) {
			bugs.breed();
			JOptionPane.showMessageDialog(null, "The Roach population after cycle " + cycle + " breeding is " + wholeFormat.format(bugs.getRoaches()));
			String spray = JOptionPane.showInputDialog("Enter spray percentage for cycle " + cycle + ": ");
		    double sprayPct = Double.parseDouble(spray);
		    bugs.spray(sprayPct);
		    JOptionPane.showMessageDialog(null, "The Roach population after cycle " + cycle + " " + pctFormat.format(sprayPct) +  " spraying is " + wholeFormat.format(bugs.getRoaches()));
		    cycle++;
		}
		JOptionPane.showMessageDialog(null, "All the bugs are dead!");
		System.exit(0);

	}
}


