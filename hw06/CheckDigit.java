///////////////////////////////////////////////////////////////////
//Nick Hirdt
//HW 06
//Check Digit
//
//  User is prompted to enter a valid 10 digit ISBN number,
//  it is checked for validity, if the number is not valid
//  returns check digit that would make it valid
//  if not 10 digits, returns error prompts user for a proper ISBN//
import java.util.Scanner;  //import scanner

public class CheckDigit{
    // main method required for every Java program
    public static void main(String[] args) {
//Declare and intilize variables here to avoid scope CEs 
int isbnVal = 0;
char x = '10';
String isbnValString = "";
int digit1 = 0, digit2 = 0, digit3 = 0, digit4 = 0, digit5 = 0, digit6 = 0, digit7 = 0, digit8 = 0, digit9 = 0, digit10 = 0;
    Scanner myScanner = new Scanner( System.in );  //consruct the instance of scanner
System.out.print("Please enter a 10 digit barcode:  ");
while (!myScanner.hasNextInt() | (isbnValString.length() != 10)){ //Checks input is double & expenses Monay is not <0
    while (!myScanner.hasNextInt()){  //If non valid interger is input enter loop
    System.out.print("This is not a valid ISBN.  Please enter 10 digits:  ");    
    myScanner.next();  //Scanner looks for next input
    }
    if (myScanner.hasNextInt()){  //if valid int is input
    isbnVal = myScanner.nextInt();  //store isbn value as next int
//breaks isbnVal into seperate digits   
    digit10 = isbnVal % 10;
    digit9 = isbnVal / 10 % 10;
    digit8 = isbnVal / 100 % 10;
    digit7 = isbnVal / 1000 % 10;
    digit6 = isbnVal / 10000 % 10;
    digit5 = isbnVal / 100000 % 10;
    digit4 = isbnVal / 1000000 % 10;
    digit3 = isbnVal / 10000000 % 10;
    digit2 = isbnVal / 100000000 % 10;
    digit1 = isbnVal / (1000000000);
// converts isbnVal into string inorder to easily check length
    isbnValString = "" + digit1 + digit2 + digit3 + digit4 + digit5 + digit6 + digit7 + digit8 + digit9 + digit10;
    }
        if( isbnValString.length() != 10){ //if isbn length is not 10 digits print not valid and prompt to reenter
	    System.out.print("This is not a valid ISBN. Please enter 10 digits:  ");
        myScanner.next();
        }
        else{
        break; //break from while loop if valid double and not less than 0
        }
    }
//Calculates sum total and check digit
int sumTotal = ((10 * digit1) + (9 * digit2) + (8 * digit3) + (7 * digit4) + (6 * digit5) + (5 * digit6) + (4 * digit7) + (3 * digit8) + (2 * digit9));
int checkNum = sumTotal % 11;
/*
//Built in check which can print inputted ISBN, sum total and check number
//can be uncommented to debug code
System.out.print(digit1);
System.out.print(digit2);
System.out.print(digit3);
System.out.print(digit4);
System.out.print(digit5);
System.out.print(digit6);
System.out.print(digit7);
System.out.print(digit8);
System.out.print(digit9);
System.out.println(digit10);
System.out.println(sumTotal);
System.out.println(checkNum);
*/
//Checks validity of ISBN
if ( checkNum == digit10 ){
    System.out.println("This is a valid ISBN.");
}
else if ( checkNum == 10 ){
    System.out.println("This is not a valid ISBN.  The Check digit should be X.");
}
else {
    System.out.println("This is not a valid ISBN.  The Check digit should be " + checkNum);
}


 }  //end of main method   
      } //end of class
