package com.practice.commonproblems;

public class DupRemove
{
    public static void main(String[] args)
    {
        int[] nums = {1,1,2};
        int n= nums.length;
        int i=0, j= i+1;
        while((i < n) && (j < n))
        {

            if(nums[j] == nums[i])
            {
                j++;
            }
            else
            {
                int temp= nums[i+1];
                nums[i+1] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
        }
        System.out.println(i+1);
        /*Set<Integer> set = new LinkedHashSet<>();
        int i= 0;
        for(int n1: nums)
        {
            set.add(n1);
        }
        for(int n2: set)
        {
            i++;
            System.out.print(n2+" ");
        }
        System.out.println("\n"+i);*/
    }
}
