///////////////////////////////////////////////////////////////////
//Nick Hirdt
//HW 03
//Timer Java Program 
//
//  The program props the user to enter the current time
//  The user is then prompted to enter the time they
//  Wish to eat dinner.  The program outputs the time 
//  Left until dinner. 
import java.util.Scanner;  //import scanner

public class Timer{
    // main method required for every Java program
    public static void main(String[] args) {
    Scanner myScanner = new Scanner( System.in );  //consruct the instance of scanner
    System.out.print("Enter the current time: ");  //user prompted to enter curent time
    int currentTime = myScanner.nextInt(); //store next interger as current time
    System.out.print("Enter the time that you will be eating dinner: ");  //user prompted to enter dinner time
    int dinnerTime = myScanner.nextInt();  //store next interger as dinner time
    int cThours, cTminutes, dThours, dTminutes,
        hoursLeft, minutesLeft, current, dinner, left; //declare rest of varialbes
    cTminutes = currentTime % 100;  //determine minutes in current time using mod operator
    cThours = currentTime / 100;  //determine hours in current time using division
    dTminutes = dinnerTime % 100;  //determine minutes in dinner time using mod operator
    dThours = dinnerTime / 100;  //determine hours in dinner time using division 
    cThours = cThours * 60;  //convert current time hours to minutes
    dThours = dThours * 60;  //convert dinner time hours to minutes
    dinner = dThours + dTminutes;  //calculate dinner time in minutes
    current = cThours + cTminutes;  //calculate current time in minutes
    left = dinner - current;  //calculate time left till dinner in minutes
    hoursLeft = left / 60;  //calculate hours left till dinner
    minutesLeft = left % 60;  //calculate minutes left till dinner
    System.out.println("You have " + hoursLeft + " hours and "+ minutesLeft + " minutes until dinner."); //print result
}  //end of main method   
      } //end of class
