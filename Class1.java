package edu.monmouth.cs176.s1299693.mp01;

import java.util.Scanner;

public class Class1 {

	//create and initialize local scanner
	Scanner scan = new Scanner(System.in);

	//create and initialize local variables
	int one = 1;
	int two = 2;
	String x;

	//Constructor setting up the array
	String []strings;
	public void GetString (int length) {
		for(int i=0; i < length; i++) {
			strings[i] = " ";
		}
	}
	//Load method calling the scanner and prompts user to enter strings
	public void loadStrings() {
		for(int i=0; i < strings.length; i++) {
			System.out.print("Enter a a series of strings: ");
			strings[i] = scan.nextLine();
		}
	}
	//prints the content of the array
	public void printStrings() {
		for(int i = 0; i < (strings.length)/two; i++) {
			x = strings[i];
			strings[i] = strings[strings.length - i - one];
			strings[strings.length - i - one] = x;

		}
	}
}
