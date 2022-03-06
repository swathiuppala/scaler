package com.company;

import java.util.Scanner;

public class Lcm_of_n_integers {
    static int gcd(int a, int b){
        if(a == 0){
            return b;
        }
        int ans = gcd(b%a, a);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int T = sc.nextInt();
        int A = sc.nextInt();
        int lcm = 1;
        for(int i = 2;i<=T;i++){
            int B = sc.nextInt();
            lcm = (A*B)/gcd(A,B);
            A = lcm;
        }
        System.out.println(lcm);
    }
}
