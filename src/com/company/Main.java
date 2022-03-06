package com.company;

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int count;

        for(int i=1; i<=T; i++){
            int N = scan.nextInt();

            while(N>0){
                count =N%10;
                N = N/10;
                if(count%10 >0){
                    System.out.print(count);
                }
                count++;
            }
            System.out.println();
        }

    }
}