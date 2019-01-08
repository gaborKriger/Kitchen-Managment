package Employees.KitchenStaff;

import java.util.Date;

public class Cooks extends CanCook {

    public Cooks(String name, Date birthDate, double salary) {
        super.setName(name);
        super.setBirthDay(birthDate);
        super.setSalary(salary);
        super.setTax(salary * 0.01);
        super.setHasKnife(true);
    }
}
