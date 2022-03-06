package com.company;

import java.util.Scanner;

public class FibonacciOfNDigits {
    static boolean isPerfectSquare(int p){
        int s = (int)Math.sqrt(p);//To confirm p = s*s
        return (s*s == p);
    }
    // function to return true if f is a fibonacci
    static boolean isFibonacci(int f){
        //returns true if (5*(f^2)-4) or (5*(f^2)+4) perfect squares
        return isPerfectSquare(5*(f^2)-4)|| isPerfectSquare(5*(f^2)+4);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 1; i<=T; i++){
            int N = sc.nextInt();
            System.out.println(isFibonacci(i)?"Yes":"No");
        }
    }

}
