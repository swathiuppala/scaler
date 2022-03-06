package com.company;

public class KthSmallestElement {
    static int[] kthsmallest(int[] A, int B){
        for(int r =0; r<A.length-1; r++){
            for(int i =0;i<A.length-1-r;i++){
                if(A[i]>A[i+1]){
                    int temp = A[i];
                    A[i] = A[i+1];
                    A[i+1] = temp;
                }
            }
        }
        return A;
    }

    public static void main(String[] args) {

    }
}
