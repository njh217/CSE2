/*Nick Hirdt
  CSE 02
  10/20/15
  HW08
  Area
  
  Program prompts user to enter name of one of three valid shapes ("rectangle",
  "triangle" or "circle").  Program then prompts user to enter dimensions and 
  calculates area.  Program utilizes 4 methods other than the main method and 
  forces the user to enter a valid input.
  
  */

import java.util.Scanner;  //import scanner 
  //define a class
public class Area{ 

//  add main method
  public static void main(String[] args){

//  prompts user for initial input
System.out.print("Would you like to choose a rectangle, triangle or circle?  ");
Scanner myScanner = new Scanner( System.in ); 

//  Declare and intialize variable to store shape
String myShape = myScanner.next();

//  Declare and intialize boolean for while loop
boolean check = false;

//  Intializes and declares Strings for good shapes
String rectangleShape = "rectangle";
String triangleShape = "triangle";
String circleShape = "circle";

//loops until the user enters either 'rectangle', 'triangle' or 'square'.  
while( check == false ){
    check = shapeCheck( myShape );  //  calls upon shapeCheck method
    if(check == true ){
    continue;
    }
    else{
    //  if input is not valid return error and look for next input
    System.out.println("ERROR: Please enter 'rectangle', 'triangle' or 'circle'");
    myShape = myScanner.next();
    continue;
    }
}

//  declare and intialize varialbe for shape area
double shapeArea = 0;

//calculates area for rectangle
if( myShape.equals(rectangleShape)){
    System.out.print("Please enter a height:  ");
    double rectangleHeight = myScanner.nextDouble();
    System.out.print("Please enter a width:  ");
    double rectangleWidth = myScanner.nextDouble();
    shapeArea = rectangleArea( rectangleHeight, rectangleWidth );  //  calls upon rectangel area method
    System.out.println("The area of the rectangle is: " + shapeArea);
}

//  if statement to find triangle area
if (myShape.equals(triangleShape)){
    System.out.print("Please enter a height:  ");
    double triangleHeight = myScanner.nextDouble();
    System.out.print("Please enter a base length:  ");
    double baseLength = myScanner.nextDouble();
    shapeArea = triangleArea( triangleHeight, baseLength );
    System.out.println("The area of the triangle is: " + shapeArea);
}

//  if statement to find circle area
if (myShape.equals(circleShape)){
    System.out.print("Please enter a radius:  ");
    double circleRadius = myScanner.nextDouble();
    shapeArea = circleArea( circleRadius );
    System.out.println("The area of the circle is: " + shapeArea);
}
}
//  method to determine if input is valid
public static boolean shapeCheck(String myShape ){
//  declare and initialize variables for good inputs
String rectangleShape = "rectangle";
String triangleShape = "triangle";
String circleShape = "circle";
//  if statement to determine if input matches a good input
    if( myShape.equals(rectangleShape) || myShape.equals(triangleShape) || myShape.equals(circleShape) ){
        return true;
    }
    else{
        return false;
    }
}


//  method for rectangle
public static double rectangleArea( double rectangleWidth, double rectangleHeight ){
    return rectangleWidth * rectangleHeight;
}

//  method for triangle
public static double triangleArea( double triangleHeight, double baseLength ){
    return .5 * baseLength * triangleHeight;
}

//  method for circle
public static double circleArea( double circleRadius ){
    return 3.1415 * circleRadius * circleRadius;
}
  }
    
  


 

  