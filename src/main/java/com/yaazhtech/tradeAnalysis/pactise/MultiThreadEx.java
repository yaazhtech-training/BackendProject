package com.yaazhtech.tradeAnalysis.pactise;

public class MultiThreadEx
{

    public static void main(String[] args) {

        AbcMultiThread thread = new AbcMultiThread();

        ThreadGroup th1 = new ThreadGroup("project a");
        ThreadGroup th2 = new ThreadGroup("project b");

        Thread r1 = new Thread(th1, thread, "project aa");

        Thread r2 = new Thread(th2, thread, "project bb");

r1.start();
r2.start();

        System.out.println("first thread" +th1.activeCount());

        System.out.println("2nd" + th2.activeCount());

        System.out.println("2nd" + th2.getName());

        System.out.println("2nd" + th2.getParent().getName());
    }
}
