/////////////////////////////////////////////////////////////////
//Nick Hirdt
//HW 02
//Arithmetic Java Program
//
//  Program calculates number of each product purchased
//      amount spent on each product and tax
//  and total of the entire transaction
//      java Arithmetic//

//declare class Arithmetic
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
    double transactionTotal$;  //  Total before tax
    double transactionTotalTax$;  //  Total transcation with tax
//Print items being bought, number bought & price
    System.out.println(nSocks + " Pairs of Socks @  $" + sockCost$ + " per pair");
    System.out.println(nGlasses + " Glasses @  $" + glassCost$ + " per glass");
    System.out.println(nEnvelopes + " Envelope @  $" + envelopeCost$ + " per envelope");
//Calculate total Cost of each item & tax on item 
    totalSockCost$= nSocks * sockCost$;
    sockTax$= (totalSockCost$ * taxPercent);
    totalglassCost$= (nGlasses * glassCost$);
    glassTax$= (totalglassCost$ * taxPercent);
    totalenvelopeCost$= (nEnvelopes * envelopeCost$);
    envelopeTax$= (totalenvelopeCost$ * taxPercent);
    totalTax$= (sockTax$ + glassTax$ + envelopeTax$);
//Print total Cost of each item & tax on item
    System.out.printf("The total socks cost is $%,.2f" + " plus a tax of $%,.2f%n", totalSockCost$, sockTax$);
    System.out.printf("The total glasses cost is $%,.2f" + " plus a tax of $%,.2f%n", totalglassCost$, glassTax$);
    System.out.printf("The total envelope cost is $%,.2f" + " plus a tax of $%,.2f%n", totalenvelopeCost$, envelopeTax$);
//Calculate total Transcation cost
    transactionTotal$= (totalSockCost$ + totalglassCost$ + totalenvelopeCost$);
    transactionTotalTax$= (totalSockCost$ + totalglassCost$ + totalenvelopeCost$ + totalTax$);
//Print total Transcation cost with and without tax
    System.out.printf("The total transcation cost before tax is $%,.2f%n", transactionTotal$);
    System.out.printf("The total sales tax is $%,.2f%n", totalTax$);
    System.out.printf("The total transcation cost including tax is $%,.2f%n", transactionTotalTax$);
     }
  }