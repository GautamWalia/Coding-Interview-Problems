package com.practice.commonproblems;

public class CodeBots
{
    // need to calculate total price of rooms
    //from 2D array except values underneath zero
    public static void main(String[] args) {
        int addition= 0;
        int matrix[][] = {{0,1,1,2}, {0,5,0,0}, {2,0,3,3} };
        for(int row= 0; row< matrix.length; row++)
        {
            for(int col= 0; col< matrix[row].length; col++)
            {
               if(matrix[row][col] == 0)
               {
                   for(int i = row+ 1; i< matrix.length; i++)
                   {
                       matrix[i][col] = 0;
                   }
               }
            }
        }
        for(int row= 0; row< matrix.length; row++)
        {
            for(int col= 0; col< matrix[row].length; col++)
            {
                if(matrix[row][col] != 0)
                {
                   addition = addition + matrix[row][col];
                }
            }
        }
        System.out.println(addition);
    }
}
