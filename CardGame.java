import java.util.Random;
import java.util.Scanner;

public class CardGame {

	public static void main(String[] args) {
		// Random number generator
		Random generator = new Random();
		//Declare and intialize array for each hand
		int countH = 0;
		int countC = 0;
		int countD = 0;
		int countS = 0;
		int heartLow = 1;
		int heartMax = 13;
		int diamondLow = 14;
		int diamondMax = 26;
		int clubLow = 27;
		int clubMax = 39;
		int spadeLow = 40;
		int spadeMax = 52;
		
		int [] myHand = new int [5];
		int [] yourHand = new int [5];
		String mySuit = null;
		String yourSuit = null;


		for(int x = 0; x < myHand.length; x++) {

			myHand [x] = generator.nextInt(52) + 1;
			if(myHand[x] >= heartLow && myHand[x]<= heartMax) {
				countH++;
			}
			else if (myHand[x] >= diamondLow && myHand[x] <= diamondMax) {
				countD++;
			}
			else if(myHand[x] >= clubLow && myHand[x] <= clubMax)
			{
				countC++;
			}
			else if(myHand[x] >= spadeLow && myHand[x] <= spadeMax){
				countS++;
			}
		}
	
	for(int x = 0; x < yourHand.length; x++) {

		yourHand [x] = generator.nextInt(52) + 1;

	}

}

}
