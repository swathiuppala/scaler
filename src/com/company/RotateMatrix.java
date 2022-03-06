package com.company;

import java.util.Scanner;

public class RotateMatrix {

    static void solve(int[][] A) {

        int n = A.length;

        // Transpose the matrix
        //1st row becomes 1st column so on....
        //i-->> rows;  j-->> columns
        //swap only upper triangle
        for (int i = 0; i < n; i++)
        {
            for (int j = i; j < n; j++)
            {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }

        // swap columns or reverse the columns
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n / 2; j++)
            {
                int temp = A[i][j];
                A[i][j] = A[i][n - j - 1];
                A[i][n - j - 1] = temp;
            }
        }
    }
    public static void main(String[] args) {

    }

}
