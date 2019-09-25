import java.text.NumberFormat;
import java.util.Scanner;

public class PaintCost {

	public static void main(String[] args) {
		/*
		 * This program is going to calculate the total cost to paint a house.
		 */
		double houseLengthFeet = 0;
		double houseWidthFeet = 0;
		double houseHeightFeet = 0;
		double houseLengthInches = 0;
		double houseWidthInches = 0;
		double houseHeightInches = 0;
		double windowLengthFeet = 0;
		double windowLengthInches = 0;
		double windowHeightInches = 0;
		double windowHeightFeet = 0;
		int windowNumber = 0;
		double doorLengthFeet = 0;
		double doorHeightFeet = 0;
		double doorLengthInches = 0;
		double doorHeightInches = 0;
		int doorNumber = 0;
		double sqFootCost = 0;
		double sqFootPeak = 0;
		double sqFootNormal = 0;
		double sqFootWindows = 0;
		double sqFootDoors = 0;
		double totalWindows = 0; 
		double totalDoors = 0;
		double sqFootTotalSides = 0;
		double totalSubtractedFootage = 0;
		double sqFootEndingTotal = 0;
		double endingCost = 0;
		
		//Scan in numbers for code
		Scanner in = new Scanner(System.in);
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		
		//Enter the length of the house in feet
		System.out.print("Enter the whole length in feet of the house without the remainder of inches:  ");
		houseLengthFeet = in.nextDouble();
		
		
		//Enter the width of the house in feet
		System.out.print("Enter the whole width in feet of the house without the remainder of inches:  ");
		houseWidthFeet = in.nextDouble();
		
		
		//Enter the height of the house in feet
		System.out.print("Enter the whole height in feet of the house without the remainder of inches:  ");
		houseHeightFeet = in.nextDouble();
		
		
		//Enter the remaining inches of the house's length
		System.out.print("Enter the remaining inches in the house's length:  ");
		houseLengthInches = in.nextDouble();
		houseLengthFeet += houseLengthInches/12;
		
		//Enter the remaining inches of the house's width
		System.out.print("Enter the remaining inches in the house's width:  ");
		houseWidthInches = in.nextDouble();
		houseWidthFeet += houseWidthInches/12;
		
		//Enter the remaining inches of the house's height
		System.out.print("Enter the remaining inches in the house's height:  ");
		houseHeightInches = in.nextDouble();
		houseHeightFeet += houseHeightInches/12;
		
		//Enter the dimensions of the windows
		System.out.print("Enter the dimensions for length of the windows in feet without the remainder of inches:  ");
		windowLengthFeet = in.nextDouble();
		System.out.print("Enter the dimensions for height of the windows in feet without the remainder of inches:  ");
		windowHeightFeet = in.nextDouble();
		System.out.print("Enter the dimensions for length of the windows for the remainder of inches:  ");
		windowLengthInches = in.nextDouble();
		windowLengthFeet += windowLengthInches/12;
		System.out.print("Enter the dimensions for height of the windows for the remainder of inches:  ");
		windowHeightInches = in.nextDouble();
		windowHeightFeet += windowHeightInches/12;
		
		//Enter the dimensions of the doors
		System.out.print("Enter the dimensions for length of the doors in feet without the remainder of inches:  ");
		doorLengthFeet = in.nextDouble();
		System.out.print("Enter the dimensions for height of the doors in feet without the remainder of inches:  ");
		doorHeightFeet = in.nextDouble();
		System.out.print("Enter the dimensions for length of the doors for the remainder of inches:  ");
		doorLengthInches = in.nextDouble();
		doorLengthFeet += doorLengthInches/12;
		System.out.print("Enter the dimensions for height of the doors for the remainder of inches:  ");
		doorHeightInches = in.nextDouble();
		doorHeightFeet += doorHeightInches/12;
		
		//Enter the number of windows
		System.out.print("Enter the number of windows:  ");
		windowNumber = in.nextInt();
		
		//Enter the number of doors
		System.out.print("Enter the number of doors:  ");
		doorNumber = in.nextInt();
		
		//Enter the cost the painter charges for square foot
		System.out.print("Enter the cost the painter charges for square foot: ");
		sqFootCost = in.nextDouble();
		
		//Calculate how many square feet are in the peak sides
		sqFootPeak = (houseLengthFeet * houseWidthFeet) + (.5 * (houseLengthFeet * (houseHeightFeet - houseWidthFeet)));
		
		//Calculate how many square feet are in a normal side
		sqFootNormal = (houseWidthFeet * houseLengthFeet);
		
		//Calculate the square footage of the windows
		sqFootWindows = (windowHeightFeet * windowLengthFeet);
		
		//Multiply the number of windows by the square footage of the windows
		totalWindows = (sqFootWindows * windowNumber);
		
		//Calculate the square footage of the doors
		sqFootDoors = (doorHeightFeet * doorLengthFeet);
		
		//Multiply the square footage by the doors by the number of doors
		totalDoors = (sqFootDoors * doorNumber);
		
		//Add the total square footage of the normal sides to the peak sides(multiply by 2 because there is 2 sides of each)
		sqFootTotalSides = (2 * sqFootNormal) + (2 * sqFootPeak);
		
		//Add the square footage of windows to the square footage of doors
		totalSubtractedFootage = (totalDoors + totalWindows);
		
		//Subtract the square footage of the windows and doors from the total square footage of the house
		sqFootEndingTotal = (sqFootTotalSides - totalSubtractedFootage);
		
		//Multiply this ending square footage with the cost per hour
		endingCost = (sqFootEndingTotal * sqFootCost);
		
		//Print out the total cost for painting
		System.out.println("The total cost to paint the house is " + formatter.format(endingCost) + ".");
		
		
		
		
		
		
		
/* Paste output here:
 * Enter the whole length in feet of the house without the remainder of inches:  40
Enter the whole width in feet of the house without the remainder of inches:  15
Enter the whole height in feet of the house without the remainder of inches:  25
Enter the remaining inches in the house's length:  0
Enter the remaining inches in the house's width:  0
Enter the remaining inches in the house's height:  0
Enter the dimensions for length of the windows in feet without the remainder of inches:  4
Enter the dimensions for height of the windows in feet without the remainder of inches:  2
Enter the dimensions for length of the windows for the remainder of inches:  0
Enter the dimensions for height of the windows for the remainder of inches:  0
Enter the dimensions for length of the doors in feet without the remainder of inches:  6
Enter the dimensions for height of the doors in feet without the remainder of inches:  3
Enter the dimensions for length of the doors for the remainder of inches:  0
Enter the dimensions for height of the doors for the remainder of inches:  0
Enter the number of windows:  10
Enter the number of doors:  2
Enter the cost the painter charges for square foot: 5
The total cost to paint the house is $13,420.00.

 * 

 */


	}

}
