package com.company;

public class littlePonyMobiles {
    public int[] solve(int[] A, int[] B) {
        int[] finalArray = new int[B.length];

        int[] nThMobilePhoneCost = new int[A.length];
        nThMobilePhoneCost[0] =A[0];
        for(int i=1;i<A.length;i++)
        {
            nThMobilePhoneCost[i] = A[i] + nThMobilePhoneCost[i-1];
        }

        for(int i=0;i<B.length;i++)
        {
            finalArray[i]=findNumberOfMobiles( B[i], nThMobilePhoneCost);
        }
        return finalArray;
    }
    static int findNumberOfMobiles(int totalAmount, int[] nThMobilePhoneCostArray){
        int start = 0;
        int end = nThMobilePhoneCostArray.length-1;
        int result = 0;
        while(start <= end){
            int mid = (start+end)/2;
            if(nThMobilePhoneCostArray[mid] <= totalAmount){
                result = mid+1;
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return result;
    }
}
