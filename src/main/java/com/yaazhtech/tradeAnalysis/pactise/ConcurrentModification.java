package com.yaazhtech.tradeAnalysis.pactise;

import java.util.HashMap;
import java.util.Iterator;

public class ConcurrentModification {

    public static void main(String[] args)
    {
        HashMap <Integer,Integer> map=new HashMap<>();

        map.put(1,4);
        map.put(2,6);
        //map.put(1,3);

        System.out.println(map);

        Iterator <Integer> its=map.keySet().iterator();
        while(its.hasNext())
        {
            Integer keys = its.next();

            System.out.println(keys);

            if(keys.equals(2))
            {
                System.out.println(map.put(1,3));
                System.out.println(map);
            }
        }


    }
}
