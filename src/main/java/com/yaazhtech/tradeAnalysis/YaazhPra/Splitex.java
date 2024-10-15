package com.yaazhtech.tradeAnalysis.YaazhPra;

public class Splitex {

    public static void main(String[] args)
    {
        String  str="SURESH3ENGI5}CSE";

        String str1[]=str.split("\\d+");

        System.out.println(str1[1]);
    }
}
