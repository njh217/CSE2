
import java.util.Scanner;
//define a class
public class practice01{
    
//  add main method
  public static void main(String arg[]) {
    Scanner myScanner = new Scanner(System.in);
    int enteredValue;
    System.out.println("Enter a positive 5 digit interger");
    enteredValue = myScanner.nextInt();
    if (enteredValue < 10000 || enteredValue > 99999 ){
        System.err.println("Bad value entered");
        return;
    }
    else{
        if (enteredValue / 10000 == enteredValue % 10 && enteredValue / 1000 % 10 == enteredValue / 10 % 10){
            System.out.println("The number is symmetric");
        }
        else{
            System.out.println("The number is not symmetric");
        }
    }
    
  }
}