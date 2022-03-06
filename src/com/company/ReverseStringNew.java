package com.company;

import java.util.Scanner;

public class ReverseStringNew {
    static int countRev(String A) {
        char c;
        String revStr = "";
        int count = 0;
        for(int i=0;i<A.length();i++){
            c = A.charAt(i);
            revStr = c + revStr;
          //  System.out.println(revStr);
            if(A.charAt(i) != revStr.charAt(i) ){
                count++;
                System.out.println(count);
            }
        }
        //System.out.println(revStr);
        /*for(int j=0;j<A.length();j++){
            if(A.charAt(j) != revStr.charAt(j) ){
                count++;
              //  System.out.println(count);
            }
        }*/
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        System.out.println(countRev(S));
    }
}
