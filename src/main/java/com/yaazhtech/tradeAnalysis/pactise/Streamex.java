package com.yaazhtech.tradeAnalysis.pactise;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Streamex {
    public static void main(String[] args)
    {
        int[] a={1,5,3,4,7};
        IntStream stream_s= Arrays.stream(a);
        stream_s=stream_s.sorted();

        //using lambda with stream
        //stream_s.forEach(no-> System.out.println(no));

        // double colon method operator

        stream_s.forEach(System.out::println);
    }
}
