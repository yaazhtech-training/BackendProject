package com.yaazhtech.tradeAnalysis.practise2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CommonCh {

    public static void main(String[] args)
    {

    String a = "carejkl";
    String b = "raceqwe";

//   String common=a.chars()
//                   .mapToObj(c->(char)c)
//                           .filter(c->b.contains(String.valueOf(c))).distinct()
//           .map(Objects::toString).collect(Collectors.joining());

String common=a.chars().mapToObj(c->(char)c).filter(c->b.contains(String.valueOf(c)))
        .map(Objects::toString).collect(Collectors.joining());



        System.out.println("Common characters: " + common);

        String s = "abc-de3-2fg";

        Set<Character> set = s.chars()
                        .filter(Character::isAlphabetic)
                                .mapToObj(ch->(char) ch)
                                        .collect(Collectors.toSet());


        System.out.println(set);

                List<Integer> la= Arrays.asList(5,6,7,8,8);

              Set <Integer> set2=new HashSet<>();

              la.stream().filter(i->set2.add(i)).forEach(System.out::println);




}}
