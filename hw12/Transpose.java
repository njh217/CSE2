/*
Nick Hirdt
CSE 02
HW 12 11/17/15
Transpose 

Program utilizes 3 methods in addition to a main method
in order to generate a random matrix based of a user 
input (height & width), print the matrix, then generate a 
transpose and print the transpose.

*/

import java.util.Scanner;  //import scanner

public class Transpose{

   //randomMatrix method: accepts two inputs and produces 
   //a 2D array of inergers, in row-major representation,
   //whose elements are random intergers -10 to 10
   public static int[][] randomMatrix( int height, int width ){
    int[][] randomMatrix = new int[width][height];
    for(int i = 0; i < width; i++){
        for(int j=0; j < height; j++){
            randomMatrix[i][j] = 0 + (int)(Math.random()*10);
            if( 1+ (int)(Math.random()*2) == 2){
                randomMatrix[i][j] = -1 * randomMatrix[i][j];
            }
        }
    }
    return randomMatrix;
    }

    //printMatrix:  prints 2D matricies in row-major format
    //also tests that matrix is rectangular.  
    public static void printMatrix( int[][] matrix, int height, int width ){
    for(int i = 0; i < width; i++){
        for( int j = 0; j < height; j++){
            if( matrix[i][j] > -1 ){
            System.out.print(" ");
        }
        else{
        }
        System.out.print(matrix[i][j] + " "); 
        }
        System.out.println();
    } 
    }

    //transposeMatrix: returns a transpose of original matrix
    public static int[][] transposeMatrix( int[][] matrix, int height, int width ){
        int[][] transposeMatrix = new int[height][width];
        for( int i = 0; i < width; i++){
            for( int j = 0; j < height; j++){
                transposeMatrix[j][i] = matrix[i][j];
            }
        }
     //   System.out.println("transpose method works");  //debugger
    return transposeMatrix;
    }
 
    //main method: asks user for width & height, generates
    //matrix, prints, generates transpose and prints.
    public static void main(String[] args){
    Scanner myScanner = new Scanner(System.in);
    System.out.print("Enter a width: ");
    int height = myScanner.nextInt();
    while(height < 0 ){       
        System.out.print("ERROR: Enter a positive interger: ");
        height = myScanner.nextInt();
    }
    System.out.print("Enter a height: ");
    int width = myScanner.nextInt();
    while(width < 0){
        System.out.print("ERROR: Enter a positive interger: ");
        width = myScanner.nextInt();
    }
    //set up matrix
    int[][] matrix = new int[height][width];
    // store matrix as returned matrix from the randomMatrix method
    matrix = randomMatrix(height, width);
    System.out.println("Random Matrix:");
    //use print method to print random matrix
    printMatrix(matrix, height, width);
    System.out.println("Transpose Matrix:");
    int[][] Tmatrix = new int[width][height];
    Tmatrix = transposeMatrix(matrix, height, width);
    //use print matrix to print transposed matrix * notice the switched width and height
    printMatrix(Tmatrix, width, height);
    }
}


