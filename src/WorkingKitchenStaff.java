import Employees.Employees;
import Employees.KitchenStaff.Chefs;
import Employees.KitchenStaff.Helpers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static Util.MyRandom.randomBoolean;
import static Util.MyRandom.randomIngredients;

public class WorkingKitchenStaff {

    private final List<Employees> workers = new ArrayList<>();
    private boolean chefIsCooking;

    public boolean isChefIsCooking() {
        return chefIsCooking;
    }

    public void setChefIsCooking(boolean chefIsCooking) {
        this.chefIsCooking = chefIsCooking;
    }

    public void createKitchenStaff(Employees employee) {
        workers.add(employee);
    }

    public void working(int turn) {
        int countRound = 0;
        for (int i = 0; i < turn; i++) {
            Collections.shuffle(workers);
            setChefIsCooking(false);
            countRound++;
            System.out.println("\u001B[31m" + "\nRound: " + countRound + "\u001B[0m");
            chefIsCooking();
        }
    }

    private void chefIsCooking() {
        for (Employees worker : workers) {
            if (worker instanceof Chefs) {
                ((Chefs) worker).setCooking(randomBoolean());
                if (((Chefs) worker).isCooking()) {
                    setChefIsCooking(true);
                    System.out.print("\u001B[32m" + "Chef (" + worker.getName() + ") is cooking" + "\u001B[0m");
                    if (isChefIsCooking()){
                        takeIngredients();
                    }
                }
            }
        }
    }

    private void takeIngredients() {
        String requiredIngredient = randomIngredients();
        System.out.println(", he needs " + requiredIngredient + ".");
        boolean giveIngredients = false;
        for (Employees worker : workers) {
            if (worker instanceof Helpers) {
                Map<String,Integer> helperIngredients = ((Helpers) worker).getHelperHand();
                String helperName = worker.getName();
                System.out.println(helperName + " has " + helperIngredients.get(requiredIngredient) + " " + requiredIngredient + ".");
                if (helperIngredients.get(requiredIngredient) > 0 && !giveIngredients) {
                    helperIngredients.put(requiredIngredient, helperIngredients.get(requiredIngredient)-1);
                    giveIngredients = true;
                    System.out.println("\u001B[33m" + helperName + " gave the Chef " + requiredIngredient + ". Now (s)he has " + helperIngredients.get(requiredIngredient) + " " + requiredIngredient + "." + "\u001B[0m");
                }
            }
        }
        if (!giveIngredients) {
            System.out.println("\u001B[35m" + "We're all out! We're all out!" + "\u001B[0m");
            for (Employees worker : workers) {
                if (worker instanceof Helpers) {
                    ((Helpers) worker).addIngredients(requiredIngredient);
                    System.out.println(worker.getName() + " go to the fridge, and take " + ((Helpers) worker).getHelperHand().get(requiredIngredient) + " " + requiredIngredient + ".");
                }
            }
        }
        System.out.println();
    }
}
