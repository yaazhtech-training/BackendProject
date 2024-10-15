package com.yaazhtech.tradeAnalysis.practise2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Twise {

    public static void main(String[] args)
    {
        List<Integer> li = Arrays.asList(5,6,7,6);
        li.stream().distinct().forEach(System.out::println);
        Set <Integer> set=new HashSet<>(li);

        if(set.size()==li.size())
        {
           // System.out.println("true");
        }
      //  System.out.println("currenttime" + java.time.LocalDateTime.now() + java.time.LocalDate.now());

        List<String> ls1=Arrays.asList("Suresh");
        List<String> ls2=Arrays.asList("saran");
        Stream<String> ss=Stream.concat(ls1.stream(),ls2.stream());

        ss.forEach(System.out::println);
    }
}
