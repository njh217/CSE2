/*
Nick Hirdt
CSE 02
Prof Chen
HW 11
Prompts user to enter 15 ints for finals grades for cse02, checks for good input and 
requires they be greater or equal to previous one.  Prints final input array.  User inputs
grade to search for and program uses linear search and prints number of iterations used.
Program then scrammbles the array, prints out the scrambled array and then prompts the user 
to enter a new grade to search for.


*/

import java.util.Scanner;  //import scanner
//define a class
public class CSE2Linear{
    //add main method
  public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
//Prompt user to enter grades
System.out.print("Enter 15 ints for final grades in CSE2: ");
int i = 0; //counter for ints
int iterations = 0;
int checker = 0;
int[] grades = new int[16];
int userSearch1 = 0;
grades[0]=0; //allows loop to be entered
for(i=1; i<16; i++){
    grades[i] = scan.nextInt();
    while(grades[i] < 0 || grades[i] > 100 || grades[i] < grades[i-1]){
        if(grades[i]<0 || grades[i]>100){
          System.out.print("ERROR: enter grades between 0 and 100: ");
        grades[i] = scan.nextInt();  
        }
        else{
            System.out.print("ERROR: enter grades larger than or equal to previous grade: ");
            grades[i] = scan.nextInt();
        }
    }
  }
  System.out.println("Grades: ");
  for(i=1; i<16; i++){
      System.out.print(grades[i] + " ");
  
  }
  System.out.println();
  //user prompted to search from grade
  System.out.print("Enter a grade to search for: ");
  userSearch1 = scan.nextInt();
   while(userSearch1 < 0 || userSearch1 > 100){
        System.out.print("ERROR: enter grades between 0 and 100: ");
        userSearch1 = scan.nextInt();
    }
    //binary search used to find grade
    boolean valueFound = false;
    for ( i=1; i<16; i++){
    checker = grades[i];
    if(checker == userSearch1){
        valueFound = true;
        iterations = i;
    }
   
    }
     if(valueFound){
        System.out.println("Value found in " + iterations + " iterations");
    }
    else{
        System.out.println("Value not found in 15 iterations");
    }
    //scramble grades
    for ( i=1; i<16; i++) {
	//find a random card to swap with
	    int target = (int) (grades.length * 
		(Math.random()));


	    //swap the card values
	    int temp = grades[target];
	    grades[target] = grades[i];
	    grades[i] = temp;
    }
    //print scrambled 
    System.out.println("Grades Scrambled: ");
  for(i=1; i<16; i++){
      System.out.print(grades[i] + " ");
  
  }
  System.out.println();
  valueFound=false;
  //linear search
  for ( i=1; i<16; i++){
    checker = grades[i];
    if(checker == userSearch1){
        valueFound = true;
        iterations = i;
    }
   
    }
     if(valueFound){
        System.out.println("Value found in " + iterations + " iterations");
    }
    else{
        System.out.println("Value not found in 15 iterations");
    }
  }
}







