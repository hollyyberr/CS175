

import java.util.Scanner;

public class E54 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = scanner.nextInt();
		System.out.println("Enter a number: ");
		int numberTwo = scanner.nextInt();
		System.out.println("Enter a number: ");
		int numberThree = scanner.nextInt();

		if (number == numberTwo && numberTwo == numberThree) {
			System.out.print("The numbers are all the same");
		}
		else if (number != numberTwo && number != numberThree && numberTwo != numberThree) {
			System.out.print("The numbers are all different");
		}
		else 
			System.out.print("Neither");

	}
}


