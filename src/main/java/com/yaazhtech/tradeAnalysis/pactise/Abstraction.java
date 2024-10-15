package com.yaazhtech.tradeAnalysis.pactise;

 abstract class Emp {

    private final String empname;
    public Emp(String empname)
    {
        this.empname=empname;
    }
 abstract void work();
 public String getempname()
    {
        return empname;
    }
}

class Sureshemp extends Emp{

    public Sureshemp (String empname)
    {
        super(empname);
    }

    public void work()
    {

        System.out.println( getempname() + "dev");
    }
}

public class Abstraction {

    public static void main(String[] args)
    {
        Emp emp1=new Sureshemp("suresh");
         emp1.work();
    }

}
