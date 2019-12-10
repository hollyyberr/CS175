import java.util.Arrays;
import java.util.Random;

public class CardGame2 {

	public static void main(String[] args) {
		
		//create random number generator
		Random generator = new Random();
		
		//create and initialize local variables
		int countH = 0, countD = 0, countC = 0, countS = 0, countDraw = 0, myDraw = 0, yourDraw = 0;
		String mySuit = null;
		String yourSuit = null;
		int[] myHand = new int[5];
		int[] yourHand = new int[5];
		int[] deck = new int[52];
		boolean winner = false;
		int five = 5;
		int one = 1;
		int thirteen = 13;
		int fourteen = 14;
		int twentysix = 26;
		int twentyseven = 27;
		int thirtynine = 39;
		int fourty = 40;
		int fiftytwo = 52;
		int mySuitHigh = 0;
		int mySuitLow = 0;
		int yourSuitHigh = 0;
		int yourSuitLow = 0;
		int yourGoodCount = 0;
		int myGoodCount= 0;
		int card = 0;
		boolean goodCard = false;
		int zero = 0;

		//take all cards out of play to begin game
		for (int d = zero;d < fiftytwo; d++)
		{deck[d]=0;}

		//assign card values and determine myHand
		for (int i = zero; i < myHand.length; i++) {


			//draw a card for insertion using good card boolean
			while (goodCard==false) 
			{		
				card = generator.nextInt(fiftytwo)+one;
				if (deck[card-one]== zero) 
				{myHand[i] = card; deck[card-one] = one;break;}
			}	
			//end of while loop	

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
			}
			else if (countD >= countH && countD >= countC && countD >= countS) {
				mySuit = "Diamonds";
			}
			else if (countC >= countH && countC >= countD && countC >= countS) {
				mySuit = "Clubs";
			}
			else if (countS >= countH && countS >= countC && countS >= countD) {
				mySuit = "Spades";
			}
		}

		//assigns card values and determines your suit
		for (int i = zero; i < yourHand.length; i++) {

			//draw a car for insertion
			while (goodCard==false) 
			{		
				card = generator.nextInt(fiftytwo) + one;
				if (deck[card-one] == zero) 
				{yourHand[i] = card; deck[card-one] = one; break;}
			}	
			//ends while loop	

			if (yourHand[i] >= one && yourHand[i] <= thirteen) {
				countH++;
			}
			else if (yourHand[i] >= fourteen && yourHand[i] <= twentysix) {
				countD++;
			}
			else if (yourHand[i] >= twentyseven && yourHand[i] <= thirtynine) {
				countC++;
			}
			else if (yourHand[i] >= fourty && yourHand[i] <= fiftytwo) {
				countS++;
			}
			if (countH >= countD && countH >= countC && countH >= countS) {
				yourSuit = "Hearts";
			}
			else if (countD >= countH && countD >= countC && countD >= countS) {
				yourSuit = "Diamonds";
			}
			else if (countC >= countH && countC >= countD && countC >= countS) {
				yourSuit = "Clubs";
			}
			else if (countS >= countH && countS >= countC && countS >= countD) {
				yourSuit = "Spades";
			}
		}
		System.out.println("My hand has five cards: " + Arrays.toString(myHand));
		System.out.println("Your hand has five cards: " + Arrays.toString(yourHand));
		System.out.println("My suit is " + mySuit + ".");
		System.out.println("Your suit is " + yourSuit + ".");

		//print entire array deck
		System.out.println("The deck: " + Arrays.toString(deck));
		System.out.println();	

		if (mySuit.equals("Hearts")){mySuitLow=one;mySuitHigh = thirteen;}
		if (mySuit.equals("Diamonds")){mySuitLow=fourteen;mySuitHigh = twentysix;}
		if (mySuit.equals("Clubs")){mySuitLow=twentyseven;mySuitHigh = thirtynine;}
		if (mySuit.equals("Spades")){mySuitLow=fourty;mySuitHigh = fiftytwo;}
		if (yourSuit.equals("Hearts")){yourSuitLow=zero;yourSuitHigh = thirteen;}
		if (yourSuit.equals("Diamonds")){yourSuitLow=fourteen;yourSuitHigh = twentysix;}
		if (yourSuit.equals("Clubs")){yourSuitLow=twentyseven;yourSuitHigh = thirtynine;}
		if (yourSuit.equals("Spades")){yourSuitLow=fourty;yourSuitHigh = fiftytwo;}

		//THE GAMELOOP repeats card draw until winner
		while (!winner) 
		{
			countDraw++;
			//draw a card for my hand
			while (goodCard==false) 
			{		
				card = generator.nextInt(fiftytwo) + one;
				if (deck[card-one] == zero) 
				{myDraw=card;break;}
			}	
			//end of while loop	
			System.out.println("My draw " + countDraw + ": " + myDraw);

			//draw a card for your hand
			while (goodCard==false) 
			{		
				card = generator.nextInt(fiftytwo) + one;
				if (deck[card-one] == zero) 
				{yourDraw=card;break;}
			}	
			//end of while loop	
			System.out.println("Your draw " + countDraw + ": " + yourDraw);

			//Insert a card into MYHAND if it is in mysuit 
			if (myDraw>=mySuitLow && myDraw<=mySuitHigh) 
			{
				for (int i = zero; i < five; i++) 
				{
					if (myHand[i] < mySuitLow || myHand[i]> mySuitHigh) 
					{
						deck[myHand[i]-one] = zero;
						myHand[i] = myDraw;
						deck[myDraw-one] = one;
						break;}
				}


			}
			myGoodCount = zero;

			//checks myHand
			for (int j = zero; j < five; j++) 
			{
				if (myHand[j]>=mySuitLow && myHand[j]<=mySuitHigh)
				{
					myGoodCount = myGoodCount + one;
				}
			}
			System.out.println("\tMy new hand is " + Arrays.toString(myHand));
			if (myGoodCount == five )
			{winner=true;System.out.println("I am the winner.");break;}

			//inserts a card into your hand 
			if (yourDraw>=yourSuitLow && yourDraw<=yourSuitHigh) 
			{
				for (int i = zero; i < five; i++) 
				{
					if (yourHand[i] < yourSuitLow || yourHand[i]> yourSuitHigh) 
					{
						deck[yourHand[i]-one] = zero;
						yourHand[i] = yourDraw;
						deck[yourDraw-one] = zero;
						break;}
				}


			}
			yourGoodCount = zero;

			//check your hand
			for (int j = zero; j < five; j++) 
			{
				if (yourHand[j]>=yourSuitLow && yourHand[j]<=yourSuitHigh)
				{
					yourGoodCount = yourGoodCount + one;
				}
			}
			System.out.println("\tYour new hand is " + Arrays.toString(yourHand));
			if (yourGoodCount == five )
			{winner=true;System.out.println("You are the winner.");break;}

			// prints the entire deck array
			System.out.println("The deck: " + Arrays.toString(deck));
			System.out.println();	

		}		
		System.out.println("The game is over.");

		//print the entire deck array
		System.out.println("The deck: " + Arrays.toString(deck));


	}

}


