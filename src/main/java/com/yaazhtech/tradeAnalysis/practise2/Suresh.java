package com.yaazhtech.tradeAnalysis.practise2;

import java.util.stream.IntStream;

public class Suresh {

    public static void main(String[] args)
    {
        String str = "IAmAJavaProgrammer";

        int j=0;


        StringBuilder expend=new StringBuilder();
        StringBuilder expend2=new StringBuilder();

       for(int i=0;i<str.length();i++)
       {
           if(Character.isUpperCase(str.charAt(i)))
           {
               expend.append(" ");
           }
           expend.append(str.charAt(i));

    }

        System.out.println(expend);

        for(int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                j++;
            }


        }

        System.out.println(j);
}}
