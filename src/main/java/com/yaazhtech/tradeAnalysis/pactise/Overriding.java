package com.yaazhtech.tradeAnalysis.pactise;

class Ja
        {
            void driving()
            {
                System.out.println("chennai to salem ");
            }

                }
  class Jb extends Ja{
    void driving()
    {
        System.out.println("salem to madurai");
    }
  }


public class Overriding {

    public static void main(String[] args)
    {
        Ja objja=new Ja();

        objja.driving();

    }
}
