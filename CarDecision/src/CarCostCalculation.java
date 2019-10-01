import java.text.NumberFormat;
import java.util.Scanner;

public class CarCostCalculation {

	public static void main(String[] args) {
		// This program is going to determine if a hybrid car will pay back compared to a regular car over a span of 5 years
		double costHybrid = 0;
		double costRegular = 0;
		double mpgHybrid = 0;
		double mpgRegular = 0;
		double milesPerYear = 0;
		double costPerGallon = 0;
		double yearGasReg = 0;
		double yearGasHybrid = 0;
		int year = 0;

		//Scan in numbers for code
		Scanner in = new Scanner(System.in);
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		
		//Enter Cost of regular car: 
		System.out.print("Enter the cost of the regular car: ");
		costRegular = in.nextDouble();

		//Enter Miles per gallon of regular car:
		System.out.print("Enter the MPG of the regular car: ");
		mpgRegular = in.nextDouble();

		//Enter Cost of hybrid car:
		System.out.print("Enter the cost of the hybrid car: ");
		costHybrid = in.nextDouble();

		//Enter Miles per gallon of hybrid car: 
		System.out.print("Enter the MPG of the hybrid car: ");
		mpgHybrid = in.nextDouble();

		//Enter miles traveled in a year:
		System.out.print("Enter the miles traveled in a year: ");
		milesPerYear = in.nextDouble();

		//Enter cost per gallon of gas: 
		System.out.print("Enter the cost per gallon of gas: ");
		costPerGallon = in.nextDouble();

		yearGasReg = milesPerYear / mpgRegular * costPerGallon;
		yearGasHybrid = milesPerYear / mpgHybrid * costPerGallon;

		while (year <= 4) {
			year++;
			costRegular += yearGasReg;
			costHybrid += yearGasHybrid;
			System.out.println("The cost to own after year " + year + " for a regular car is " + formatter.format(costRegular) + ".");
			System.out.println("The cost to own after year " + year + " for a hybrid car is " + formatter.format(costHybrid) + ".");
			if (costHybrid < costRegular) {
				System.out.println("The hybrid car pays back after " + year + " years.");
			}
			else {
				System.out.println("The hybrid car does not pay back after " + year + " years.");

			}
		}
	}
}
