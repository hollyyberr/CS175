package Exam3;

import java.util.Scanner;

public class NestedLoops {
	public static void main(String[] args) {
//declare and initialize local variables
		int x;
		int y;
		int multiples;
		int max = 10;
		int greaterNum = 100;
//first for loop
		for (x = 1; x <= max; x++) {
//nested for loop
			for (y = 1; y <= max; y++) {
				multiples = x * y;
				System.out.print(multiples);
				if(multiples < 10){
					System.out.print("    ");
				}
				else if(multiples >= greaterNum){
					System.out.print("  ");
				}
				else if(multiples >= max){
					System.out.print("   ");
				}

			}
//print each number row on a new line
			System.out.println();
		}
	}
}