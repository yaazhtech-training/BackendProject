package com.yaazhtech.tradeAnalysis.pactise;

import java.util.ArrayList;
import java.util.Optional;
import java.util.OptionalInt;

class Employees{
   String name;
   int reg;
  int salary;

  public Employees(String name,int reg,int salary)
  {

      this.name=name;
      this.reg=reg;
      this.salary=salary;
  }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getReg() {
        return reg;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setReg(int reg) {
        this.reg = reg;
    }

     public void setSalary(int salary) {
         this.salary = salary;
     }
}




public class Streamex3 {

    public static void main(String[] args) {

       ArrayList <Employees> emps=new ArrayList<Employees>();

        Employees e1=new Employees("suresh",1,200);
        Employees e3=new Employees("sureshkumar",3,20000000);

        Employees e2=new Employees("saran",2,20000);

        emps.add(e1);
        emps.add(e2);
        emps.add(e3);

     Optional<Integer> maxi= emps

        //.parallelStream()
             //.stream().parallel()

             .stream().map(sa->sa.getSalary())
             .max((elm1,elm2) -> elm1.compareTo(elm2));
        System.out.println(maxi.get());
               // .filter(sl->sl.getSalary()>40000)
             //   .map(nm->nm.getName())
               // .limit(1).skip(1)

               // .forEach(System.out::println);

    }


}