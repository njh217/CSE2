/////////////////////////////////////////////////////////////////
//Nick Hirdt
//HW 02
//Arithmetic Java Program
//
//  first compile the program
//      javac Arithmetic.java
//  run the program
//      java Arithmetic//

//define class Arithmetic
public class Arithmetic{
//  add main method
  public static void main(String[] args) {
//input variables
    int nSocks=3;  //  Number of pairs of socks
    double sockCost$=2.58;  //  Cost per pair of socks
    int nGlasses=6;  //  Number of drinking glasses
    double glassCost$=2.29;  //  Cost per glass
    int nEnvelopes=1;  //  Number of boxes of envelopes
    double envelopeCost$=3.25;  //  Cost per box of envelopes
    double taxPercent=0.06;  //  Tax Percent
    double totalSockCost$;  //  Total cost of socks
    double totalglassCost$;  //  Total cost of glass
    double totalenvelopeCost$;  //  Total cost of envelopes
    double sockTax$;  //  Tax on socks
    double glassTax$;  //  Tax on glass
    double envelopeTax$;  //  Tax on envelopes 
    double totalTax$;  //  Total Tax
//Print items being bought, number bought & price
    System.out.println(nSocks + " Pairs of Socks @  $" + sockCost$ + " per pair");
    System.out.println(nGlasses + " Glasses @  $" + glassCost$ + " per glass");
    System.out.println(nEnvelopes + " Envelope @  $" + envelopeCost$ + " per envelope");
//Calculate total Cost of each item & tax on item 
    totalSockCost$= nSocks * sockCost$;
    sockTax$= (totalSockCost$ * taxPercent);
//Print total Cost of each item & tax on item
    System.out.printf("The total socks cost is $%,.2f%n", sockCost$ + "plus a tax of $%,.2f%n", sockTax)$; 
     }
  }