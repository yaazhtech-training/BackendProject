package com.yaazhtech.tradeAnalysis.pactise;

class SaranEncap
{
    private String coursename;

    private int fees;

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public int getFees() {
        return fees;
    }
}

public class Encapex2 {

    public static void main(String[] args){

        SaranEncap saranencap=new SaranEncap();

        saranencap.setCoursename("CSE");
        saranencap.setFees(36000);

        System.out.println(saranencap.getCoursename() + " " +saranencap.getFees());

    }
}
