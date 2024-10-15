package com.yaazhtech.tradeAnalysis.yaazh;

import java.util.LinkedHashMap;
import java.util.Map;

public class MultithreaEx extends Thread{

    @Override
    public void run() {
        try{
            int ele[]={3,3,4,5};

            Map<Integer,Integer> map=new LinkedHashMap<>();

            for(int a:ele)
            {
                if(map.containsKey(a))
                {
                    int count=map.get(a);
                    map.put(a,count+1);

                }

                else {
                    map.put(a,1);
                }

            }

            map.forEach((k,v)->{if(v==1) {System.out.println(k +" " + v);}});


        }

        catch (Exception e )
        {
            System.out.println("exception");
        }
    }
}
