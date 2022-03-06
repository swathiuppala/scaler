package com.company;
import java.util.Scanner;
public class gcd_of_n_integers {
    static int gcd(int firstNumber, int secondNumber){
        if(firstNumber == 0 || secondNumber == 0){
            return secondNumber ==  0 ? firstNumber: secondNumber;
        }
        int ans = gcd(firstNumber % secondNumber,firstNumber);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfIntegers = sc.nextInt();
        int firstInteger = sc.nextInt();
        int gcdOfTwoDigits = 1;
        for(int i = 2; i<=numberOfIntegers; i++){
            int secondInteger = sc.nextInt();
            gcdOfTwoDigits = gcd(firstInteger,secondInteger);
           firstInteger = gcdOfTwoDigits;
        }

        System.out.println(gcdOfTwoDigits);
    }
}
