package com.company;

import java.util.List;
import java.util.Scanner;

public class ArrayTwo {
    static int linearSearch(int[] arr, int x){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
    //multiple repeating occurance of the key element
    static void linearSearchAll(int[] arr, int x){
        for(int i=0; i<arr.length; i++) {
            if (arr[i] == x) {
                System.out.print(i +",");
            }
        }
    }
    //
    static int[] linearSearchAllReturn(int[] arr,int x){
        int[] output = new int[arr.length +1];
        int j=0;//index of output Array
        for(int i = 0;i< arr.length;i++){
            if(arr[i]==x){
                output[j] = i;
                j = j+1;
            }

        }
       output[j] = -1;
        return output;
    }

    static int binarySearch(int[] arr,int key){
        int start = 0;
        int end = arr.length-1;

        while(start <= end ){
            int mid = (start+end)/2;
            //3 cases to be taken. <,>,=

            if(arr[mid]>key){
                end = mid -1;
            }
            else if(arr[mid] < key){
                start = mid+1;
            }
            else{
                //if end = start
                return mid;
            }
        }
        //if element is not found
        return -1;
    }
      static int binarySearchFirstOccurance(int[] arr, int key){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
         while(start<=end){
             int mid = (start+end)/2;
             if(arr[mid]> key){
                 end =mid -1;
             }
             else if(arr[mid] < key){
                 start = mid + 1;
             }
             else{
                 //equal case
                 ans = mid-1;
             }
         }
         return ans;
      }
    static int binarySearchLastOccurance(int[] arr, int key){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]> key){
                end =mid -1;
            }
            else if(arr[mid] < key){
                start = mid + 1;
            }
            else{
                //equal case
                ans = mid;
                start = mid+1;
            }
        }
        return ans;
    }

    static int binarySeaarchRec(int[] arr, int start, int end,int key){
        //base case
        if(start > end){
            return -1;
        }
        int mid = (start+end)/2;

        if(arr[mid] == key){
            return mid;
        }
        //recursive case left or right
        if(arr[mid] > key){
            return binarySeaarchRec(arr,start,mid-1,key);
        }
        return binarySeaarchRec(arr,mid+1,end,key);
    }
    static int squareRootUsingBinarySearch(int n){
        int start = 0;
        int end = n;
        int result = 0;

        while(start<=end){
            int mid = (start+end)/2;
            if((long)(mid)*mid <= n){
                result = mid;
                start = mid+1;
            }
            else {
                end = mid -1;
            }
        }
        return result;
    }



    public static void main(String[] args) {
        int arr[] = {10,3,23,56,8,34,3};
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        System.out.println(squareRootUsingBinarySearch(key));

    }
}
