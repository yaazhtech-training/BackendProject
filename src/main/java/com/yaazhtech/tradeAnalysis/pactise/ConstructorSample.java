package com.yaazhtech.tradeAnalysis.pactise;

class Sample{

int amt;

//default constructor
    Sample()
    {

        System.out.println("amt is");

    //  amt=55;
    }

    //permerized constructor
    Sample(int num)
    {
       amt=num;
    }
}

public class ConstructorSample {

    public static void main(String[] args)
    {
        Sample objc=new Sample();
        Sample objc2=new Sample(60);
System.out.println(objc.amt);
        System.out.println(objc2.amt);
    }


}
