package com.yaazhtech.tradeAnalysis.yaazh;

public class NearEle {
    public static void main(String[] args)
    {
        String str="welcome to yaazhtech";
        // split
        String output[]=str.split("/n");

        for(int i=0;i<output.length;i++){
            System.out.println("output"+output[i].charAt(0));
        }

        char[] inputChar=str.toCharArray();

        int count[]=new int[256];

        for (int i = 0; i < str.length(); i++) { //
            count[str.charAt(i)]++;

        }



        for(int i=0;i<inputChar.length;i++)
        {
            System.out.println(inputChar[i]);
            System.out.println(count[inputChar[i]]);
        }


        for(int i=0;i<inputChar.length;i++)
        {
            System.out.print(inputChar[i]);
            System.out.print(count[inputChar[i]]);
        }
    }
}




