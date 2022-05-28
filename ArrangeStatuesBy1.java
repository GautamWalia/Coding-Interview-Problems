package com.practice.commonproblems;



public class ArrangeStatuesBy1
{
    public static void main(String[] args)
    {
        int[] statues = {8, 1, 0, 4, 7};
        int temp= 0, max=0;

        for(int i=1; i < statues.length; i++)
        {
            if(statues[i-1] > statues[i])
            {
                temp = statues[i-1];
                statues[i-1] = statues[i];
                statues[i] = temp;

            }

        }
        for(int i=1; i < statues.length; i++)
        {
            if(statues[i-1] > statues[i])
            {
                temp = statues[i-1];
                statues[i-1] = statues[i];
                statues[i] = temp;

            }

        }
        for(int i=1; i < statues.length; i++)
        {
            max= max + ((statues[i]-1) - statues[i-1]);
        }
        System.out.println(max);
        for(int i: statues)
        {
            System.out.print(i+ " ");
        }
    }
}
