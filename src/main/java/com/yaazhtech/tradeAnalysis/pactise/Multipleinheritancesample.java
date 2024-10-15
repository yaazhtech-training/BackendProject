package com.yaazhtech.tradeAnalysis.pactise;

interface Dad{
    void call();
}

interface Mom{
    void call();
}

//interface using multiple inheritance

class Son implements Dad,Mom{
    public void call(){
        System.out.println("calling");
    }
}

public class Multipleinheritancesample {

    public static void main(String[] args) {
        Son son_obj = new Son();
        son_obj.call();
    }

}