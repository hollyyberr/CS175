import java.util.Scanner;

public class E53 {

	public static void main(String[] args) {
		//scan in numbers for input
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int integer = scan.nextInt();
		int billion = 1000000000;
		int hunMillion = 100000000;
		int tenMillion = 10000000;
		int million = 1000000;
		int hunThousand = 100000;
		int tenThousand = 10000;
		int thousand = 1000;
		int hundred = 100;
		int ten = 10;
		int digits = 0;
		int zero = 0;
		
		
		//start comparison
		if(integer < zero ) {
			integer *= -1;
		}
		if(integer >= billion) {
			digits = 10;
		}
		else if(integer >= hunMillion) {
			digits = 9;
		}
		else if(integer >=tenMillion) {
			digits = 8;
		}
		else if(integer>=million) {
			digits = 7;
		}
		else if(integer>=hunThousand) {
			digits = 6;
		}
		else if(integer>=tenThousand) {
			digits = 5;
		}
		else if(integer>=thousand) {
			digits = 4;
		}
		else if(integer>=hundred) {
			digits = 3;
		}
		else if(integer>=ten) {
			digits = 2;
		}
		else {
			digits = 1;
		}
		System.out.print("The number of digits is " + digits + ".");
	}

}
