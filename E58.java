import java.util.Scanner;

public class E58 {

	public static void main(String[] args) {



			    Scanner scan = new Scanner(System.in);
			    System.out.println("Please enter four numbers:  ");
			      int a = scan.nextInt();
			      int b = scan.nextInt();
			      int c = scan.nextInt();
			      int d = scan.nextInt();

			        if((a==b && c == d)|| (a==c && b==d) || (c==b && a==d)) {

			        System.out.println("Two pairs.");

			         }
			        else{
			             System.out.println("Not two pairs.");
			        }
			      }
			    

	}


