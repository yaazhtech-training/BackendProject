package com.yaazhtech.tradeAnalysis.yaazh;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class IntOccurance {

    public static void main(String[] args)
    {
        int [] arr={5,6,7,8,9,6};


        Map<Integer,Integer> ResultMap=new LinkedHashMap<>();

        for(Integer a:arr)
        {
            if(ResultMap.containsKey(a))
            {
                int count=ResultMap.get(a);
                ResultMap.put(a,count+1);
            }
            else {
                ResultMap.put(a,1);
            }
        }

        ResultMap.forEach((k,v)-> {if(v==1) {System.out.println(k+" "+v);}});


    }
}
