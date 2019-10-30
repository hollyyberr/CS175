import java.util.Scanner;

public class E56 {

	public static void main(String[] args) {
	//Scan in input
		Scanner scan = new Scanner(System.in);
			System.out.println("Enter a number: ");
			int number = scan.nextInt();
			System.out.println("Enter a number: ");
			int numberTwo = scan.nextInt();
			System.out.println("Enter a number: ");
			int numberThree = scan.nextInt();
			
			System.out.print("How would you like to compare? (Lenient or Strict) ");
			String mode = scan.next();

			if (mode.equals("Strict")) {
				if (number < numberTwo && numberTwo < numberThree) {
					System.out.println("The numbers are in increasing order.");
				}
				else if (number > numberTwo && numberTwo > numberThree) {
					System.out.println("The numbers are in decreasing order.");
				}
				else {
					System.out.println("The numbers are not in order.");
				}
			}
			else if (mode.equals("Lenient")) {
				if (number <= numberTwo && numberTwo <= numberThree) {
					System.out.println("The numbers are in increasing order.");
				}
				else if (number >= numberTwo && numberTwo >= numberThree) {
					System.out.println("The numbers are in decreasing order.");
				}
				else if (number == numberTwo && numberTwo == numberThree) {
					System.out.println("The numbers are both in increasing order and decreasing order.");
				}
				else {
					System.out.println("The numbers are not in order.");
				}
			}
	}

}

