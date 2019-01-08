package Employees;

import java.util.Date;

public abstract class Employees {

    private String name;
    private Date birthDay;
    private double salary;
    private double tax;


    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
}
