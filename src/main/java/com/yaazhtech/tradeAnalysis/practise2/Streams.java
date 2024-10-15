package com.yaazhtech.tradeAnalysis.practise2;

import com.yaazhtech.tradeAnalysis.pactise.StringReverse;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Streams {

    public static void main(String args[])
    {
       List<Integer> ll= Arrays.asList(899,6,7,8,9);
    //   ll.stream().filter(i->!(i%2==0)).forEach(System.out::println); // odd even

        ll.stream().filter(i->i%2==0).forEach(System.out::println);

        String abc="suresh";


        Map<Character, Long> count = abc.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(count);







    }
}
