/*  Nick Hirdt
    CSE02
    10/20/15
    HW08
    String Analysis
    
    Program examines either a string of characters or a specific number
    of characters in a string, a determines if they are letters.  The 
    user enters a string and can choose to examine all characters or just 
    a certain number.  Two methods are used in addition to the main method.
    
*/

import java.util.Scanner;  //import scanner

//declare class
public class StringAnalysis{
    
//add main method
public static void main(String[] args){

//declare and intialize boolean for status of string, to be used later
boolean stringStatus = true;
boolean bugFix = false;
//user is prompted to enter string

System.out.print("Please enter a String: ");

//Scanner is initalized
Scanner myScanner = new Scanner( System.in ); 
// user string stored in string variable "userString"
String userString = myScanner.next();
//Standard for "yes" string declared and initalized
String yesStandard = "yes";
//Prompt user to input how much of the string to evaluate
System.out.print("If you would like to evaluate entire string type 'yes', otherwise enter number of characters to evaluate: ");
//if statement to check if scanner has interger
if (myScanner.hasNextInt()){
    //if scanner does have interger it is stored as variable
    int myInt = myScanner.nextInt();
    //StringChecker method called upon
    //Note: specifically the method useing a boolean and an interger input
    stringStatus = StringChecker( userString, myInt );
    //If method returns true print result
    if (stringStatus){
        System.out.println("String contains only letters.");
    }
    //If method returns false print result
    else if (!stringStatus){
        System.out.println("String contains number(s)");
        
    }
    bugFix = true;
    System.exit(0);
    
}
String yesCheck = myScanner.next();
//checks if user inputed "yes"
if (yesStandard.equals(yesCheck) && bugFix == false){
    stringStatus = StringChecker( userString );
    if (stringStatus){
        System.out.println("String contains only letters.");
    }
    else if (!stringStatus){
        System.out.println("String contains number(s)");
    }
}
//if user did not input "yes" or a valid int print error message
    else if (bugFix == false){
        System.out.println("ERROR: Please try again");
    }

}
    
//  method for "yes"
public static boolean StringChecker( String userString ){
    //store length of string user entered in interger
    int length = userString.length();
    //decalre and initalize boolean outside of loop
    boolean goodString = true;
    //loop to check if each chacter up until the interger the user entered is a letter
    for(int i = 0; i < userString.length(); i++ ){
    char charChecker = userString.charAt(i);
    if (Character.isLetter(charChecker)) {
    goodString = true;
    }
    //if character is not letter return false and break loop
    else{
    goodString = false;
    break;
    }
}
//return the value of varaible goodString
//true = all letter and false = contains atleast one number
return goodString;
}

//  method for interger input
public static boolean StringChecker( String userString, int myInt ){
    //store length of string user entered in interger
    int length = userString.length();
    if (myInt > length){
        myInt = length;
    }
    //decalre and initalize boolean outside of loop
    boolean goodString = true;
    //loop to check if each chacter up until the interger the user entered is a letter
    for(int i = 0; i < myInt; i++ ){
    char charChecker = userString.charAt(i);
    if (Character.isLetter(charChecker)) {
    goodString = true;
    }
     //if character is not letter return false and break loop
    else{
    goodString = false;
    break;
    }
}
//return the value of varaible goodString
//true = all letter and false = contains atleast one number
return goodString;
}
}












