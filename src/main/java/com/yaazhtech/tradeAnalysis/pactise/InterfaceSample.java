package com.yaazhtech.tradeAnalysis.pactise;

interface Father{
   void call();

}

class InterfaceSample implements Father{
    public void call()
    {
        System.out.println("calling");
    }




    public static void main(String[] args) {
        InterfaceSample interfaceobj = new InterfaceSample();
        interfaceobj.call();


}}
