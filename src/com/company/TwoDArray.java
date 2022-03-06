package com.company;

import java.util.Scanner;

public class TwoDArray {
    static void displayArray(int[][] arr){
        //i is a looping variable for rows
        for(int i = 0; i< arr.length;i++){
            int columns_in_a_row = arr[i].length;
            for(int j=0; j<columns_in_a_row; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    //take 2D Array as input
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

    static int[][] create2DArrayWithVariableColumns(){
        System.out.println("Enter the number of rows ");

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        //Allocate & Create the Array
        int[][] arr = new int[rows][];

        //Read the data
        for(int i=0; i<rows; i++){
            //lets create the inner Array
            System.out.println("Enter columns in ith row");
            int cols_in_the_current_row = sc.nextInt();
            arr[i] = new int[cols_in_the_current_row];
            //lets read all cols of this row
            for(int j=0; j< cols_in_the_current_row; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    static void hardCodedArrayDemo(){
        //Hardcoded Array
        //Jagged Array -->> Can have variable number of columns
        int[][] arr = {{10,20,30},{20,48,39,45},{23,45}};

        //print linear array ie outer array
        //this loop returns the address of the linear array with the length of each inner array
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " has "+ arr[i].length + "elements");
        }
    }
    public static void main(String[] args) {
       int[][] arr = create2DArrayWithVariableColumns();

        displayArray(arr);

    }
}
