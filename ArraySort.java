import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
	public static void main(String[] args) {
		int lowest;
		String printedNumbers;
		double[] numbers = {88,47,90,50,77,83,92,96,62,79};
		double[] numberSort = new double[10];

		for (int x = 0; x < numbers.length; x++) {
			for (int y = x; y < numbers.length; y++) {
				if (numbers[x] > numbers[y]) {
					lowest = (int) numbers[x];
					numbers[x] = numbers[y];
					numbers[y] = lowest;
				}
			}
		}
		
		printedNumbers = Arrays.toString(numbers);
		System.out.println(printedNumbers);
	}
}




