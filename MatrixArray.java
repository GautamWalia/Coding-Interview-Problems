package com.practice.commonproblems;

public class MatrixArray
{
    public static void main(String[] args)
    {

        int[][] arr= {{1,2,3},{4,5,6},{9,8,9}};

        int tempMajor= 0, tempMinor=0, absDiff= 0;
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                if(i==j)
                {
                    tempMajor = tempMajor + arr[i][j];
                }
                if((i+j)== (3-1))
                {
                    tempMinor = tempMinor + arr[i][j];
                }
            }
        }
        absDiff = Math.abs(tempMajor - tempMinor);
        System.out.print(absDiff + " ");
    }
}
