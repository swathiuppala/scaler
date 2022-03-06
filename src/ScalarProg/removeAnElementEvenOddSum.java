package ScalarProg;

import java.util.Scanner;

public class removeAnElementEvenOddSum {
    static int countOfRemovedElements(int[] arr){
        int[] psEvenIndexedArr = new int[arr.length];
        int[] psOddIndexedArr = new int[arr.length];
        int count = 0;
        //Creating prefix even indexed array & prefix odd indexed array
        psEvenIndexedArr[0] = arr[0];
        psOddIndexedArr[0] = 0;
        for(int i=1; i<arr.length; i++){
            if(i%2 == 0){
                psEvenIndexedArr[i] = psEvenIndexedArr[i-1] + arr[i];
                psOddIndexedArr[i] = psOddIndexedArr[i-1];
            }
            else{
                psEvenIndexedArr[i] = psEvenIndexedArr[i-1];
                psOddIndexedArr[i] = psOddIndexedArr[i-1] + arr[i];
            }
        }
        //Checking evensum == oddsum
        for(int i=0;i<arr.length;i++){
            //Giving a base condition by removing "0" indexed element
            if(i==0) {
                if (psEvenIndexedArr[arr.length - 1] - psEvenIndexedArr[i] ==
                        psOddIndexedArr[arr.length - 1] - psOddIndexedArr[i]) {
                    count++;
                }
            }
            //Giving a base condition by removing last element
            else if(i == arr.length-1){
                if(psEvenIndexedArr[arr.length - 2] == psOddIndexedArr[arr.length - 2]){
                    count++;
                }
            }
            else {
                int oddSum = psEvenIndexedArr[arr.length-1]+psOddIndexedArr[i-1]-psEvenIndexedArr[i];
                int evenSum = psOddIndexedArr[arr.length-1]+psEvenIndexedArr[i-1]-psOddIndexedArr[i];
                if(oddSum == evenSum){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int result = countOfRemovedElements(arr);
        System.out.println(result);
    }
}
