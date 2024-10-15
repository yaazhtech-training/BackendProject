package com.yaazhtech.tradeAnalysis.practise2;


class EmployeeInfo {
    String Name="Suresh";
    int ids=55;

}
//Is relationship employee -manager

public class Manager extends EmployeeInfo {

    double Salary=14.88;

    public static void main(String args[]){

        Manager mm=new Manager();
        System.out.println("id"+mm.ids);
        System.out.println("name"+mm.Name);
        System.out.println("name"+mm.Salary);


    }
}
