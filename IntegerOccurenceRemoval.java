package com.practice.commonproblems;

import java.util.ArrayList;
import java.util.List;

public class IntegerOccurenceRemoval
{
    public static void main(String[] args)
    {
        int[] nums = {3,2,2,3};
        int val= 3, count= 0; //needs to remove 3 & return its occurrence
        List<Integer> list= new ArrayList<>();
        int j=0;
        for(int i=0; i< nums.length; i++)
        {
            if(val == (nums[i]))
            {
                j++;
            }
            else
            {
                list.add(nums[i]);
                count++;
            }
        }
        System.out.println(count);
        System.out.println(list);

    }
}
