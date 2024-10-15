package com.yaazhtech.tradeAnalysis.pactise;

public class LargesArray {
    public static void main(String[] args)
    {
        int [] sa={2,33,66,77};

        int max=sa[0];

        for(int i=0;i<sa.length;i++)
        {
            if(sa[i]>max)  //max=33
            {
                max=sa[i];
            }
        }

        System.out.println(max);
    }

}
