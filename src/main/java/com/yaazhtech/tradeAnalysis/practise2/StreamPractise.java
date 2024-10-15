package com.yaazhtech.tradeAnalysis.practise2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamPractise {

    public static void main(String[] args)
    {
        List<String> list = Arrays.asList("A", "B", "C", "D", "A", "B", "C");

// Get list without duplicates
        List<String> distinctItems=list.stream().distinct().collect(Collectors.toList());

        Set <String> set =new HashSet<>();

        List<String> dup=list.stream().filter(i->!set.add(i)).collect(Collectors.toList());


// Let's verify distinct elements
        System.out.println(distinctItems);

        System.out.println(dup);

        List<Integer> li=Arrays.asList(55,6,7,8);

        li.stream().skip(1).max(Comparator.comparing(integer -> integer)).ifPresent(System.out::println);

      Integer k= li.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
       // System.out.println(k);
    }
}
