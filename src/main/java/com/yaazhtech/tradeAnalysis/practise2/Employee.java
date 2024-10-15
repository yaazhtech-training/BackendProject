package com.yaazhtech.tradeAnalysis.practise2;

import java.util.Objects;

public class Employee {

    String empname;
    int id;

    public Employee(String empname, int id) {
        this.empname = empname;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empname='" + empname + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        Employee employee = (Employee) o;
        if( id != employee.id)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
