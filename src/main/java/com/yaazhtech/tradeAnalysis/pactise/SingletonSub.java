package com.yaazhtech.tradeAnalysis.pactise;

public class SingletonSub {

    static SingletonSub sb=new SingletonSub();

    private SingletonSub()
    {

    }

     public static SingletonSub getInstance()
    {
        return sb;


    }


}
