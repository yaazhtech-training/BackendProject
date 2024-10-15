package com.yaazhtech.tradeAnalysis.pactise;

//class inside of another class
public class NestedSample {
    public static void main(String[] args)
    {
        Family familyobj=new Family();

        Family.Father fatherobj=familyobj.new Father();

        //class name.nested class name = class obj name .new nested class name

        System.out.println(fatherobj.name);
        fatherobj.job();

    }
}

class Family{

    //inner or nested class
    class Father{

       String name="murugan";
        void job()
        {
            System.out.println("build the building");
        }

    }
}
