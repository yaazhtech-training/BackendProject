package com.yaazhtech.tradeAnalysis.practise2;

public class Sample2 {
    int id;
    String name;

    public Sample2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sample2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    Sample3 s3=new Sample3("cse");
}
