import java.text.NumberFormat;
import java.util.Scanner;

public class CouponCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		NumberFormat formatter = NumberFormat.getCurrencyInstance();

		System.out.print("Please enter the cost of your groceries or any other response to end: ");

		while (scanner.hasNextDouble()) {

			double groceryCost = scanner.nextDouble();

			if (groceryCost >= 10 && groceryCost <= 1000) {
				if (groceryCost < 10) {
					System.out.println("No coupon received");
				} 
				else if (groceryCost <= 60) {
					double discount = .08;
					System.out.println("You have received a discount coupon of " + formatter.format(groceryCost*discount));
				}
				else if (groceryCost <= 150){
					double discount = .10;
					System.out.println("You have received a discount coupoon of " + formatter.format(groceryCost*discount));
				}
				else if (groceryCost <= 210) {
					double discount = .12;
					System.out.println("You have received a discount coupon of " + formatter.format(groceryCost*discount));
				}
				else if (groceryCost > 210) {
					double discount = .14;
					System.out.println("You have received a discount coupon of " + formatter.format(groceryCost*discount));
				}
			}


			else {
				System.out.println("Input out of range");
			}
			System.out.print("Please enter the cost of your groceries or any other response to end: ");

		}

	}
}

