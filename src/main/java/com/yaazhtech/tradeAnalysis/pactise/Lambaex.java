package com.yaazhtech.tradeAnalysis.pactise;

@FunctionalInterface
 interface Contract {
    //public void run();

    void add(int a, int b);
    static void run1()
    {
    }

    default void run2(){

    }
        }

public class Lambaex {

    public static void main(String[] args)
    {
       // Contract cc = () -> {
          //  System.out.println("running");};
//cc.run();

        Contract c1=(a,b)->{
            System.out.println(a+b);
        };
        c1.add(4,5);
    }
}
