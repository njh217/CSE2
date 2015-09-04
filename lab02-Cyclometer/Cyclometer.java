////////////////////////////////////////
//Nick Hirdt
//Lab 02
// Cyclometer Java Program
//    Programs prints number of minutes for each trip
//    Program prints number of counts for each trip
//    Program prints the distance of each trip in miles
//    Program prints the distance of the two trips combined


//define a class
public class Cyclometer {
    //main method (required for every java program)
    public static void main(String[] args) {

// our input data
    int secsTrip1=480;  //Number of seconds of trip1
    int secsTrip2=3220;  //Number of seconds of trip2
    int countsTrip1=1561;  //Number of counts of trip1
    int countsTrip2=9037;  //Number of counts of trip2
//Our intermediate variables and output data
    double wheelDiameter=27.0,  // wheel diameter
    PI=3.14159, // pi value
    feetPerMile=5280,  // feet in a mile
    inchesPerFoot=12,  // inches in a foot
    secondsPerMinute=60;  // seconds in a minute
    double distanceTrip1, distanceTrip2, totalDistance;  //variable for output
//Print length of trips and counts
    System.out.println("Trip 1 took " + (secsTrip1/secondsPerMinute) + " minutes and had " 
    + countsTrip1 + " counts." );
    System.out.println("Trip 2 took " + (secsTrip2/secondsPerMinute) + " minutes and had "
    + countsTrip2 + " counts.");
//Compute distance of trips
    distanceTrip1=countsTrip1*wheelDiameter*PI;
    distanceTrip1=inchesPerFoot*feetPerMile;  //gives distance in miles
    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    totalDistance=distanceTrip1+distanceTrip2;
    //Print out trip distances
    System.out.println("Trip 1 was " + distanceTrip1 + " miles");
    System.out.println("Trip 2 was " + distanceTrip2 + " miles");
    System.out.println("The total distance was " + totalDistance + " miles");
    }  //end of main method
}  //end of class