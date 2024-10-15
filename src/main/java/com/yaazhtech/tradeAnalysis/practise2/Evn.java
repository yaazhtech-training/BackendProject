package com.yaazhtech.tradeAnalysis.practise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.IntStream;

public class Evn {
    public static void main(String[] args){

        List<Integer> li= Arrays.asList(6,7,9);
        System.out.println("odd number:");
         li.stream().filter(i->!(i%2==0)).forEach(System.out::println);


    }
}
