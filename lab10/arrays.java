/*
Nick Hirdt
CSE 02
Prof Chen
Lab 10

Program prompts user to enter 5-10 student names (randomized value)
.  A second array is then generated with randomized intergers 0-100
Two members of each array are printed out per line.
*/
import java.util.Scanner;

public class arrays{ 

//  add main method
  public static void main(String[] args) {
       
int arraySize = 5 + (int)(Math.random()*10);
System.out.println("Enter " + arraySize + " students names:");
String[] students = new String[arraySize];
int[] grades = new int[arraySize];
Scanner myScanner = new Scanner(System.in);

for(int i = 0; i < arraySize; i++){
    students[i] = myScanner.next(); 
    grades[i] = 0 + (int)(Math.random()*100);
}

System.out.println();

for(int j =0; j < arraySize; j++){
    System.out.println(students[j] + " : " + grades[j]);
}














    }
  }