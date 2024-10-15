package com.yaazhtech.tradeAnalysis.pactise;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class Streamex2 {

    public static void main(String[] args)
    {
        int[] a={9,7,6,5,9,12,16,9,9};
       // Arrays.stream(a)
        //        .filter(no -> no%4==0)
         //       .forEach(System.out::println);

       // Arrays.stream(a)
        //        .distinct()
         //       .forEach(System.out::println);


        //OptionalInt -check true or false then if true get the value.
        //avoid null pointer exception

       //OptionalInt od= Arrays.stream(a)
       //         .distinct()
       //        .max();

      // System.out.println(od.getAsInt());

       List<String> la=new ArrayList<String>();

       la.add("xx");
       la.add("vv");
       la.add("xx");

      la.stream() //stream
              .distinct()
              .map(word->word.toUpperCase())  // map stream
        .sorted((ele1,ele2)->ele2.compareTo(ele1)).forEach(System.out::println);

la.stream().distinct().map(w->w.toUpperCase()).sorted().forEach(System.out::println);

Map<String,Integer> lt=new HashMap<>();

lt.put("suresh",990);
lt.put("sara",100);



        Map.Entry<String, Integer> v = lt.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue)).max(Comparator.comparing(Map.Entry::getValue)).get();

         lt.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue)).forEach(System.out::println);


        System.out.println(v);
    }
}
