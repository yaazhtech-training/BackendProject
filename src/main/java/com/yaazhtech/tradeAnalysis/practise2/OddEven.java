package com.yaazhtech.tradeAnalysis.practise2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;



    import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

    public class OddEven
    {
        public static void main(String[] args) {

            List<Integer> no=Arrays.asList(3,6,7,9,10);

            Map<Boolean,List<Integer>> odd=no.stream().collect(Collectors.partitioningBy(i->i%2==0));

           Set <Entry<Boolean,List<Integer>>> Entryset=odd.entrySet();
          //  System.out.println(odd);
           // System.out.println(Entryset);

            for(Entry<Boolean,List<Integer> >entry:Entryset) {
              //  System.out.println(entry.getKey());

                if (entry.getKey())
                {
                    System.out.println("Even Numbers");
                }
                else
                {
                    System.out.println("Odd Numbers");
                }


                List<Integer> li = entry.getValue();

for (int k:li)
{
    System.out.println(k);
}
            }
        }

    }



