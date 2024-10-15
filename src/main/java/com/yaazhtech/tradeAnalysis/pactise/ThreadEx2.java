package com.yaazhtech.tradeAnalysis.pactise;

public class ThreadEx2 {

    public static void main(String[] args)  throws InterruptedException{

        Sum sm = new Sum();
        Thread tr1 = new Thread(sm, "first");
        Thread tr2 = new Thread(sm, "second");
        tr1.start();
        tr1.join();
tr2.start();
tr2.join();

        System.out.println(sm.count1);
    }
}
