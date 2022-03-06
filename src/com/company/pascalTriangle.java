package com.company;

public class pascalTriangle {
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

    static int[][] pascalTriangle(int n){
        int[][] arr = new int[n+1][];
        //i is a looping variable for rows
        for(int i=0;i<=n;i++){
            //create each rowArray with i+1 columns
            arr[i] = new int[i+1];
            //fill  the values in each column
            arr[i][0] = arr[i][i] = 1;
            for(int j=1;j<= i-1; j++){
                arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int n=4;
        int[][] arr = pascalTriangle(n);
        displayArray(arr);

    }
}
