package com.practice.commonproblems;

public class RomanToInt
{
    public static void main(String[] args)
    {
        String s = "MCMXCIV";

//        int L= 50, C= 100, V= 5, X=10, D= 500, M= 1000,
//                I= 1, CM = 900, XC = 90, IV = 4, IX = 9, result= 0;
        char[] ch= s.toCharArray();
        int i, sum=0, current= 0, next=0;
        int leng= s.length();

        for(i= 0; i< leng; i++)
        {
            current = basic(ch[i]);
            if(i == leng-1) //add last element
            {
                sum = sum + current;
                break;
            }
            next = basic(ch[i+1]);
            if(current > next)
            {
                sum = sum + current;
            }
            else if(current < next)
            {

                sum = sum + (next - current);
                i++;
            }
            else if(current == next)
            {
                sum = sum + current;
            }
        }
        System.out.println(sum);
    }
    static int basic(char c)
    {
        switch (c)
        {
            case 'I': return 1;
            case 'V':  return 5;
            case 'X': return 10;
            case 'L': return 50;
            case  'C':return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default : return 0;
        }
    }
}
