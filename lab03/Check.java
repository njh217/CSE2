///////////////////////////////////////////////////////////////////
//Nick Hirdt
//Lab 03
//Check Program
//
//  Scanner obtains original cost of check,
//  desired tip percentage, & number of ways to split check       
//  prints out amount each person should pay  //
import java.util.Scanner;  //import scanner

public class Check{
    // main method required for every Java program
    
    
    Scanner myScanner = new Scanner( System.in );  //consruct the instance of scanner 
    System.out.print("Enter the original cost of the check in the form xx.xx: ");
    double checkCost = myScanner.nextDouble();
    System.out.print("Enter the percentage tip that you wish to pay as whole number (in the form xx): " );
    double tipPercent = myScanner.nextDouble();
    tipPercent /= 100;  //We want to convert the percentage into a decimal value
    System.out.print("Enter the number of people who went out to dinner: ");
    int numPeople = myScanner.nextInt();
    double totalCost;
    double costPerPerson;
    int dollars,  //whole dollar amount of cost
          dimes, pennies;  //for storing digits
              //to the right of the decimal point
              //for the cost$
    totalCost = checkCost * (1 + tipPercent);
    costPerPerson = totalCost / numPeople;
    //get the whole amount, dropping the decimal fraction
    dollars=(int)costPerPerson;
    //get dimes amount
    dimes=(int)(costPerPerson * 10) % 10;
    pennies=(int)(costPerPerson * 100) % 10;
    System.out.println("Each person in the group owes $"+ dollars + '.' + dimes + pennies);
}  //end of main method   
      } //end of class
