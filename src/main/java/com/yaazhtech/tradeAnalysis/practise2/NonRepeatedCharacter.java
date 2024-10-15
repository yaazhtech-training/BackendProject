package com.yaazhtech.tradeAnalysis.practise2;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatedCharacter {

    public static void main(String[] args)
    {
        String input="suresh java";

        Character Result = input.chars()
                .mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry->entry.getValue()==1L) // >1L get non repear char
                .map(entry->entry.getKey())
                .findFirst()
                .get();


        Character v = input.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1L)
                .map(entry -> entry.getKey())
                .findFirst().get();



        System.out.println(v);


        List<Integer> li= Arrays.asList(3,2,1,7,0);

        li.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

    }
}
