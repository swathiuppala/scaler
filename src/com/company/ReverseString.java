package com.company;

import java.util.Scanner;

public class ReverseString {
    static int countRev(String A) {
        int count = 0;
        int ptr2 = A.length()-1;
        for(int i=0;i<A.length();i++){
            if(A.charAt(i) != A.charAt(ptr2)){
                count++;
            }
            ptr2--;
        }

        return count;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        System.out.println(countRev(S));
    }
}
