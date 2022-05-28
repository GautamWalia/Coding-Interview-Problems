package com.practice.commonproblems;

import java.util.StringTokenizer;

public class MaxWordsInString
{
    public static void main(String[] args)
    {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int countSoFar= 0;
       /* for(int i=0; i< sentences.length; i++)
        {
           String words= sentences[i];
           int count= 1;
            for(int j=0; j< words.length(); j++)
           {
               char[] c= words.toCharArray();
               if(c[j] == ' ')
               {
                   count++;
               }

           }
            countSoFar = Math.max(countSoFar, count);
        }*/
        for(String s: sentences)
        {
            StringTokenizer words = new StringTokenizer(s, " ");
            int count= words.countTokens();
            countSoFar = Math.max(countSoFar, count);
        }

        System.out.println(countSoFar);
    }
}
