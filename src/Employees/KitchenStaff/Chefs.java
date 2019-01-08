package Employees.KitchenStaff;


public class Chefs extends CanCook {

    public Chefs(String name, String birthDate, double salary) {
        super.setName(name);
        super.setBirthDay(birthDate);
        super.setSalary(salary);
        super.setTax(salary * 0.01);
        super.setHasKnife(true);
    }
}
