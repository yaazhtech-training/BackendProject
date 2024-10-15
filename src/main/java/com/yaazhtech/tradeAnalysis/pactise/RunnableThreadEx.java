package com.yaazhtech.tradeAnalysis.pactise;

class Hai implements Runnable

{
 void runs()
 {

 }

    @Override
    public void run() {
        for(int i=0;i<10;i++)
        {
            System.out.println("running");
        }
    }
}



public class RunnableThreadEx {

    public static void main(String[] args)
    {
        Hai hi=new Hai();
Thread th1=new Thread(hi);
th1.start();
th1.run();
th1.stop();
    }
}
