package com.practice.commonproblems;

public class StrictIncrSeqByRemov1
{
    public static void main(String[] args) {
       int[] seq= {3, 5, 67, 98, 3};
        int removed = 0;

        for (int i = 0; i < seq.length - 2 && removed <= 2; i ++) {
            int a = seq[i];
            int b = seq[i+1];
            int c = seq[i+2];

            if (a >= b) {
                removed++;
                seq[i] = b -1;
            }

            if (b >= c){
                removed++;

                if (a == c)
                {
                    seq[i+2] = b +1;
                } else
                {
                    seq[i+1] = a;
                }
            }
        }

       if( removed <= 1)
       {
           System.out.println(true);
       }else {
        System.out.println(false);
       }
    }
}
