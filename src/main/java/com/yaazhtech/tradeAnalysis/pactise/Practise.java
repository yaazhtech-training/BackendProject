package com.yaazhtech.tradeAnalysis.pactise;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.stream.IntStream;

import static java.lang.System.*;

public class Practise {

    public static void main(String[] args)
    {

       List<String> ls3=new ArrayList<>();

       ls3.add("suresh");
       ls3.add("khan");

     //  ls3.stream().distinct().map(y->y).forEach(System.out::println);

       List<Integer> nt=new ArrayList<>();

        nt.add(10);
        nt.add(5);

       nt.stream().sorted((x1,x2)->x1.compareTo(x2)).forEach(System.out::println);


}}

