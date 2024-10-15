package com.yaazhtech.tradeAnalysis.interview;



public class MissinNo {



    public static void main(String[] args)
    {
       int [] arr={1,2,3,4,6};

       int N=arr.length+1;

       int totelsum=N * (N+1)/2;

       int sum=0;

       for(int a:arr)
       {
           sum +=a;
       }

        System.out.println("missing" + (totelsum-sum));




    }
}
