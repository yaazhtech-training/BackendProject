package com.yaazhtech.tradeAnalysis.practise2;

import java.util.*;
import java.util.stream.Collectors;

public class StartOne {

    public static void main(String args[])
    {
        List<Integer> li=List.of(1,14,99);

        System.out.println("Startwith one");

          li.stream().map(i->i + "").filter(i->i.startsWith("1")).forEach(System.out::println);

List<Character> ls= List.of('A','E','I','O','U');

String S="SURESH";

        List<Character> lc=S.chars().mapToObj(c->(char)c).collect(Collectors.toList());


        List<Character> lc3= lc.stream().filter(c->ls.contains(c)).collect(Collectors.toList());

        System.out.println("Vowels");

lc3.stream().forEach(System.out::println);
    }
}
