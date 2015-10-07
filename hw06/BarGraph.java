///////////////////////////////////////////////////////////////////
//Nick Hirdt
//HW 06
//Bar Graph
//
//  User is prompted to enter expenses for each day of a week,
//  code outputs a bar graph as a visual representation of
//  spending, esitmate average expendiure and expected expediture
//  for four years.//
import java.util.Scanner;  //import scanner

public class BarGraph{
    // main method required for every Java program
    public static void main(String[] args) {
 
    Scanner myScanner = new Scanner( System.in );  //consruct the instance of scanner
//declare expense variables and initalize values
double expensesMonday = -1;
double expensesTuesday = -1;
double expensesWednesday = -1;
double expensesThursday = -1;
double expensesFriday = -1;
double expensesSaturday = -1;
double expensesSunday = -1;

//User inputs expenses to be stored as doubles & forced to be positive intergers   
System.out.print("Expenses for Monday:      $");
while (!myScanner.hasNextDouble() | expensesMonday <0 ){ //Checks input is double & expenses Monay is not <0
    if (!myScanner.hasNextDouble()){  //If non valid interger is input enter loop
    System.out.print("Please only enter a valid interger.  Try again:");    
    myScanner.next();  //Scanner looks for next input
    }
    else if (myScanner.hasNextDouble()){  //if valid double is input
    expensesMonday = myScanner.nextDouble();  //store monday expenses as next double
        if( expensesMonday < 0 ){ //if expenses monday is less than 0 return 0
	    System.out.print("Please only enter positive numbers. Try again:    ");
        }
        else{
        break; //break from while loop if valid double and not less than 0
        }
    }
}

//see while loop for expensesMonday for complete comments
System.out.print("Expenses for Tuesday:     $");
while (!myScanner.hasNextDouble() | expensesTuesday <0 ){
    if (!myScanner.hasNextDouble()){
    System.out.print("Please only enter a valid interger.  Try again:");    
    myScanner.next();
    }
    else if (myScanner.hasNextDouble()){
    expensesTuesday = myScanner.nextDouble();
        if( expensesTuesday < 0 ){
	    System.out.print("Please only enter positive numbers. Try again:    ");
        }
        else{
        break;
        }
    }
}
System.out.print("Expenses for Wednesday:   $");
    while (!myScanner.hasNextDouble() | expensesWednesday <0 ){
    if (!myScanner.hasNextDouble()){
    System.out.print("Please only enter a valid interger.  Try again:");    
    myScanner.next();
    }
    else if (myScanner.hasNextDouble()){
    expensesWednesday = myScanner.nextDouble();
        if( expensesWednesday < 0 ){
	    System.out.print("Please only enter positive numbers. Try again:    ");
        }
        else{
        break;
        }
    }
}
    
System.out.print("Expenses for Thursday:    $");
while (!myScanner.hasNextDouble() | expensesThursday <0 ){
    if (!myScanner.hasNextDouble()){
    System.out.print("Please only enter a valid interger.  Try again:");    
    myScanner.next();
    }
    else if (myScanner.hasNextDouble()){
    expensesThursday = myScanner.nextDouble();
        if( expensesThursday < 0 ){
	    System.out.print("Please only enter positive numbers. Try again:    ");
        }
        else{
        break;
        }
    }
}
    
System.out.print("Expenses for Friday:      $");
    while (!myScanner.hasNextDouble() | expensesFriday <0 ){
    if (!myScanner.hasNextDouble()){
    System.out.print("Please only enter a valid interger.  Try again:");    
    myScanner.next();
    }
    else if (myScanner.hasNextDouble()){
    expensesFriday = myScanner.nextDouble();
        if( expensesFriday < 0 ){
	    System.out.print("Please only enter positive numbers. Try again:    ");
        }
        else{
        break;
        }
    }
}
    
System.out.print("Expenses for Saturday:    $");
    while (!myScanner.hasNextDouble() | expensesSaturday <0 ){
    if (!myScanner.hasNextDouble()){
    System.out.print("Please only enter a valid interger.  Try again:");    
    myScanner.next();
    }
    else if (myScanner.hasNextDouble()){
    expensesSaturday = myScanner.nextDouble();
        if( expensesSaturday < 0 ){
	    System.out.print("Please only enter positive numbers. Try again:    ");
        }
        else{
        break;
        }
    }
}
    
System.out.print("Expenses for Sunday:      $");
    while (!myScanner.hasNextDouble() | expensesSunday <0 ){
    if (!myScanner.hasNextDouble()){
    System.out.print("Please only enter a valid interger.  Try again:");    
    myScanner.next();
    }
    else if (myScanner.hasNextDouble()){
    expensesSunday = myScanner.nextDouble();
        if( expensesSunday < 0 ){
	    System.out.print("Please only enter positive numbers. Try again:    ");
        }
        else{
        break;
        }
    }
}
//Calculate total expenses for week
    double expensesTotal = expensesMonday + expensesTuesday + expensesWednesday + expensesThursday + expensesFriday + expensesSaturday + expensesSunday;
//Calculate  % fluctuation and adjust avg
int percent = (int)(Math.random()*40)+1;  //Use random number generator to calculate % fluctuation
double percentMultiplier = (percent * .01) + .8;  //Adjust percent into proper multiplier
double avgExpenses = percentMultiplier * expensesTotal;  //calculate avg adjusted with flux
//Calculate estimated expenditure for 4 years
double estimatedExpend = 208 * avgExpenses; 
//Doubles are converted to strings for bar graph visual representation
// each dollar is equal to one 
double myFactor1 = .49;  //counter declared and intialized outside of loop
String mondayBar = " ", star = "*";
//While loop adds * for each whole interger
while( myFactor1 < expensesMonday ){
	mondayBar = mondayBar + star; //add strings
	expensesMonday--;  //subtract 1 from expensesMonday, ensures loop is run correct number of times
}
double myFactor2 = .49;
String tuesdayBar = " ";
while( myFactor2 < expensesTuesday ){
	tuesdayBar = tuesdayBar + star;
	expensesTuesday--;
}
double myFactor3 = .49;
String wednesdayBar = " ";
while( myFactor3 < expensesWednesday ){
	wednesdayBar = wednesdayBar + star;
	expensesWednesday--;
}
double myFactor4 = .49;
String thursdayBar = " ";
while( myFactor4 < expensesThursday ){
	thursdayBar = thursdayBar + star;
	expensesThursday--;
}
double myFactor5 = .49;
String fridayBar = " ";
while( myFactor5 < expensesFriday ){
	fridayBar = fridayBar + star;
	expensesFriday--;
}
double myFactor6 = .49;
String saturdayBar = " ";
while( myFactor6 < expensesSaturday ){
	saturdayBar = saturdayBar + star;
	expensesSaturday--;
}
double myFactor7 = .49;
String sundayBar = " ";
while( myFactor3 < expensesSunday ){
	sundayBar = sundayBar + star;
	expensesSunday--;
}
//Print bar graph
System.out.println("Mon:    " + mondayBar);
System.out.println("Tues:   " + tuesdayBar);
System.out.println("Wed:    " + wednesdayBar);
System.out.println("Thur:   " + thursdayBar);
System.out.println("Fri:    " + fridayBar);
System.out.println("Sat:    " + saturdayBar);
System.out.println("Sun:    " + sundayBar);
//print avg weekly espenses and four year estimated expenditure
System.out.printf(" Your average weekly expenses are: $%,.2f%n ", avgExpenses);  //print avg weekly expenses
System.out.printf("Your estimated expenditure for four years is: $%,.2f%n ", estimatedExpend);
 }  //end of main method   
      } //end of class
