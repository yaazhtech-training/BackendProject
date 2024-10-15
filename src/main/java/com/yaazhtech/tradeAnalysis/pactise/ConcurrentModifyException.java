package com.yaazhtech.tradeAnalysis.pactise;

import java.util.HashMap;
import java.util.Iterator;

public class ConcurrentModifyException {

    public static void  main(String[] args)
    {
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("Suresh",1);
        hm.put("Jaghad",2);

        Iterator<String> it= hm.keySet().iterator();

        while(it.hasNext())
        {
String s= it.next();
            System.out.println(s);
            //hm.remove("Suresh");
        }

    }
}
