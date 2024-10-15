package com.yaazhtech.tradeAnalysis.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOdd {

    public static void main(String[] args)
    {
        List<Integer>  li= Arrays.asList(7,5,9,3,4);

        boolean state=false;

        for(int i:li)
        {
            if(i%2==0)

                state=false;


        }

        System.out.println(state=true);


  boolean out=    li.parallelStream().anyMatch(x->x%2==0);



        System.out.println(out);

    }
}
