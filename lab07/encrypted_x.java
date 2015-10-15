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
//check to verify good length and width values
boolean lengthInt = false;
boolean lengthRange = false;
//loop until you get acceptable length (i.e. if it's an intereger less than 80)
System.out.print("Input your desired size: ");
Scanner myScanner = new Scanner( System.in );
//infinite loop only broken when length value is valid
while ( lengthInt == false | lengthRange == false){ 
    if (!myScanner.hasNextInt()){  //If non valid interger is input enter loop
    System.out.println("    Error. Please type an integer."); 
    System.out.print("Please type desired size: ");
    myScanner.next();  //Scanner looks for next input
    }
    else if (myScanner.hasNextInt()){  //if valid double is input
    myInt = myScanner.nextInt();  //store monday expenses as next double
        if( myInt < 0 | myInt > 100 ){ //if expenses monday is less than 0 return 0
	    System.out.println("Please only enter a value between 0 and 80.");
	    System.out.print("Please type desired length: ");
        }
        else{  //if good value change boolean values to exit loop
            lengthInt = true;
            lengthRange = true;
        break; //break from while loop if valid int and between 0-80
        }
    }
}
// loop unitl acceptable input (interger between 0 and 100)

//print outer loop
for(int row = 1; row <= myInt; row++ ){ //loops for height
    for(int col = 1; col <= myInt; col++ ){ //loops for length
        if( row == col ){ //print # for first case
            System.out.print(" ");
        }
        
        else if(( col - row ) == myInt){  // prints \
            System.out.print(" ");
        }
        else if(((col + row) - 1) % myInt == 0){
            if((row + col ) % (myInt + 1) == 0){
                System.out.print(" ");
            }
            else{
            System.out.print("X"); //prints # for second case
            }
        }
        else{
            System.out.print("X");
        }
     if ( col == myInt ){
        System.out.println(); //begins next row after finishing printing previous row
    }   
    }
}

} //end of main method   
      } //end of class
