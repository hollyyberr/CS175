import java.text.NumberFormat;
import java.util.Scanner;

public class ArrayCost {

	public static void main(String[] args) {
		//Declare and initialize local variables
		double milesPerYear = 0;
		double costPerGallon = 0;
		double yearGasReg = 0;
		double yearGasHyb = 0;
		int year = 0;
		
		//Scan in numbers for code
		Scanner in = new Scanner(System.in);
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		
		//Set data = to strings
		String dataHybrid = "Make:Toyota,Model:Prius,Cost:31000,MPG:30";
		String dataRegular = "Make:Toyota,Model:Corolla,Cost:28000,MPG:20";
		
		//Split into array for hybrid
		String [] hybridCar = dataHybrid.split(",");
		String[] hybridMake = hybridCar[0].split(":");
		String [] hybridModel = hybridCar[1].split(":");
		String[] hybridCost = hybridCar[2].split(":");
		String[] hybridMpg = hybridCar[3].split(":");
		double TCHyb = Integer.parseInt(hybridCost[1]);
		double mpgTwoHyb = Integer.parseInt(hybridMpg[1]);
		
		//Split into array for regular
		String [] regularCar = dataRegular.split(",");
		String[] regularMake = regularCar[0].split(":");
		String [] regularModel = regularCar[1].split(":");
		String[] regularCost = regularCar[2].split(":");
		String[] regularMpg = regularCar[3].split(":");
		double TCReg = Integer.parseInt(regularCost[1]);
		double mpgTwoReg = Integer.parseInt(regularMpg[1]);
		
		//Enter miles traveled in a year:
		System.out.print("Enter the miles traveled in a year: ");
		milesPerYear = in.nextDouble();
		
		//Enter cost per gallon of gas: 
		System.out.print("Enter the cost per gallon of gas: ");
		costPerGallon = in.nextDouble();
		
		//Calculate yearly gas cost
		yearGasReg = milesPerYear / mpgTwoReg * costPerGallon;
		yearGasHyb = milesPerYear / mpgTwoHyb * costPerGallon;
		
		while (year <= 4) {
			year++;
			TCReg += yearGasReg;
			TCHyb += yearGasHyb;
			System.out.println("The cost to own after year " + year + " for a " + regularMake[1] + " " + regularModel[1] + " " + formatter.format(TCReg) + ".");
			System.out.println("The cost to own after year " + year + " for a " + hybridMake[1] +  " " + hybridModel[1] + " " + formatter.format(TCHyb) + ".");
				if (TCHyb < TCReg) {
					System.out.println("The hybrid car pays back after " + year + " years.");
					}
					else {
						System.out.println("The hybrid car does not pay back after " + year + " years.");

 
	} 

}
	}
}

