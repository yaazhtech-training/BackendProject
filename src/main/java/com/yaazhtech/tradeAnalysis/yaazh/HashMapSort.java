package com.yaazhtech.tradeAnalysis.yaazh;

import java.util.*;
import java.util.stream.Collectors;

public class HashMapSort {
    public static void main(String[] args)
    {
        HashMap<String,Integer> hm=new HashMap();
        hm.put("Suresh",10);
        hm.put("saran",2);

        Map<String,Integer> map=hm.entrySet()
                .stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                     Map.Entry::getKey  ,
                     Map.Entry::getValue,
        (e1,e2)->e1, LinkedHashMap::new
                ));



        map.forEach((k,v)->{System.out.println(k+" "+v);});



    }
}
