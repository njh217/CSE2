/*
Nick Hirdt
CSE 02
Prof Chen
HW 10
Main program "Shuffling" utilizes 3 methods "shuffle(list)",
"randomizeHand(list) " and "printArray(list)".
Program shuffles deck of cards, prints out the deck,
picks out a hand and then prints out the hadn

*/

import java.util.Scanner;  //import scanner
//define a class
public class Shuffling{
    //add main method
  public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
	//suits club, heart, spade or diamond
     String[] suitNames={"C","H","S","D"};   
String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};
String[] cards = new String[52];
String[] hand = new String[5];
for (int i=0; i<52; i++){ //creat array for cards
  cards[i]=rankNames[i%13]+suitNames[i/13];
}
printArray(cards);
System.out.println("Shuffled");
shuffle(cards);
printArray(cards);
hand = randomizeHand(cards);
System.out.println("Hand");
printArray(hand);
  }
  
// method to shuffle deck
public static void shuffle( String[] cards ){
    for (int i=0; i<cards.length; i++) {
	//find a random card to swap with
	    int target = (int) (cards.length * 
		Math.random() );


	    //swap the card values
	    String temp = cards[target];
	    cards[target] = cards[i];
	    cards[i] = temp;
    }
    //return cards;
}

// method to draw random handfrom shuffled deck
public static String[] randomizeHand( String[] cards ){
    for (int i=0; i<cards.length; i++) {
	//find a random member to swap with
	    int target = (int) (cards.length * 
		Math.random() );


	    //swap the values
	    String temp = cards[target];
	    cards[target] = cards[i];
	    cards[i] = temp;
    }
    String[] handArray = new String[5];
    for(int i = 0; i < 5; i++){
    handArray[i] = cards[i];  //create an array made of 5 random cards
}
    return handArray;
}

// method to print hand drawn 
public static void printArray( String[] list ){
    for(int i = 0; i < list.length; i++)
    {
     System.out.print(list[i] + " ");   
    }
    System.out.println();
} 
}







