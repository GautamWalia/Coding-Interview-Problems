package com.practice.commonproblems;

public class LongStringsInArray
{
    public static void main(String[] args)
    {
        String[] inputArray = {"aba", "aa", "ad", "vcd", "aba"};
        int count= 0;

        int maSoFar = 0;
        for(int i = 1; i< inputArray.length; i++) {
            if(inputArray[i-1].length() > inputArray[i].length() )
            {
                maSoFar = Math.max(inputArray[i-1].length(), maSoFar);
            }
            else
            {
                maSoFar = Math.max(inputArray[i].length(), maSoFar);
            }
        }
        for(int i = 0; i< inputArray.length; i++) {
            if(inputArray[i].length() == maSoFar)
            {
                count++;
            }
        }
        String[] words = new String[count];
        for(int j = 0; j< words.length; j++)
        {
            for(int i = 0; i< inputArray.length; i++)
            {
                    if(inputArray[i].length() == maSoFar)
                    {
                        words[j] = inputArray[i];
                        j++;
                    }
            }
        }
        for(int i = 0; i< words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
