/*Nick Hirdt
  CSE02
  Lab07
  10/01/15
  "GetLoopy"
  */

public class GetLoopy{
    public static void main(String[] args){

//Step 1
System.out.println("Step 1:");
int i = 1;
int j = 1;
while ( i <= 7 ){
        System.out.print( i );
        i++;
    }
while ( j <= 7 ){
        System.out.print("7");
        j++;
    }
System.out.println();
//step 2
int inputValue = 10;
System.out.println("Step 2:");
while ( inputValue <= 100 ){
        int myFactor = 2;
    while( myFactor < inputValue ){
	        if ( (inputValue % myFactor == 0) ){
		    break;
	        }
	        else if (!(inputValue % myFactor == 0 && myFactor == 99) ){
	        System.out.print( inputValue + " ");
	        }
	    myFactor++;
	    break;
    }
inputValue++;
}
        
    }
}