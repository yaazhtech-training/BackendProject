package com.yaazhtech.tradeAnalysis.practise2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparingString {

    public static void main(String[] args)
    {
        List<String> ls= Arrays.asList("Suresh","SARAN","JAGAD");

        List<String> ls1=Arrays.asList("ss","b");

        ls1.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);

        ls.stream().max(Comparator.comparing(String::length)).ifPresent(System.out::println);

        List<Integer> personage=Arrays.asList(44,55,66);


        double averageAge = personage.stream().mapToInt(Integer::intValue).average().orElse(0);


         System.out.println(averageAge);

    }
}
