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
		double sqFootWindows = 0;
		double sqFootDoors = 0;
		
		//Scan in numbers for code
		Scanner in = new Scanner(System.in);
		
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
		sqFootPeak = (houseLengthFeet * houseWidthFeet * (1/2) * (houseLengthFeet * (houseLengthFeet - houseWidthFeet)));
		
		
		
		
		
		
		
/*
 * 
Calculate how many square feet are in the peak sides (L*W + 1/2(L*(H-W))
Calculate how many square feet are in a normal side (L*W)
Calculate the square footage of the windows (L*W)
Multiply the number of windows by the square footage of the windows.
Calculate the square footage of the doors (L*W)
Multiply the square footage of the doors by the number of doors.
Add the total square footage of the normal sides to the peak sides.
Subtract the square footage of the windows and doors from the total square footage of the house.
Multiply this ending square footage number with the cost per hour.
Print out the total cost for painting.

 */


	}

}
