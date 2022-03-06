package com.company;

import java.util.Scanner;

public class gcdWithoutUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int result = 0;
        if(A == 0 || B == 0){
            result = B==0?A:B;
        }


        System.out.println(result);
    }
}
