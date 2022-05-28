package com.practice.commonproblems;

import java.util.HashSet;
import java.util.Set;

public class IsogramString
{
    public static void main(String[] args)
    {
        boolean result = IsogramString.isIsogram("pen");
        System.out.println(result);
    }
    public static boolean isIsogram( String s)
    {
        boolean isStingIsogram= true;

        char[] c= s.toLowerCase().trim().toCharArray();

        Set<Character> chSet= new HashSet<>();
        for(Character ch: c)
        {
            if(chSet.contains(ch))
            {
                isStingIsogram = false;
            }
            else
            {
                chSet.add(ch);
            }
        }
        return isStingIsogram;
    }
}
