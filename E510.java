import java.text.NumberFormat;
import java.util.Scanner;

public class E510 {

	public static void main(String[] args) {

		final int WORK = 40;   // standard hours in a work week

		double paycheck = 0.0;
		String name = null;
		Scanner in = new Scanner (System.in);

		//Asks user for name and hours worked
		System.out.print("Enter your name: ");
		name = in.next();
		System.out.print("Enter your hourly wage: ");
		double rate = in.nextDouble();
		System.out.print("Enter the number of hours worked: ");
		double hours = in.nextInt();

		System.out.println ();

		//Calculate overtime at "time and a half"
		if (hours > WORK) {
			paycheck = WORK * rate + (hours - WORK) * (rate * 1.5);
		}
		else {
			paycheck = hours * rate;
		}

		//Print 'paycheck'
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		System.out.println(name + "'s Paycheck: " + fmt.format(paycheck));


	}

}