package com.yaazhtech.tradeAnalysis.interview;

public class WhiteSpace {

    public static void main(String[] args)
    {
        String s="Suresh M";

       char[] ch=s.toCharArray();

       StringBuilder sb=new StringBuilder();

       for(Character c:ch)
       {
           if(!Character.isWhitespace(c))
           {
               sb.append(c);
           }
       }

        System.out.println(sb.toString());

       String b="  suresh mkl op";

       b=b.strip();

        System.out.println(b);

    }
}
