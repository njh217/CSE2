/*
Nick Hirdt
CSE02
Lab08
10/16/15
"Stats"
Program prompts user to input 5 doubles smallest to largest.  Program checks
to make sure doubles are increasing.  Three methods are used to compute the mean,
compute the median and then print out the mean and median.

*/
import java.util.Scanner; //import scanner

public class Stats{
    public static void main(String[] args){
//doubles to store 5 inputs
double var1 = 0;
double var2 = 0;
double var3 = 0;
double var4 = 0;
double var5 = 0;
boolean increaseCheck = false;

System.out.print("Please enter 5 doubles smallest to largest:  ");
Scanner myScanner = new Scanner( System.in );
while(increaseCheck == false){
var1 = myScanner.nextDouble();
System.out.print(" ");
var2 = myScanner.nextDouble();
System.out.print(" ");
var3 = myScanner.nextDouble();
System.out.print(" ");
var4 = myScanner.nextDouble();
System.out.print(" ");
var5 = myScanner.nextDouble();

if( var1 > var2 || var2 > var3 || var3 > var4 || var4 > var5 ){
    System.out.println("    Error: doubles not entered smallest to largest.");
    System.out.println("Please enter 5 doubles smallest to largest:  ");
}
else{
    increaseCheck = true;
}
}
    }
}