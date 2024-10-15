package com.yaazhtech.tradeAnalysis.pactise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayTopStudent {

    public static void main(String[] args) {
        List<Students> students = new ArrayList<>();
        students.add(new Students("John", 101, "Computer Science", 20));
        students.add(new Students("Alice", 102, "Electrical Engineering", 22));
        students.add(new Students("Bob", 103, "Mechanical Engineering", 21));

        // Add a new student
        //Students newStudents = new Students("Emma", 104, "Chemical Engineering", 23);
       // students.add(newStudents);

        students.add(new Students("suresh",12,"cse",27));

        // Sort the list by student name (alphabetical order)
        Collections.sort(students, Comparator.comparing(Students::getName));

       // Collections.sort(students,Comparator.comparing(Students::getRollNo));
        // Display the sorted list
        System.out.println("Sorted List of Students by Name:");
        for (Students student : students) {
            System.out.println(student);
        }
    }
}

