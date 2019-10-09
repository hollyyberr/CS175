package homeworks2;

import java.util.Scanner;

public class CostPerMiles {

	public static void main(String[] args) {
		
	//scan in numbers
	Scanner in = new Scanner(System.in);
	
	//declare local variables
	double gallons = 0;
	double fuel = 0;
	double price = 0;
	double gasCost = 0;
	double distance = 0;
	
	//enter values
	System.out.print("Enter number of gallons of gas in the tank currently: ");
	gallons = in.nextDouble();
	System.out.print("Enter fuel efficiency in miles per gallon: ");
	fuel = in.nextDouble();
	System.out.print("Enter the price of gas: ");
	price = in.nextDouble();
	
	//calculations
	gasCost = (100/fuel)*price;
	distance = fuel*gallons;
	
	System.out.printf("To drive a hundred miles, the gas in the car would cost $%.2f.", gasCost);
	System.out.println();
	System.out.println("A car with " + gallons + " gallons of gas and a fuel efficiency of " + fuel + " can drive " + distance + " miles.");
	
	
	
	
	
	

	}

}
