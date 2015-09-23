//HW 04
//Poker Hand Check Program
//
//  A 5 card poker hand is generated from random draws
//  from 5 independent decks of cards.  Checks for pair,
//  2 of a kind or 3 of a kind.  If none are present,
//  prints that it is a high card hand.

public class PokerHandCheck{
    //main method required for all java programs
    public static void main(String[] args) {
    
    System.out.println("Your cards were:"); //print first line of result
//  Select 5 Cards
    //  Select Card 1
    int card1Value = 0;  //declare card value as int
    String suit1 = "suit"; //declare suit as a string
    String card1Type = "Blank"; //declard card time as a string 
        //Inital values set to avoid complier scope error
    int card1 = (int)(Math.random()*52)+1; //Generate random number between 1 and 52
    if (card1 <= 13){  //If card is less or equal to 13 assign suit diamonds 
        suit1 = "diamonds";
        card1Value = card1;
    }
    else if (card1 <= 26){
        suit1 = "clubs";  // If card value is between 13 and 26 assign suit clubs and adjust card value
        card1Value = card1 - 13;
    }
    else if (card1 <= 39){
        suit1 = "hearts"; //If card value is between 26 and 39 assign hearts clubs and adjust card value
        card1Value = card1 - 26;
    }
    else if (card1 <= 52){
        suit1 = "spades";  //// If card value is between 39 and 52 assign suit spades and adjust card value
        card1Value = card1 - 39;
    }
    switch ( card1Value ) {  //switch cardValue # to appropriate card
        case 1:
            card1Type = "Ace";  //e.g. switch carValue 1 to Ace
            break;
        case 2: 
            card1Type = "Two";    
            break;
        case 3:
            card1Type = "Three"; 
            break;
         case 4:
            card1Type = "Four";
            break;
        case 5: 
            card1Type = "Five";
            break;
        case 6:
            card1Type = "Six";
            break;
        case 7:
            card1Type = "Seve";
         case 8:
            card1Type = "Eight";
            break;
        case 9: 
            card1Type = "Nine";
            break;
        case 10:
            card1Type = "Ten";
            break;
        case 11:
            card1Type = "Jack";
            break;
        case 12: 
            card1Type = "Queen";
            break;
        case 13:
            card1Type = "King";
            break;
    }
        System.out.println("    You picked the " + card1Type + " of " + suit1);
    
    //  Select Card 2
    int card2Value = 0;  //declare card value as int
    String suit2 = "suit"; //declare suit as a string
    String card2Type = "Blank"; //declard card time as a string 
        //Inital values set to avoid complier scope error
    int card2 = (int)(Math.random()*52)+1; //Generate random number between 1 and 52
    if (card2 <= 13){  //If card is less or equal to 13 assign suit diamonds 
        suit2 = "diamonds";
        card2Value = card2;
    }
    else if (card2 <= 26){
        suit2 = "clubs";  // If card value is between 13 and 26 assign suit clubs and adjust card value
        card2Value = card2 - 13;
    }
    else if (card2 <= 39){
        suit2 = "hearts"; //If card value is between 26 and 39 assign hearts clubs and adjust card value
        card2Value = card2 - 26;
    }
    else if (card2 <= 52){
        suit2 = "spades";  //// If card value is between 39 and 52 assign suit spades and adjust card value
        card2Value = card2 - 39;
    }
    switch ( card2Value ) {  //switch cardValue # to appropriate card
        case 1:
            card2Type = "Ace";  //e.g. switch carValue 1 to Ace
            break;
        case 2: 
            card2Type = "Two";    
            break;
        case 3:
            card2Type = "Three"; 
            break;
         case 4:
            card2Type = "Four";
            break;
        case 5: 
            card2Type = "Five";
            break;
        case 6:
            card2Type = "Six";
            break;
        case 7:
            card2Type = "Seve";
         case 8:
            card2Type = "Eight";
            break;
        case 9: 
            card2Type = "Nine";
            break;
        case 10:
            card2Type = "Ten";
            break;
        case 11:
            card2Type = "Jack";
            break;
        case 12: 
            card2Type = "Queen";
            break;
        case 13:
            card2Type = "King";
            break;
    }
        System.out.println("    You picked the " + card2Type + " of " + suit2);
    
    //  Select Card 3
    int card3Value = 0;  //declare card value as int
    String suit3 = "suit"; //declare suit as a string
    String card3Type = "Blank"; //declard card time as a string 
        //Inital values set to avoid complier scope error
    int card3 = (int)(Math.random()*52)+1; //Generate random number between 1 and 52
    if (card3 <= 13){  //If card is less or equal to 13 assign suit diamonds 
        suit3 = "diamonds";
        card3Value = card3;
    }
    else if (card3 <= 26){
        suit3 = "clubs";  // If card value is between 13 and 26 assign suit clubs and adjust card value
        card3Value = card3 - 13;
    }
    else if (card3 <= 39){
        suit3 = "hearts"; //If card value is between 26 and 39 assign hearts clubs and adjust card value
        card3Value = card3 - 26;
    }
    else if (card3 <= 52){
        suit3 = "spades";  //// If card value is between 39 and 52 assign suit spades and adjust card value
        card3Value = card3 - 39;
    }
    switch ( card3Value ) {  //switch cardValue # to appropriate card
        case 1:
            card3Type = "Ace";  //e.g. switch carValue 1 to Ace
            break;
        case 2: 
            card3Type = "Two";    
            break;
        case 3:
            card3Type = "Three"; 
            break;
         case 4:
            card3Type = "Four";
            break;
        case 5: 
            card3Type = "Five";
            break;
        case 6:
            card3Type = "Six";
            break;
        case 7:
            card3Type = "Seve";
         case 8:
            card3Type = "Eight";
            break;
        case 9: 
            card3Type = "Nine";
            break;
        case 10:
            card3Type = "Ten";
            break;
        case 11:
            card3Type = "Jack";
            break;
        case 12: 
            card3Type = "Queen";
            break;
        case 13:
            card3Type = "King";
            break;
    }
        System.out.println("    You picked the " + card3Type + " of " + suit3);
   
    //  Select Card 4
    int card4Value = 0;  //declare card value as int
    String suit4 = "suit"; //declare suit as a string
    String card4Type = "Blank"; //declard card time as a string 
        //Inital values set to avoid complier scope error
    int card4 = (int)(Math.random()*52)+1; //Generate random number between 1 and 52
    if (card4 <= 13){  //If card is less or equal to 13 assign suit diamonds 
        suit4 = "diamonds";
        card4Value = card4;
    }
    else if (card4 <= 26){
        suit4 = "clubs";  // If card value is between 13 and 26 assign suit clubs and adjust card value
        card4Value = card4 - 13;
    }
    else if (card4 <= 39){
        suit4 = "hearts"; //If card value is between 26 and 39 assign hearts clubs and adjust card value
        card4Value = card4 - 26;
    }
    else if (card4 <= 52){
        suit4 = "spades";  //// If card value is between 39 and 52 assign suit spades and adjust card value
        card4Value = card4 - 39;
    }
    switch ( card4Value ) {  //switch cardValue # to appropriate card
        case 1:
            card4Type = "Ace";  //e.g. switch carValue 1 to Ace
            break;
        case 2: 
            card4Type = "Two";    
            break;
        case 3:
            card4Type = "Three"; 
            break;
         case 4:
            card4Type = "Four";
            break;
        case 5: 
            card4Type = "Five";
            break;
        case 6:
            card4Type = "Six";
            break;
        case 7:
            card4Type = "Seve";
         case 8:
            card4Type = "Eight";
            break;
        case 9: 
            card4Type = "Nine";
            break;
        case 10:
            card4Type = "Ten";
            break;
        case 11:
            card4Type = "Jack";
            break;
        case 12: 
            card4Type = "Queen";
            break;
        case 13:
            card4Type = "King";
            break;
    }
        System.out.println("    You picked the " + card4Type + " of " + suit4);    
   
   //  Select Card 5
    int card5Value = 0;  //declare card value as int
    String suit5 = "suit"; //declare suit as a string
    String card5Type = "Blank"; //declard card time as a string 
        //Inital values set to avoid complier scope error
    int card5 = (int)(Math.random()*52)+1; //Generate random number between 1 and 52
    if (card5 <= 13){  //If card is less or equal to 13 assign suit diamonds 
        suit5 = "diamonds";
        card5Value = card5;
    }
    else if (card5 <= 26){
        suit5 = "clubs";  // If card value is between 13 and 26 assign suit clubs and adjust card value
        card5Value = card5 - 13;
    }
    else if (card5 <= 39){
        suit5 = "hearts"; //If card value is between 26 and 39 assign hearts clubs and adjust card value
        card5Value = card5 - 26;
    }
    else if (card5 <= 52){
        suit5 = "spades";  //// If card value is between 39 and 52 assign suit spades and adjust card value
        card5Value = card5 - 39;
    }
    switch ( card5Value ) {  //switch cardValue # to appropriate card
        case 1:
            card5Type = "Ace";  //e.g. switch carValue 1 to Ace
            break;
        case 2: 
            card5Type = "Two";    
            break;
        case 3:
            card5Type = "Three"; 
            break;
         case 4:
            card5Type = "Four";
            break;
        case 5: 
            card5Type = "Five";
            break;
        case 6:
            card5Type = "Six";
            break;
        case 7:
            card5Type = "Seve";
         case 8:
            card5Type = "Eight";
            break;
        case 9: 
            card5Type = "Nine";
            break;
        case 10:
            card5Type = "Ten";
            break;
        case 11:
            card5Type = "Jack";
            break;
        case 12: 
            card5Type = "Queen";
            break;
        case 13:
            card5Type = "King";
            break;
    }
        System.out.println("    You picked the " + card5Type + " of " + suit5);
    
//Check hand
    //Check for three of a kind
    boolean threeKind = false;
    if (card1Value == card2Value && card2Value == card3Value){  //check case 1 
        threeKind = true;
    }
    else if (card1Value == card2Value && card2Value == card4Value){
        threeKind = true;  //check case 2
    }
    else if (card1Value == card2Value && card2Value == card5Value){
        threeKind = true; //check case 3
    }
    else if (card2Value == card3Value && card3Value == card4Value){
        threeKind = true;  //check case 4
    }
    else if (card2Value == card3Value && card3Value == card5Value){
        threeKind = true;  //check case 5
    }
    else if (card3Value == card4Value && card4Value == card5Value){
        threeKind = true;  //check case 6
    }
    //check for first set of pairs
    boolean pair1 = false;
    if (card1Value == card2Value){  //check case 1 
        pair1 = true;
        card1Value = 0; //by changing value this pair is not double counted
    }
    else if (card1Value == card3Value){
        pair1 = true;  //check case 2
        card1Value = 0;
    }
    else if (card1Value == card4Value){
        pair1 = true; //check case 3
        card1Value = 0;
    }
    else if (card1Value == card5Value){
        pair1 = true;  //check case 4
        card1Value = 0;
    }
    else if (card2Value == card3Value){
        pair1 = true;  //check case 5
        card2Value = 0;
    }
    else if (card2Value == card4Value){
        pair1 = true;  //check case 6
        card2Value = 0;
    }
    else if (card2Value == card5Value){
        pair1 = true;  //check case 7
        card2Value = 0;
    }
    else if (card3Value == card4Value){
        pair1 = true;  //check case 8
        card3Value = 0;
    }
    else if (card3Value == card5Value){
        pair1 = true;  //check case 9
        card3Value = 0;
    }
    else if (card4Value == card5Value){
        pair1 = true;  //check case 10
        card4Value = 0;
    }
    //check for second set of pairs
    boolean pair2 = false;
    if (card1Value == card2Value){  //check case 1 
        pair2 = true;
    }
    else if (card1Value == card3Value){
        pair2 = true;  //check case 2
    }
    else if (card1Value == card4Value){
        pair2 = true; //check case 3
    }
    else if (card1Value == card5Value){
        pair2 = true;  //check case 4
    }
    else if (card2Value == card3Value){
        pair2 = true;  //check case 5
    }
    else if (card2Value == card4Value){
        pair2 = true;  //check case 6
    }
    else if (card2Value == card5Value){
        pair2 = true;  //check case 7
    }
    else if (card3Value == card4Value){
        pair2 = true;  //check case 8
    }
    else if (card3Value == card5Value){
        pair2 = true;  //check case 9
    }
    else if (card4Value == card5Value){
        pair2 = true;  //check case 10
    }
    
    //print result
    System.out.println("");
    if (threeKind == true){  
        System.out.println("You have three of a kind!");
    }
    else if (pair1 == true && pair2 == false){
        System.out.println("You have a pair!"); 
    }
    else if (pair1 == true && pair2 == true){
        System.out.println("You have two pairs!");
    }
    else if (threeKind == true && pair1 == true){
        System.out.println("You have three of a kind and a pair!");
    }
    else if (threeKind == false && pair1 == false){
        System.out.println("You have a highcard hand!");
    }

    }
}