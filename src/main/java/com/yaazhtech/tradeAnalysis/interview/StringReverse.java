package com.yaazhtech.tradeAnalysis.interview;

public class StringReverse {

    public static void main(String[] args)
    {
       String name="Suresh";

        String name2="Sureshsara";

      char [] ch= name.toCharArray();

       StringBuilder sb=new StringBuilder();

       for(int i=ch.length-1;i>=0;i--)
       {
sb.append(ch[i]);
       }
        System.out.println(sb.toString());

       StringBuilder sb1=new StringBuilder(name2);

        System.out.println(sb1.reverse());

    }


}
