package com.yaazhtech.tradeAnalysis.pactise;

import java.util.ArrayList;

public class StreamMap {

    public static void main(String[] args)
    {
        ArrayList <Integer> empreg_no=new ArrayList<Integer>();
        empreg_no.add(55);
        empreg_no.add(66);

        empreg_no.stream().map(no->no+1).forEach(System.out::println);

ArrayList <String> empname=new ArrayList<String>();

empname.add("suresh");
empname.add("Saranya");

        empname.stream().map(name->name + "cse" ).forEach(System.out::println);


    }
}
