package Employees.KitchenStaff;

import Employees.Employees;

import java.util.Date;
import java.util.Map;

import static Util.MyRandom.randomNumberBetween;

public class Helpers extends Employees {

    private Map<String,Integer> helperHand;
    private String[] ingredients = new String[]
            {"carrot", "potato", "meat"};

    public Helpers(String name, Date birthDate, double salary) {
        super.setName(name);
        super.setBirthDay(birthDate);
        super.setSalary(salary);
        super.setTax(salary * 0.01);
        for (String ingredient : ingredients) {
            addIngredients(ingredient);
        }
    }

    private void addIngredients(String ingredient) {
        helperHand.put(ingredient, randomNumberBetween(0,3));
    }
}
