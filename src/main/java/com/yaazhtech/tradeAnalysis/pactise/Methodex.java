package com.yaazhtech.tradeAnalysis.pactise;

public class Methodex {
    public static void main(String[] args)

    {
        sum(); //method call
        System.out.println("sum of values");

        sum2(56,50); // paramerized method

        int res= sum3(7,7);

        res=res+10;

        System.out.println(res);
    }

    // method or function define
    public static void sum()
    {
        int a=3;
        int b=5;
        int c=a+b;

        System.out.println(c);
    }

    public static void sum2(int a,int b)
    {
        int c=a+b;
        System.out.println(c);
    }

    //non void function/method
    public static int sum3(int a,int b)
    {
        int c=a*b;
        return c;
    }
}

