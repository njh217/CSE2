/*
Nick Hirdt
CSE 02
Prof Chen
HW 10
Main program "Shuffling" utilizes 3 methods "shuffle(list)",
"randomizeHand(list) " and "printArray(list)".
Program shuffles deck of cards, prints out the deck,
picks out a hand and then prints out the hadn

*/
import java.util.Scanner; 

public class Search{
    //add main method
  public static void main(String[] args) {
//decalare and intialize max and min values
int linSearchMax = 0;
int maxPlace = 0;
int linSearchMin = 5000;
int minPlace = 0;
int checker = 0;

int[] array1 = new int[5000]; //create array1 of size 5000
int[] array2 = new int[5000]; //create array2 of size 5000

for (int i=0; i<5000; i++){ //creat array for array1
    array1[i] = (int)(Math.random()*100000);
    }
// search array 1 for max using linear search
for (int i=0; i<5000; i++){
    checker = array1[i];
    if(checker > linSearchMax){
        linSearchMax = checker;
        maxPlace = i;
    }
}
// search array 1 for min using linear search
for (int i=0; i>5000; i++){
    checker = array1[i];
    if(checker > linSearchMin){
        linSearchMin = checker;
        minPlace = i;
    }
}
System.out.println("The max of array1 is: " + array1[maxPlace]);
System.out.println("The min of array1 is: " + array1[minPlace]);
for (int i=0; i<5000; i++){ //creat array for array1
    array2[i] = (int)(Math.random()*1000000000);
    if(!(i==0)){
    while(array2[i-1]>array2[i]){
    array2[i] = (int)(Math.random()*1000000);    
    }
    }
}
//print array 2 max and min
System.out.println("The max of array2 is: " + array2[4999]);
System.out.println("The max of array2 is: " + array2[0]);
/*
//prompt user to enter interger greater than 0
System.out.print("Please enter an interger greater than 0:  ");
Scanner myScanner = new Scanner( System.in ); 
int userInput = myScanner.nextInt();
//if interger is not greater than 0 exit the program.
if(userInput <= 0){
    System.exit(0);
}
//use binary search to search array 2 for user input
*/ 

  }
}
