package com.yaazhtech.tradeAnalysis.practise2;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Group {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("AA", "BB", "AA");



        Map<String, Long> namecount = names.stream().filter(x -> Collections.frequency(names, x) > 1).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<String, Long> namecount1 = names.stream().filter(x->Collections.frequency(names,x)>1).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
       // System.out.println(namecount1);

        List<Integer> li = Arrays.asList(66);

     //   li.stream().max(Integer::compareTo).ifPresent(System.out::println);

        li.stream().max(Integer::compare).ifPresent(System.out::println);

        String s = "Java Programming";

        Map<String, Long> map = Arrays.stream(s.split("")).map(String::toLowerCase).collect(Collectors.groupingBy(str -> str, LinkedHashMap::new, Collectors.counting()));

 Map<String,Long>  MP=  Arrays.stream(s.split("")).map(String::toLowerCase).collect(Collectors.groupingBy(str->str,LinkedHashMap::new,Collectors.counting()));
        System.out.println(MP);

//        Optional.ofNullable(li)
//                .orElseGet(Collections::emptyList)
//                .stream().forEach(System.out::println);

    }}