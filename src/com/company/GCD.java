package com.company;

import java.util.Scanner;

public class GCD {
    static int gcd(int a,int b){
        if(a == 0){
            return b;
        }
        return gcd(b%a,a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int result = gcd(A,B);
        System.out.print(result);
    }
}
