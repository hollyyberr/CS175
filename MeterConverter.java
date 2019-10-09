package homeworks2;

import java.util.Scanner;

public class MeterConverter {

	public static void main(String[] args) {
	double meters = 0;
	double miles = 0;
	double feet = 0;
	double inches = 0;
	//ask for input
	Scanner in = new Scanner(System.in);
	System.out.print("Enter you number in meters: ");
	meters = in.nextDouble();
	//convert meters to miles
	miles = (meters * 0.00062137);
	feet = (meters * 3.2808);
	inches = (feet*12.0);
	//print values
	System.out.println("You entered: " + meters + " meters.");
	System.out.println("Your value in miles is: " + miles + "miles.");
	System.out.println("Your value in feet is: " + feet + "feet.");
	System.out.println("Your value in inches is: " + inches + "inches.");
	
	}

}
