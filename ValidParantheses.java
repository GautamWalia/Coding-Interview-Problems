package com.practice.commonproblems;

import java.util.Stack;

public class ValidParantheses
{
    public static void main(String[] args)
    {
        String s = "()[]{}";
        char current= ' ', last= ' ';
        Stack<Character> stack= new Stack<>();

        for(int i=0; i < s.length(); i++)
        {
            current = s.charAt(i);

            if(current == '(' || current == '{' || current == '[')
            {
                stack.push(current);
            }
            else if(stack.isEmpty())
            {
                System.out.println(false);
            }
            else
            {
                last = stack.pop();
                if(last == '(' && current != ')' ||
                last == '{' && current != '}' ||
                last == '[' && current != ']')
                {
                    System.out.println(false);
                }
            }
        }
        System.out.println(stack.isEmpty());
    }

}
