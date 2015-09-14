///////////////////////////////////////////////////////////////////////////////
//Nick Hirdt
//HW 03
//Block Program
//  Scanner obtains height, lenght and width
//  of block.  Program calculates and prints
//  volume and surface area.  //
import java.util.Scanner;  //import scanner

public class Block{
    // main method
    public static void main(String[] args) {
        
    Scanner myScanner = new Scanner( System.in );  //construct the instance of scanner
    System.out.print("Enter the length of block: ");  //propmpt user to enter length
    double blockLength = myScanner.nextDouble();  //store next double as block length
    System.out.print("Enter the width of block: ");  //prompt user to enter width
    double blockWidth = myScanner.nextDouble();  //store next double as block width
    System.out.print("Enter the height of block: ");  //prompt user to enter height
    double blockHeight = myScanner.nextDouble();  //store next double as height
    double volume = blockLength * blockWidth * blockHeight;  //decalre volume varible and calculate
    System.out.println("The volume of the block of dimensions " + blockLength + 
    " X " + blockWidth + " X " + blockHeight + " = " + volume);  //print block volume
    double surfaceArea = (2 * blockLength * blockWidth) + (2 * blockWidth * blockHeight)
    + (2 * blockLength * blockHeight);  //calculate block surface area
    System.out.println("The surface area of the block is " + surfaceArea);  //print surface area
    }
}
