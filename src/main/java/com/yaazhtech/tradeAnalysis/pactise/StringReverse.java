package com.yaazhtech.tradeAnalysis.pactise;

public class StringReverse {

    public static   void    main(String[] args)
    {
        String s="abba";
        String b="";

        //System.out.println(s.length());

        for(int i=s.length()-1;i>=0;i--)
        {
            b=b+s.charAt(i);

        }
        System.out.println(b);
        boolean bs=s.equals(b);//palindrem
        System.out.println("Palindrem is " +" " + bs);

    }
}
