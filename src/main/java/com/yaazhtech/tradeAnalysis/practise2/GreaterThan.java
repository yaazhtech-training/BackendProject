package com.yaazhtech.tradeAnalysis.practise2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class GreaterThan {

    public static void main(String[] args)
    {
        List<Integer> li= Arrays.asList(3,4,5,6,7);

        li.stream().map(i->i*i*i).filter(i->i>50).forEach(System.out::println);

        int arr[]={7,9,3,4,5,6,7,8};

        Arrays.parallelSort(arr);


       // stream(arr).forEach(System.out::println);

        List<String> ls=Arrays.asList("suresh","jj");

        List<String> ls1=   ls.stream().map(String::toUpperCase).collect(Collectors.toList());



       // System.out.println(ls1);

        List<Character> lc=Arrays.asList('a','i','o','u','e');

        String a="Suresh";

        List<Character> lc1=a.toLowerCase().chars().mapToObj(c->(char) c).collect(Collectors.toList());

        System.out.println(lc1);

        lc1.stream().filter(i->lc.contains(i)).forEach(System.out::println);

    }
}
