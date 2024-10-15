package com.yaazhtech.tradeAnalysis.pactise;

import java.util.Arrays;

public class SecondLargestNumber {

public static void main(String[] args) {
    int[] array = {5, 10, 2, 8, 15, 7}; // Input array
    int secondLargest = findSecondLargest(array);
    System.out.println("Second largest number in the array: " + secondLargest);
}

public static int findSecondLargest(int[] array) {
    if (array.length < 2) {
        throw new IllegalArgumentException("Array must contain at least two elements.");
    }

    return Arrays.stream(array)
            .boxed()
            .distinct()
            .sorted((a, b) -> Integer.compare(b, a)) // Sort in descending order
            .skip(1) // Skip the largest number
            .findFirst()
            .orElseThrow(() -> new IllegalStateException("Cannot find second largest element."));
}}
