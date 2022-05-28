package com.practice.commonproblems;

public class PolygonArea
{
    public static void main(String[] args)
    {
        // let's assume 2 is the size of interesting polygon
        int n= 4;
        int result = 1;
        for(int i= 1; i< n; i++)
        {
            result = result + 4 * i;
        }

        System.out.println(result);
    }
}
