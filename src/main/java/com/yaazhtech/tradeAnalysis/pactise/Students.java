package com.yaazhtech.tradeAnalysis.pactise;

class Students {
    private String name;
    private int rollNo;
    private String department;
    private int age;

    public Students(String name, int rollNo, String department, int age) {
        this.name = name;
        this.rollNo = rollNo;
        this.department = department;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getDepartment() {
        return department;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", department='" + department + '\'' +
                ", age=" + age +
                '}';
    }
}