package com.company;

import java.util.Scanner;

public class LCM {
    //To find optimal solution of LCM of two numbers
    static int gcd(int a,int b){
        if(a == 0){
            return b;
        }
        int ans = gcd(b%a,a);
        return ans;
    }
    public static void main(String[] args) {
        //Basic approach
       /* Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int n = A>B?A:B;
        int m = A<B?A:B;
        int i = 1;
        int lcm = 1;
        while(lcm%m > 0){
              lcm = n*i;
            i++;
        }
        System.out.println(lcm);*/
        //To find optimal solution of LCM of two numbers
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int g = gcd(A,B);
        int lcm = (A*B)/g;
        System.out.println(lcm);
    }
}
