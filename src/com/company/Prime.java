package com.company;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int rev =0;
        while(A>0){
            //System.out.print(A%10);
            rev = rev*10 + A % 10;
           A = A/10;
        }
        System.out.println(rev);
    }
}
