package com.yaazhtech.tradeAnalysis.pactise;

public class AutoBoxing_Autounboxing {

    public  static void main(String[] args)
    {

       double salary=150000.89;

       Double salary1=salary;  //auto boxing
        System.out.println(salary1);

        double salary3=salary1;
        System.out.println(salary1); // unboxing
        //  int num=7;
        //Integer num1= num;//Autoboxing

      //  int num2=num1.intValue();//unboxing


       // System.out.println(num1);

       // int num=7;
      //  Integer num1= num;//Autoboxing


       // int num2=num1;//Auto-unboxing


      //  System.out.println(num1);
    }
}
