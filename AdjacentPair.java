package com.practice.commonproblems;

public class AdjacentPair
{
    public static void main(String[] args)
    {
        int[] inputArray = {3, 6, -2, -5, 7, 3};
        int first= inputArray[0];
        int maxSoFar= Integer.MIN_VALUE;
        for(int j= 1; j< inputArray.length; j++)
        {
           int max= inputArray[j] * first;
           first = inputArray[j];
           maxSoFar = Math.max(maxSoFar, max);
        }
        System.out.println(maxSoFar);
    }


}
