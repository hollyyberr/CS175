import java.util.Scanner;

public class E57 {

	public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter a number: ");
			int number = scanner.nextInt();
			System.out.println("Enter a number: ");
			int numberTwo = scanner.nextInt();
			System.out.println("Enter a number: ");
			int numberThree = scanner.nextInt();

			if ((number < numberTwo && numberTwo < numberThree) || (number > numberTwo && numberTwo > numberThree)){
				System.out.print("The numbers are in order.");
			}
			else 
				System.out.print("The numbers are not in order.");

	}

}
