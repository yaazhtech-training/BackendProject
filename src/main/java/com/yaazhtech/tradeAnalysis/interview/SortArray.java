package com.yaazhtech.tradeAnalysis.interview;

import org.hibernate.sql.ast.tree.expression.Collation;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class SortArray {

    public static void main(String[] args)
    {
        int[] arr={22,6,7,8,23,1};
       // Arrays.sort(arr);

      //  System.out.println(Arrays.toString(arr));

        Arrays.stream(arr).sorted().forEach(System.out::println);

        Arrays.stream(arr).sorted().forEach(System.out::println);
    }
}
