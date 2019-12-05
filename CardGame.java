import java.util.Arrays;
import java.util.Random;

public class CardGame {

	public static void main(String[] args) {

		Random generator = new Random();

		int countH = 0, countD = 0, countC = 0, countS = 0, countDraw = 0, 
				myDraw = 0, yourDraw = 0, myLowRange = 0, myHighRange = 0,
				yourLowRange = 0, yourHighRange = 0, count1 = 0, count2 = 0;
		String mySuit = null;
		String yourSuit = null;
		int[] myHand = new int[5];
		int[] yourHand = new int[5];
		int five  = 5;
		int one = 1;
		int thirteen = 13;
		int fourteen = 14;
		int twentysix = 26;
		int twentyseven = 27;
		int thirtynine =  39;
		int fourty = 40;
		int fiftytwo = 52;
		boolean winner = false;

		//assigns card values to both hands and determines suit
		for (int i = 0; i < myHand.length; i++) {
			myHand[i] = generator.nextInt(fiftytwo) + one;
			if (myHand[i] >= one && myHand[i] <= thirteen) {
				countH++;
			}
			else if (myHand[i] >= fourteen && myHand[i] <= twentysix) {
				countD++;
			}
			else if (myHand[i] >= twentyseven && myHand[i] <= thirtynine) {
				countC++;
			}
			else if (myHand[i] >= fourty && myHand[i] <= fiftytwo) {
				countS++;
			}
			if (countH >= countD && countH >= countC && countH >= countS) {
				mySuit = "Hearts";
				myLowRange = one;
				myHighRange = thirteen;
			}
			else if (countD >= countH && countD >= countC && countD >= countS) {
				mySuit = "Diamonds";
				myLowRange = fourteen;
				myHighRange = twentysix;
			}
			else if (countC >= countH && countC >= countD && countC >= countS) {
				mySuit = "Clubs";
				myLowRange = twentyseven;
				myHighRange = thirtynine;
			}
			else if (countS >= countH && countS >= countC && countS >= countD) {
				mySuit = "Spades";
				myLowRange = fourty;
				myHighRange = fiftytwo;
			}
		}
		countH = 0;
		countD = 0;
		countC = 0;
		countS = 0;
		for (int j = 0; j < yourHand.length; j++) {
			yourHand[j] = generator.nextInt(fiftytwo) + one;
			if (yourHand[j] >= one && yourHand[j] <= thirteen) {
				countH++;
			}
			else if (yourHand[j] >= fourteen && yourHand[j] <= twentysix) {
				countD++;
			}
			else if (yourHand[j] >= twentyseven && yourHand[j] <= thirtynine) {
				countC++;
			}
			else if (yourHand[j] >= fourty && yourHand[j] <= fiftytwo) {
				countS++;
			}
			if (countH >= countD && countH >= countC && countH >= countS) {
				yourSuit = "Hearts";
				yourLowRange = one;
				yourHighRange = thirteen;
			}
			else if (countD >= countH && countD >= countC && countD >= countS) {
				yourSuit = "Diamonds";
				yourLowRange = fourteen;
				yourHighRange = twentysix;
			}
			else if (countC >= countH && countC >= countD && countC >= countS) {
				yourSuit = "Clubs";
				yourLowRange = twentyseven;
				yourHighRange = thirtynine;
			}
			else if (countS >= countH && countS >= countC && countS >= countD) {
				yourSuit = "Spades";
				yourLowRange = fourty;
				yourHighRange = fiftytwo;
			}
		}
		System.out.println("My hand has five cards: " + Arrays.toString(myHand));
		System.out.println("Your hand has five cards: " + Arrays.toString(yourHand));
		System.out.println("My suit is " + mySuit + ".");
		System.out.println("Your suit is " + yourSuit + ".");

		//repeats card draw until winner
		while (!winner) {
			countDraw++;
			myDraw = generator.nextInt(fiftytwo) + one;
			System.out.println("My draw " + countDraw + ": " + myDraw);
			yourDraw = generator.nextInt(fiftytwo) + one;
			System.out.println("Your draw " + countDraw + ": " + yourDraw);
			if (myDraw >= myLowRange && myDraw <= myHighRange) {
				for (int x = 0; x < myHand.length; x++) {
					if (myHand[x] < myLowRange || myHand[x] > myHighRange) {
						myHand[x] = myDraw;
						break;
					}
				}
			}
			count1 = 0;
			for (int z = 0; z < five;z++) {
				if (myHand[z] >= myLowRange && myHand[z] <= myHighRange) {
					count1++;
				}
			}
			System.out.println("\tMy new hand is " + Arrays.toString(myHand));
			if (count1 == five ) {
				winner = true;
				System.out.println("I am the winner.");
				break;
			}
			if (yourDraw >= yourLowRange && yourDraw <= yourHighRange) {
				for (int x = 0; x < yourHand.length; x++) {
					if (yourHand[x] < yourLowRange || yourHand[x] > yourHighRange) {
						yourHand[x] = yourDraw;
						break;
					}
				}
			}
			count2 = 0;
			for (int y = 0; y < five; y++) {
				if (yourHand[y] >= yourLowRange && yourHand[y]<= yourHighRange){
					count2++;
				}
			}
			System.out.println("\tYour new hand is " + Arrays.toString(yourHand));
			if (count2 == five) {
				winner = true;
				System.out.println("You are the winner.");
				break;
			}

		}
		System.out.println("The game is over.");



	}

}