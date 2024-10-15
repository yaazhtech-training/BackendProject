package com.yaazhtech.tradeAnalysis.interview;

public class Fibonacci {

    public static void main(String[] args)
    {
        int a=0,b=1,c=1,n=10;

        System.out.println(a+" "+b);

        for(int i=2;i<=n;i++)
        {
         a=b;
         b=c;
         c=a+b;

            System.out.println(a+" ");
        }
    }
}
