package com.yaazhtech.tradeAnalysis.pactise;

import java.util.ArrayList;
import java.util.Iterator;

public class Concurrent {
    public static void main(String[] args)
    {
        ArrayList<String> name=new ArrayList<>();

        name.add("Suresh");
        name.add("jaghad");

        System.out.println(name);

        Iterator <String> na=name.iterator();

        while(na.hasNext())
        {
           String value = na.next();

            System.out.println(value);
        }

    }
}





