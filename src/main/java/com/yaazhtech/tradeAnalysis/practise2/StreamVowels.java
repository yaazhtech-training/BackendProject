package com.yaazhtech.tradeAnalysis.practise2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamVowels {
    public static void main(String[] args) {

        String input="Suresh";
        List <Character> vow=Arrays.asList('a','e','i','o','u');

        List<Character> inputChar =input.chars().mapToObj(c->(char)c).collect(Collectors.toList());


        List<Character> vowlist=inputChar.stream().filter(c->vow.contains(c)).collect(Collectors.toList());

        List<Character> consonantlist= inputChar.stream().filter(c->!vow.contains(c)).collect(Collectors.toList());

        System.out.println("Vowels: " + vowlist);
        System.out.println("Consonants: " + consonantlist);


        String a="abcdgh";
        List<Character> lc=a.chars().mapToObj(c->(char)c).collect(Collectors.toList());

        lc.stream().filter(c->vow.contains(c)).map(x->x).forEach(System.out::println);


    }
}
