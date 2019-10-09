package homeworks2;

import java.util.Scanner;

public class RectangleSides {


	
	public static void main(String[] args) {
		double lengthRectangle = 0;
		double heightRectangle = 0;
		double areaRectangle = 0;
		double diagonalRectangle = 0;
		double perimeterRectangle = 0;
		double lengthSquared = 0;
		double heightSquared = 0;
		double sumOfSquares = 0; 
		//scan in numbers from user
		Scanner in = new Scanner(System.in);
		//ask for length of rectangle
		System.out.print("Please enter the length of the rectangle: ");
		lengthRectangle = in.nextDouble();
		//ask for height of rectangle
		System.out.print("Please enter the height of the rectangle: ");
		heightRectangle = in.nextDouble();
		
		//calculate area, perimeter, and diagonal
		areaRectangle = (lengthRectangle * heightRectangle);
		perimeterRectangle = (lengthRectangle * 2) + (heightRectangle * 2);
		lengthSquared = Math.pow(lengthRectangle, 2);
		heightSquared = Math.pow(heightRectangle, 2);
		sumOfSquares = lengthSquared + heightSquared;
		diagonalRectangle = Math.sqrt(sumOfSquares);

		//print values
		System.out.println("The length of your rectangle is: " + lengthRectangle + ".");
		System.out.println("The height of your rectangle is: " + heightRectangle + ".");
		System.out.println("The area of your rectangle is: " + areaRectangle + ".");
		System.out.println("The perimeter of your rectangle is: " + perimeterRectangle + ".");
		System.out.println("The diagonal of your rectangle is: " + diagonalRectangle + ".");


		

	}

}
