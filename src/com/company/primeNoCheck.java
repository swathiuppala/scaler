package com.company;

import java.util.Scanner;

public class primeNoCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     int A=sc.nextInt();
     int B =sc.nextInt();
        for(int i = A; i<=B; i++){
            boolean flag = true;
            for(int j=2; j*j <= i; j++){
                if(i % j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(i);

            }
        }
    }
    }


