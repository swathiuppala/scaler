package com.company;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(7);
        arr.add(8);
        arr.add(4);
        arr.add(2,9);

        for(int i=0; i<arr.size(); i++){
            System.out.println(arr.get(i));
        }


    }
}
