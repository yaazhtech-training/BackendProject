package com.yaazhtech.tradeAnalysis.practise2;

public class ArraySort {
    public static void main(String[] args)
    {
        int[] arr={8,5,2,1,99};

        for(int i=0;i<arr.length;i++) {

          //  System.out.print(arr[i]);

            int temp = 0;

            for (i= 0; i < arr.length; i++) {

                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[i]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }

            } for ( i = 0; i < arr.length; i++) {

                System.out.print(arr[i] + " ");
            }

        }
    }
}
