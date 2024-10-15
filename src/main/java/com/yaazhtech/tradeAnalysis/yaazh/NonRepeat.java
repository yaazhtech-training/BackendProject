package com.yaazhtech.tradeAnalysis.yaazh;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeat {
    public static void main(String[] args)
    {
        String str="ssuresh";

        char ch[]=str.toCharArray();

        Map<Character,Integer> map=new LinkedHashMap<>();



        for(Character c:ch)
        {
            int count=0;
            if(map.containsKey(c))
            {
                 count=map.get(c);

                map.put(c,count+1);
            }

            else {
                map.put(c,1);
            }
        }
        map.forEach((key,value)->{if(value>1){System.out.println(key +" " +value);}});


        int np=0;

        for(Map.Entry<Character,Integer> mp:map.entrySet())
        {
 if(mp.getValue()==1)
 {
     np++;
 }
 if(np==2)
 {
     System.out.println(mp.getKey());
 }

        }

    }
}
