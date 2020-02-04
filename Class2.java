package edu.monmouth.cs176.s1299693.mp01;

import java.util.Scanner;

public class Class2 {

	//create and initialize local scanner
	Scanner scan = new Scanner(System.in);

	//Create and initialize local variables
	int two = 2;
	int one = 1;
	int x = 0;
	double avg = 0;
	int add = 0;

	//Create and initialize array
	int [] integers; 

	//Create constructor 
	public void GetInteger (int length) {
		for(int i=0; i < length; i++) {
			integers[i] = 0;
		}
	}

	//Create the load method to read in integers
	public void loadInt() {
		for(int i=0; i < integers.length; i++) {
			System.out.print("Enter a a series of integers: ");
			integers[i] = scan.nextInt();
		}
	}

	//prints the content of the array
	public void printIntegers() {
		for(int i = 0; i < (integers.length)/two; i++) {
			add += integers[i];
		}
		avg = add/integers.length;
		System.out.println("The average of the numbers is: " + avg);
		for(int i = 0; i < (integers.length)/two; i++) {
			x = integers[i];
			integers[i] = integers[integers.length - i - one];
			integers[integers.length - i - one] = x;
		}
		for(int j = 0; j < integers.length; j++) {
			if(integers[j] == avg) {
				System.out.print("The numbers are the same");
			}
			else if(integers[j] < avg) {
				System.out.print("The number is less than the average " + avg);
			}
			else if(integers[j] > avg) {
				System.out.print("The number is greater than the average " + avg);
			}
		}

	}
}

