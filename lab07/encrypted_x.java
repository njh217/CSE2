///////////////////////////////////////////////////////////////////
//Nick Hirdt
//Lab 07
//Nested Loop- Encrypted X
//  User is prompted to enter a valid 10 digit ISBN number,
//  it is checked for validity, if the number is not valid
//  returns check digit that would make it valid
//  if not 10 digits, returns error prompts user for a proper ISBN//
import java.util.Scanner;  //import scanner

public class encrypted_x{
    // main method required for every Java program
    public static void main(String[] args) {
//an integer to store the user input
double myInt = 0;
//swtiches to decide if input is correct
boolean acceptable = false;
// loop unitl acceptable input (interger between 0 and 100)
System.out.print("Input an interger between 0-100:  ");
Scanner myScanner = new Scanner( System.in );
while( !acceptable ){
    //check if input is an interger
    if ( myScanner.hasNextInt() ){
        //if so, check its in the correct range
        myInt = myScanner.nextInt();
        if ( myInt >= 0 && myInt <= 100 ){
            acceptable = true;
        }
        else{
            System.out.println("    ERROR: need a value between 0-100");
            System.out.print("Input your interger between 0-100:  ");
            myScanner.next();
            return;
        }
    }
    else{
        System.out.println("    ERROR: need an integer");
        System.out.print("Input your interger between 0-100:  ");
        myScanner.next();
    }
//print outer loop
for(int i = 0; i < myInt; i++){
    //print inner loop
    for(int j = 0; j < myInt; j++){
        if ( i == j ){
            System.out.print(" ");
            j++;
        }
        else if ( j == (myInt - i) ){
            System.out.print("-");
            j++;
        }
        else{
            System.out.print("*");
        }
    }
    System.out.println(" ");
}
}
}  //end of main method   
      } //end of class
