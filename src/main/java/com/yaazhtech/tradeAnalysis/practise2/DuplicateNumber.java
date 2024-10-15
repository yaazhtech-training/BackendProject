package com.yaazhtech.tradeAnalysis.practise2;

import com.fasterxml.jackson.databind.node.IntNode;

import java.util.*;

public class DuplicateNumber {

    public static void main(String[] args)
    {
        List<Integer> li= Arrays.asList(2,3,4,4,5);

        Set <Integer> set=new HashSet<>();

        li.stream().filter(n->!set.add(n)).forEach(System.out::println); //duplicate print

        li.stream().findFirst().ifPresent(System.out::println); // find first



       Long count= li.stream().count(); //number of elements count
        System.out.println(count);

        int max =li.stream().max(Integer::compare).get();


        System.out.println(max);





    }
}
