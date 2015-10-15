///////////////////////////////////////////////////////////////////
//Nick Hirdt
//hw 07
//Twisty
//  User is prompted to enter a length and a width.  The width must
//  be smaller than the length.  Any input with a length greater than
//  80 is rejected.  A pattern composed of two twists, 
//  slash-based and hashtag-based is created.  When the desired width 
//  is odd the hash tag and slash alternate in front.  //


//  **Note to Grader:  I have the code to the point where it works
//  in the case that length / width is 2 or less
import java.util.Scanner;  //import scanner
public class Twisty{
    public static void main(String[] args) {
        //integers to store the user input of length and width
int myLength = -1;
int myWidth = -1;
//check to verify good length and width values
boolean lengthInt = false;
boolean lengthRange = false;
boolean widthInt = false;
boolean widthRange = false;
//loop until you get acceptable length (i.e. if it's an intereger less than 80)
System.out.print("Input your desired length: ");
Scanner myScanner = new Scanner( System.in );
//infinite loop only broken when length value is valid
while ( lengthInt == false | lengthRange == false){ 
    if (!myScanner.hasNextInt()){  //If non valid interger is input enter loop
    System.out.println("    Error. Please type an integer."); 
    System.out.print("Please type desired length: ");
    myScanner.next();  //Scanner looks for next input
    }
    else if (myScanner.hasNextInt()){  //if valid double is input
    myLength = myScanner.nextInt();  //store monday expenses as next double
        if( myLength < 0 | myLength > 80 ){ //if expenses monday is less than 0 return 0
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
//loop until you get acceptable width (i.e. if it's an interger and elss than the length)
System.out.print("Input your desired width: ");
while ( widthInt == false | widthRange == false){ 
    if (!myScanner.hasNextInt()){  //If non valid interger is input enter loop
    System.out.println("    Error. Please type an integer."); 
    System.out.print("Please type desired length: ");
    myScanner.next();  //Scanner looks for next input
    }
    else if (myScanner.hasNextInt()){  //if valid double is input
    myWidth = myScanner.nextInt();  //store monday expenses as next double
        if( myWidth > myLength ){ //if expenses monday is less than 0 return 0
	    System.out.println("Please only enter a width less than the length.");
	    System.out.print("Please type desired length: ");
        }
        else{  //if good value change boolean values to exit loop
            widthInt = true;
            widthRange = true;
        break; //break from while loop if valid int and less than length
        }
    }
}
    for(int row = 1; row <= myWidth; row++ ){ //loops for height
    for(int col = 1; col <= myLength; col++ ){ //loops for length
        if( row == col ){ //print # for first case
            System.out.print("#");
        }
        else if( (row + col ) % (myWidth + 1) == 0){  // prints / or " " to avoid misprint
            if(((col - 1 + row) - 1) % myWidth == 0){
                System.out.print(" ");
            }
            else{
            System.out.print("/");
            }
        }
        else if(( col - row ) == myWidth){  // prints \
            System.out.print("\\");
        }
        else if(((col + row) - 1) % myWidth == 0){
            if((row + col ) % (myWidth + 1) == 0){
                System.out.print(" ");
            }
            else{
            System.out.print("#"); //prints # for second case
            }
        }
        else{
            System.out.print(" ");
        }
     if ( col == myLength ){
        System.out.println(); //begins next row after finishing printing previous row
    }   
    }
    
    }
    }
}
