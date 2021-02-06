//this is bringing in the ability to input data from user
import java.util.Scanner;

public class HousePaintingProject {

	public static void main(String[] args) {
		// this is creating a scanner object to input data
		Scanner in = new Scanner(System.in);
		// This code illustrates creation of variables
		double houseLength = 0;
		double houseWidth = 0;
		double houseHeight = 0;
		double normalSideSqFt = 0;
		double peakSideSqFt = 0;
		double totalOfSides = 0;
		double numberOfWindows = 0;
		double windowWidth = 0;
		double windowLength = 0;
		double windowSqFt = 0;
		double numberOfDoors = 0;
		double doorLength = 0;
		double doorWidth = 0;
		double doorSqFt = 0;
		double totalSqFt = 0;
		double costPerSqFt = 0;
		double costToPaint = 0;
		System.out.println("Enter length of house: ");
		// calls upon scanner to input an integer for the variable
		houseLength = in.nextDouble();
		System.out.println("Enter width of house: ");
		houseWidth = in.nextDouble();
		System.out.println("Enter height of house: ");
		houseHeight = in.nextDouble();
		System.out.println("Enter number of windows: ");
		numberOfWindows = in.nextDouble();
		System.out.println("Enter the width of window: ");
		windowWidth = in.nextDouble();
		System.out.println("Enter the length of window: ");
		windowLength = in.nextDouble();
		System.out.println("Enter number of doors: ");
		numberOfDoors = in.nextDouble();
		System.out.println("Enter the width of door: ");
		doorWidth = in.nextDouble();
		System.out.println("Enter length of door: ");
		doorLength = in.nextDouble();
		// starting calculations
		normalSideSqFt = 2 * (houseLength * houseWidth);
		peakSideSqFt = 2 * (houseLength * houseWidth + (0.5 * (houseLength * (houseHeight - houseWidth))));
		totalOfSides = normalSideSqFt + peakSideSqFt;
		windowSqFt = numberOfWindows * (windowLength * windowWidth);
		doorSqFt = numberOfDoors * (doorLength * doorWidth);
		totalSqFt = totalOfSides - (windowSqFt + doorSqFt);
		System.out.println("Enter Cost Per Sq Ft: ");
		costPerSqFt = in.nextDouble();
		costToPaint = totalSqFt * costPerSqFt;
		System.out.println("The cost to paint the house is: " + costToPaint);

	}

}

