package com.practice.commonproblems;

public class LengthLastWord
{
    public static void main(String[] args)
    {
       String s=  "   fly me   to   the moon  ";
        //String s= "Hello World";
       /* s = s.trim().replaceAll("\\s+", " ");
        System.out.println(s);

        StringTokenizer st= new StringTokenizer(s);
        int words = st.countTokens();
        System.out.println(words);

        String[] str= s.split(" ");
        int last= str[words-1].length();
        System.out.println(last);*/

        s = s.trim();
        int len= 0;

        for(int i= 0; i< s.length(); i++)
        {
            if(s.charAt(i) == ' ')
            {
                len = 0;
            }
            else
            {
                len++;
            }
        }
        System.out.println(len);
    }
}
