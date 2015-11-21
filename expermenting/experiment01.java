
//import java.util.Scanner;  //import scanner
public class experiment01{
    
    public static int[] centroidCalculator( int[] x){
    
       int length = x.length;
       
       int xtot = 0;
       int ytot = 0;
       int ztot = 0;
       
       for(int i = 0; i < length; i++){
           if(i == 2 || i % 5 == 0){
               ztot += x[i];
           }
           else if(i == 1 || i % 4 == 0){
               ytot += x[i];
           }
           else if(i == 0 || i % 3 == 0){
               xtot += x[i];
           }
       }
       int xval = xtot / (length / 3);
       int yval = ytot / (length / 3);
       int zval = ztot / (length / 3);
       int[] centroid = {xval, yval, zval};
       for(int j = 0; j < 3; j++){
           System.out.print(centroid[j] + " ");
       }
       return centroid;
}
    
    public static void main(String[] args) {


int X[] = {1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3};
centroidCalculator(X);
}
}