package com.yaazhtech.tradeAnalysis.pactise;

public class Sum extends Thread {

    int count1 = 0;


    public void run() {
        int sum = 10;
        for (int i = 0; i < sum; i++) {
            count1++;
         //   System.out.println(count1);
        }
    }
}
