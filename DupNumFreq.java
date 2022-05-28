package com.practice.commonproblems;

import java.util.ArrayList;
import java.util.List;

public class DupNumFreq {
    public static void main(String[] args) {
        //List<List<Integer>> arr= new ArrayList<>();
        List<Integer> arr = new ArrayList<>();

        List<Integer> arrNew = new ArrayList<>();

        //List<Integer> a1= new ArrayList<>();
        arr.add(10);
        arr.add(20);

        // List<Integer> a2= new ArrayList<>();
        arr.add(30);
        arr.add(40);

//        arr.add(a1);
//        arr.add(a2);
        System.out.println(arr);


        for (int i = 0; i < 100; i++) {
            int count = 0;
            for (int j = 0; j < arr.size(); j++) {

                if (arr.get(j).equals(i)) {
                    count++;
                    arrNew.add(i, count);
                } else {
                    arrNew.add(i, count);
                }


            }
        }
        System.out.println(arrNew);
    }
}