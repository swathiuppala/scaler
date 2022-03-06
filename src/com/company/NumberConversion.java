package com.company;

import java.util.Scanner;

public class NumberConversion {
    static int binaryToDecimal(int n){
        int ans = 0;
        int power = 1;
        while(n>0){
            int last_bit = n%10;
            ans = ans + last_bit * power;
            power = power * 2;
            n = n/10;
        }
        return ans;
    }
    static int decimalToBinary(int d){
        int sum = 0;
        int power = 1;
        while(d>0){
            int last_bit = d % 2;
            sum = sum + last_bit * power;
            d = d/2;
            power = power * 10;
        }
        return sum;
    }
    //Generate magic number series 5,25,30,125,130,150,155,625,630,650,____
    //This magic number creates binary integers with base 5
    static int BinaryToMagicNumber(int m){
        int sum = 0;
        int power = 5;
        while(m>0){
            int last_bit = m % 2;
            sum = sum + last_bit * power;
            power = power * 5;
            m = m/2;
        }
        return sum;
    }
    static int puzzle(int p){
        int sum = 0;
        while(p>0){
            sum = sum + p%2;
            p = p/2;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number_of_testCases = sc.nextInt();
        for(int i=1;i<=number_of_testCases;i++){
           // int given_integer = sc.nextInt();
            System.out.println(puzzle(i));
        }
    }
}
