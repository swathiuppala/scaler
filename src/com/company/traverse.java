package com.company;

import java.util.Scanner;

public class traverse {
    static int[][] create2DArray(){
        System.out.println("Enter the number of rows and columns");

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        //Allocate & Create the Array
        int[][] arr = new int[rows][cols];

        //Read the data
        for(int i=0; i<rows; i++){
            //lets read all cols of this row
            for(int j=0; j< cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }
    static void displayArray(int[][]arr){
        //print
        for(int i=0; i<arr.length; i++){
            int columns_in_current_row = arr[i].length;
            for(int   j=0; j<columns_in_current_row; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void displayWavePrint(int[][] arr){
   int columns = arr[0].length;
   int rows = arr.length;

   for(int c=0; c< columns; c++){
       if(c % 2 == 0){
           //top to bottom
           for(int r=0;r < rows; r++){
               System.out.print(arr[r][c]+ " ");
           }
       }else{
           //bottom to top
           for(int r=rows-1; r>=0;r--){
               System.out.print(arr[r][c]+" ");
           }
       }
   }
    }

    public static void main(String[] args) {
        int[][] arr = create2DArray();
        displayArray(arr);
        System.out.println();
        displayWavePrint(arr);
    }
}
