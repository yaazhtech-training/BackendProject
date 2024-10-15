package com.yaazhtech.tradeAnalysis.pactise;

import java.util.LinkedList;

public class LinkedListEx {

    public static void main(String[] args)
    {

        LinkedList<String> ll=new LinkedList<>();
        ll.add("suresh");
        ll.add(1,"saranya");
        ll.addFirst("Jaghad");
        ll.addLast("rakshita");
        System.out.println(ll);

        ll.remove(1);
        System.out.println(ll);

        ll.removeFirst();
ll.clear();
        System.out.println(ll);


    }


}
