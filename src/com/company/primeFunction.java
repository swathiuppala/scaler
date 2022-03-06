package com.company;

import java.util.Scanner;

public class primeFunction {

    public static boolean checkPrime(int n){
        int i = 2;
        while(i*i<=n){
            if(n%i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
    public static void  printPrimes(int A,  int B){
        for(int i = A; i<=B;i++){
            if(checkPrime(i)){
                System.out.print(i + ", ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A =  sc.nextInt();
        int B =  sc.nextInt();
        printPrimes(A,B);
    }
}
