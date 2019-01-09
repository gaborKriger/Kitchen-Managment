package Employees;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public abstract class Employees {

    private String name;
    private LocalDate birthDay;
    private double salary;
    private double tax;


    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDay(String birthDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
        LocalDate date = LocalDate.parse(birthDate, formatter);
        this.birthDay = date;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public String getName() {
        return name;
    }
}
