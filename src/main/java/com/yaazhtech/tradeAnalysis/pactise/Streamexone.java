package com.yaazhtech.tradeAnalysis.pactise;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Streamexone {

    public static void main(String[] args)
    {
        int[] abc ={5,6,3,2,1};
        IntStream sb=Arrays.stream(abc); //intermediate operation
       sb=sb.sorted(); //intermediate operation
       sb.forEach(System.out::println); //terminal operation

       //stream data // one time consume
        //sb.forEach(System.out::println);

       //follow real project-pipeline

        Arrays.stream(abc).sorted().forEach(System.out::println);


    }
}
