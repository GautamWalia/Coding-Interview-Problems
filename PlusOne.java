package com.practice.commonproblems;

public class PlusOne
{
    public static void main(String[] args)
    {
        int[] digits = {9,9,9};
        int len= digits.length;

        boolean carry = digits[len -1] == 9;

        if(! carry)
        {
            digits[len -1] = digits[len - 1] + 1;
            //return digits;
            for(int num: digits)
            {
                System.out.print(num + " ");
            }
        }

        int idx = len - 1;
        while(carry && idx >0)
        {
            digits[idx] = 0;
            idx--;
            carry = digits[idx] == 9;
        }
        if(carry)
        {
            int[] copy = new int[len + 1];
            copy[0] = 1;
           // return copy;
            for(int num: copy)
            {
                System.out.print(num + " ");
            }
        }
        digits[idx] = digits[idx] + 1;
        //return digits;
        for(int num: digits)
        {
            System.out.print(num + " ");
        }
    }
}
