package com.yaazhtech.tradeAnalysis.pactise;

public class BankBranch {

    public static void main(String[] args)
    {
        Branch bs=new Branch();
        bs.name="SBI";
        bs.branchcode="IFSCSALEM";

        System.out.println(bs);

        Branch bs2=new Branch();
        bs2.name="SBI";
        bs2.branchcode="IFSCSALEM";

       Boolean result= bs.equals(bs2);

        System.out.println(result);
    }


}
