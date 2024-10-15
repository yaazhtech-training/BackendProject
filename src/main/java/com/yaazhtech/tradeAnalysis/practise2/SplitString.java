package com.yaazhtech.tradeAnalysis.practise2;

public class SplitString {

    public static void main(String[] args)
    {
        String str = "sureshcse123AML";

        int upper=0;

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);

            if(ch>='A' && ch<='Z')
                upper++;


        }

        System.out.println(upper);

       // System.exit(0);

}}
