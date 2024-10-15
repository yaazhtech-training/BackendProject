package com.yaazhtech.tradeAnalysis.yaazh;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringOccurance {
    public static void main(String[] args)
    {
        String [] arr={"ee","aa","aa"};
        Map<String,Integer> resultMap=new LinkedHashMap<>();

        for(String s:arr)
        {
            if(resultMap.containsKey(s))
            {
                int count=resultMap.get(s);
                resultMap.put(s,count+1);

            }
            else {
                resultMap.put(s,1);
            }


        }

        resultMap.forEach((k,v)->{System.out.println(k+" " +v);});


    }
}
