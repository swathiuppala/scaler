package com.company;

import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int j=1;j<=T;j++){
            String S = sc.nextLine();
            //System.out.print("v0"+S);

            char c;

            String revStr = "";
            //System.out.print("v3"+S);
            S = S.trim();
            for(int i=0;i<S.length();i++){
                c = S.charAt(i);
                //System.out.print("vv"+S);
                revStr = c + revStr;
            }

            System.out.print("v1"+revStr);
            System.out.print("v2"+S);
            if(S.equals(revStr)){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }

    }
}
