import java.util.Scanner;

public class letterGradeConverter {

	public static void main(String[] args) {
		//scan in numbers for code
		Scanner scan = new Scanner(System.in);
		double number = 0;
		System.out.print("Enter a letter grade(followed by + or - if applicable): ");
		
		//start loop for calculations
		while(scan.hasNext()) {
		
		String letter = scan.next();
		if(letter.equals("Q")) {
			break;
		}
		if(letter.equals("A") || letter.equals("A+")) {
		number = 4.0;
		System.out.println("The number grade is " + number + ".");
		}
		else if(letter.equals("A-")) {
			number = 3.7;
			System.out.println("The number grade is " + number + ".");
		}
		else if(letter.equals("B+")) {
			number = 3.3;
			System.out.println("The number grade is " + number + ".");
		}
		else if(letter.equals("B")) {
			number = 3.0;
			System.out.println("The number grade is " + number + ".");

	}
		else if(letter.equals("B-")) {
			number = 2.7;
			System.out.println("The number grade is " + number + ".");

	}
		else if(letter.equals("C+")) {
			number = 2.3;
			System.out.println("The number grade is " + number + ".");

	}
		else if(letter.equals("C")) {
			number = 2.0;
			System.out.println("The number grade is " + number + ".");

	}
		else if(letter.equals("C-")) {
			number = 1.7;
			System.out.println("The number grade is " + number + ".");

	}
		else if(letter.equals("D+")) {
			number = 1.3;
			System.out.println("The number grade is " + number + ".");

	}
		else if(letter.equals("D")) {
			number = 1.0;
			System.out.println("The number grade is " + number + ".");

	}
		else if(letter.equals("D-")) {
			number = 0.7;
			System.out.println("The number grade is " + number + ".");

	}
		else if(letter.equals("F")) {
			number = 0.0;
			System.out.println("The number grade is " + number + ".");

	}
		else {
			System.out.println("Invalid letter grade, enter a different value: ");
		}
		System.out.print("Enter a letter grade(followed by + or - if applicable): ");
}
}
}

