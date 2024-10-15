package com.yaazhtech.tradeAnalysis.pactise;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 3, 5}; // Input array with duplicates
        int[] uniqueArray = removeDuplicates(array);
        System.out.println("Array with duplicates: " + Arrays.toString(array));
        System.out.println("Array without duplicates: " + Arrays.toString(uniqueArray));
    }

    public static int[] removeDuplicates(int[] array) {
        return Arrays.stream(array)
                .distinct()
                .toArray();
    }
}
