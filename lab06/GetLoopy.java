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
int i = 0;
int j = 0;
while ( i <= 7 ){
        System.out.print( i );
        i++;
    }
while ( j <= 7 ){
        System.out.print("7");
        j++;
    }
System.out.println();
int checker = 0;
//step 2
System.out.println("Step 2:");
//While loop portion
System.out.print("WHILE LOOP: ");
int counterWL = 10;
while( counterWL < 101 ){
    checker = 2;
    while(checker < counterWL){
        if(counterWL % checker == 0){
            break;
        }
        if(checker == counterWL - 1){
            System.out.print(counterWL + " ");
        }
        checker ++;
    }
    counterWL ++;
}
System.out.println();
//For loop portion
System.out.print("FOR LOOP: ");
for(counterWL = 2; counterWL < 101; counterWL++){
    for(checker = 2; checker < counterWL; checker++){
        if(counterWL % checker == 0){
            break;
        }
        if(checker == counterWL - 1){
            System.out.print(counterWL + " ");
        }
    }
}
System.out.println();
//do while loop portion
System.out.print("DO WHILE LOOP: ");
counterWL = 2;
do{
    checker = 2;
    do{
        if(counterWL % checker == 0){
            break;
        }
        if(checker == counterWL - 1){
            System.out.print(counterWL + " ");
        }
        checker ++;
    }while(checker < counterWL);
    counterWL ++;
}while(counterWL < 101);
System.out.println();
System.out.println("Step 3:");
int limit = (int)(Math.random()*195)+5;
for (int q = 1; q < limit + 1; q++){
    System.out.print(":o ");
    if(q % 20 == 0){
        System.out.println();
    }
}
System.out.println();
    }
}