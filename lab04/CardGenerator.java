//Lab 04
//Card Generator Program
//
//  A random number generator selects a number between
//  1 and 52.  An if statement is used to assign a suit.  
//  A switch statement is used to assign the identity of 
//  card.  Name of randomly selected card is printed.

public class CardGenerator{
    //main method required for every Java program
    public  static void main(String[] args) {
    
    int cardValue = 0;  //declare card value as int
    String suit = "suit"; //declare suit as a string
    String cardType = "Blank"; //declard card time as a string 
        //Inital values set to avoid complier scope error
    int card = (int)(Math.random()*52)+1; //Generate random number between 1 and 52
    if (card <= 13){  //If card is less or equal to 13 assign suit diamonds 
        suit = "diamonds";
        cardValue = card;
    }
    else if (card <= 26){
        suit = "clubs";  // If card value is between 13 and 26 assign suit clubs and adjust card value
        cardValue = card - 13;
    }
    else if (card <= 39){
        suit = "hearts"; //If card value is between 26 and 39 assign hearts clubs and adjust card value
        cardValue = card - 26;
    }
    else if (card <= 52){
        suit = "spades";  //// If card value is between 39 and 52 assign suit spades and adjust card value
        cardValue = card - 39;
    }
    switch ( cardValue ) {  //switch cardValue # to appropriate card
        case 1:
            cardType = "Ace";  //e.g. switch carValue 1 to Ace
            break;
        case 2: 
            cardType = "Two";    
            break;
        case 3:
            cardType = "Three"; 
            break;
         case 4:
            cardType = "Four";
            break;
        case 5: 
            cardType = "Five";
            break;
        case 6:
            cardType = "Six";
            break;
        case 7:
            cardType = "Seve";
         case 8:
            cardType = "Eight";
            break;
        case 9: 
            cardType = "Nine";
            break;
        case 10:
            cardType = "Ten";
            break;
        case 11:
            cardType = "Jack";
            break;
        case 12: 
            cardType = "Queen";
            break;
        case 13:
            cardType = "King";
            break;
    }
    System.out.println("You picked the " + cardType + " of " + suit);
    
    }
}