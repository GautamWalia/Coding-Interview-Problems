package com.practice.commonproblems;

public class BuySellStocks
{
    public static void main(String[] args)
    {
        int[] stockPrice = {7,5,1,3,6,4};
        System.out.println("so far profit is: "+BuySellStocks.buySellStocks(stockPrice));

    }
    public static int buySellStocks(int[] stockPrice)
    {
        if(stockPrice.length<2)
        {
            return 0;
        }
        int minSoFar= stockPrice[0];
        int calculatProfitsofar= 0;
        for(int i= 1; i< stockPrice.length; i++)
        {
            calculatProfitsofar = Math.max(calculatProfitsofar, stockPrice[i]-minSoFar);
            minSoFar = Math.min(minSoFar, stockPrice[i]);
        }
        return calculatProfitsofar;
    }
}
