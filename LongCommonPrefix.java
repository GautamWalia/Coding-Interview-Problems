package com.practice.commonproblems;

public class LongCommonPrefix
{
    public static void main(String[] args)
    {
        String[] strs = {"flower","flow","flight"};
        String result ="";

        if(strs.length ==0)
            System.out.println(result);
        if(strs.length == 1)
            System.out.println(strs[0]);

        String prefix = strs[0];
        for (int i=1; i< strs.length; i++)
        {
            while(strs[i].indexOf(prefix) !=0)
            {
                prefix = prefix.substring(0, prefix.length()-1);
            }
            if(prefix.isEmpty())
            {
                System.out.println(result);
            }
            result= prefix;
        }
        System.out.println(result);
    }
}
