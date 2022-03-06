package com.company;
import java.lang.*;
import java.util.*;

//To find the largest integer
public class largestInt {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int N = scan.nextInt();
       int largest_value = Integer.MIN_VALUE;
       int i=0;
       while(i <= N){
           int value = scan.nextInt();
           if(value > largest_value){
              largest_value = value;
           }
           i++;
           System.out.println(largest_value);
       }



    }
}
