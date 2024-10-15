package com.yaazhtech.tradeAnalysis.practise2;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;


public class Sureshs {

    public static void main(String[] args){

        String a="Suresh";
        String b="Saranya";

   a.chars().mapToObj(i -> (char) i)
                .filter(i -> b.contains(String.valueOf(i))).forEach(System.out::println);



        List<Integer> li= Arrays.asList(4,5,6,7);

        Set<Integer> set=new HashSet<>();

        //li.stream().filter(i->!set.add(i)).forEach(System.out::println);
        //li.stream().max(Comparator.comparing(Integer::intValue)) .ifPresent(System.out::println);
        //li.stream().filter(i->i%2==0).forEach(System.out::println);


        List<Integer> lii= Arrays.asList(3,4,5,6,7);

       lii.stream().map(j->j*j*j).filter(j->j<50).forEach(System.out::println);


        int[] arr={4,5,1,0};
        Arrays.parallelSort(arr);
      stream(arr).forEach(System.out::println);

        List<String> ls=Arrays.asList("suresh","jj");

        List<String> ls1=   ls.stream().map(String::toUpperCase).collect(Collectors.toList());

        System.out.println(ls1);



    }
}
