package com.yaazhtech.tradeAnalysis.pactise;

public class StudentGetIns {

    static StudentGetIns stu=new StudentGetIns();



    StudentGetIns()
    { //private cons

    }

    public static StudentGetIns getinstance()
    {

        if(stu==null)
        {
            StudentGetIns stu1=new StudentGetIns();
        }
        return stu;
    }
}
