package Employees.KitchenStaff;

public class Chefs extends CanCook {

    private boolean isCooking;

    public Chefs(String name, String birthDate, double salary) {
        super.setName(name);
        super.setBirthDay(birthDate);
        super.setSalary(salary);
        super.setTax(salary * 0.01);
        super.setHasKnife(true);
        this.setCooking(false);
    }

    public boolean isCooking() {
        return isCooking;
    }

    public void setCooking(boolean cooking) {
        this.isCooking = cooking;
    }
}
