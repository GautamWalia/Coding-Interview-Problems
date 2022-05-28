package com.practice.commonproblems;

public class ReverseOfString {

    public static void main(String[] args) {
        String inputString = "aabaa";
        System.out.println(inputString);
        int len = inputString.length();
        char[] ch = new char[len];
        int i = len - 1;
        while (i >= 0) {
            for (int j = 0; j < inputString.length(); j++) {
                ch[j] = inputString.charAt(i);
                i--;
            }

        }
        String newString = String.valueOf(ch);
        System.out.println(newString);
        if (inputString.equals(newString)) {
            System.out.println(true);
        }
        System.out.println(false);
    }
}