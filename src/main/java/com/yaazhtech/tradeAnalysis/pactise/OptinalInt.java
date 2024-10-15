package com.yaazhtech.tradeAnalysis.pactise;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class OptinalInt {
    public static void main(String[] args)
    {
        OptionalInt op=OptionalInt.of(45);

        IntStream out=op.stream();

        out.forEach(System.out::println);

        OptionalInt op1=OptionalInt.empty();

        IntStream out2=op1.stream();

        if (out2.count() == 0)
        {
            System.out.println("opInt is empty");}
    }


}
