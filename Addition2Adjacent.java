package com.practice.commonproblems;

public class Addition2Adjacent
{
    public static void main(String[] args)
    {
        int[] b= new int[5];
        int[] a = {4, 0, 1, -2, 3};
        for(int i=0; i< 5; i++) {

               for(int j= 0; j< 5; j++){
                   if(i== 0)
                   {
                       b[j] =  a[i] + a[i + 1];
                       i++;
                   }
                   else if(i == (5-1))
                   {
                       b[j] = a[i - 1] + a[i];
                   }
                   else {
                       b[j] = a[i - 1] + a[i] + a[i + 1];
                       i++;
                   }
                }
            }
            for (int i : b) {
                System.out.print(i+" ");
            }
        }
}
