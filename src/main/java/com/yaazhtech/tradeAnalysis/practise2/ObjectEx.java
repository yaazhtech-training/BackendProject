package com.yaazhtech.tradeAnalysis.practise2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ObjectEx {

    public static void main(String[] args)
    {


        Object obj1=new String("tyui");

        System.out.println(obj1.getClass());


        List<Integer> ls = Arrays.asList(44,55,44,99);

        Set<List<Integer>> set =new HashSet<>();

        Set<Integer> d = ls.stream().filter(i -> set.add(ls)).collect(Collectors.toSet());

        System.out.println(d);




    }

}
