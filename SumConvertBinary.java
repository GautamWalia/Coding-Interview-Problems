package com.practice.commonproblems;



public class SumConvertBinary
{
    public static void main(String[] args)
    {
        String a = "1010", b = "1011";
        //it's gonna work for only small binary strings

       /* int a1 = Integer.parseInt(a, 2);
        System.out.println(a1);
        int a2 = Integer.parseInt(b, 2);
        System.out.println(a2);
        int sum = a1 + a2;
        System.out.println(sum);
        String result= Integer.toBinaryString(sum);
        System.out.println(result);*/

        //it's gonna work for both small & large binary strings
        StringBuilder s = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        while(i>=0 || j>=0){
            int sum = carry;
            if(i>=0)sum += a.charAt(i)-'0'; // we're doing -'0' as directly adding the character with integer, it will return the ascii value of that number, but with "-'0'" we're subtracting the number and making it an actual integer
            if(j>=0) sum += b.charAt(j)-'0';
            s.append(sum%2);
            carry = sum/2;
            i--;
            j--;
        }
        if(carry!=0) s.append(carry);
        System.out.println((s.reverse()).toString());

    }
}
