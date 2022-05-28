package com.practice.commonproblems;

public class PangramStr9g
{
    public static void main(String[] args) {
        String s = "We promptly judged antique ivory buckles for the next prize";

//        String check= "abcdefghijklmnopqrstuvwxyz";
//
//        char[] chars = new char[0];
        String result = "";

        String str = s.toLowerCase().trim().replaceAll("\\s", "");
        String str1 = str;
        //System.out.println(str);

        if (str.length() < 26) {
            result = "not pangram";
            //return result;

        }
        else
        {
            for (char ch = 'a'; ch <= 'z'; ch++) {
                if (str.indexOf(ch) < 0) {
                    result = "not pangram";
                    break;
                } else {
                    result = "pangram";
                }
            }

        }
        System.out.println(result);

    }

}
