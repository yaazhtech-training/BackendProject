package com.yaazhtech.tradeAnalysis.practise2;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashMapOverrde {

    String empname;
    int id;
    public static void main(String args[])
    {

        Employee emp=new Employee("suresh",121);
        Employee emp2=new Employee("sara",121);

        Set employees=new HashSet<>();

        employees.add(emp);
        employees.add(emp2);

        System.out.println(employees);

        System.out.println(employees.getClass());

    }


}
