package com.practice.commonproblems;

public class IpAddress
{
    public static void main(String[] args)
    {
        String address = "1.1.1.1";
        char[] c= address.toCharArray();
        String ans= "";

        String add = "[.]";

        for(int  i=0; i< address.length(); i++)
        {
            if(c[i] != '.')
            {
                ans = ans + c[i];
            }
            else
            {
                ans= ans + add;
            }
        }
        //another way
        //String ans= address.replaceAll("\\.", "[.]");
        System.out.println(ans);

    }
}
