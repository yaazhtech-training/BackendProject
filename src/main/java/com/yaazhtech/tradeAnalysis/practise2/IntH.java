package com.yaazhtech.tradeAnalysis.practise2;

import java.util.LinkedHashMap;
import java.util.Map;

public class IntH {
    public static void main(String[] args)
    {
        int []arr={1,2,35,9,3,2,2};

        Map<Integer,Integer> result=new LinkedHashMap<>();

        for(Integer s:arr)
        {
            if(result.containsKey(s)) {

                int count = result.get(s);
                result.put(s, count + 1);
            }
             else
        {
            result.put(s,1);
        }

        }

       result.forEach((k,v)->{System.out.println(k+" "+v);});

    }
}
