package com.company;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int ans = 0;

        for(int i=0;i<n;i++){
            for(int j=i-1;j>=0;j++){
                ans += i+j;
            }
        }

    }
}
