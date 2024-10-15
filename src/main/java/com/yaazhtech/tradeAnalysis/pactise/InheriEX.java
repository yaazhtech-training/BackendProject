package com.yaazhtech.tradeAnalysis.pactise;

class Engineer
{
    String interview="round one";
}

class ExamResult extends Engineer
{
    String results="pass";
}

public class InheriEX {

    public static void main(String[] args)
    {
        ExamResult eng=new ExamResult();
        System.out.println("engineer:" +eng.interview
        + "\nresult:" +eng.results);
    }
}
