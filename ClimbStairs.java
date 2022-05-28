package com.practice.commonproblems;

//assume staircase has max 45 steps
//we can take either 1 or 2 steps
//need to calculate in how many ways we cn climb till top
public class ClimbStairs
{
    public static void main(String[] args)
    {
        int n =5;
        // one approach
        /*int one= 1, two= 1, temp= 0;
        for(int i=0; i< n-1; i++)
        {
            temp = one;
            one = one + two;
            two= temp;
        }
        System.out.println(one);*/


        ClimbStairs cs= new ClimbStairs();
        int result = cs.climbStr(n);
        System.out.println(result);
    }
    Integer[] dp;
     int climbStr(int n)
    {
        if(dp == null)
        {
            dp = new Integer[n+1];
        }
        if(n <= 1) return 1;
        if(dp[n] != null)
        {
            return dp[n];
        }
        return dp[n]= climbStr(n-1) + climbStr(n-2);
    }
}
