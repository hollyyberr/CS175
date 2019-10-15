import java.text.NumberFormat;
import java.util.Scanner;

public class CouponCalculator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		NumberFormat formatter = NumberFormat.getCurrencyInstance();

		int continueProgram = 1;
		
while (continueProgram == 1) {
		System.out.print("Please enter the cost of your groceries: ");
		double groceryCost = in.nextDouble();
		
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
		System.out.print("Would you like to calculate more coupons? Enter 1 for yes and 0 for no: ");
		continueProgram = in.nextInt();
		}
	}

	}

