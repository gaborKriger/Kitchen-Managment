import Employees.Employees;
import Employees.KitchenStaff.Chefs;
import Employees.KitchenStaff.Helpers;

import java.util.ArrayList;
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

    public void working() {
        for (int i = 0; i < 100; i++) {
            chefIsCooking();
            if (isChefIsCooking()){
                takeIngredients();
            }
        }
    }

    private void chefIsCooking() {
        for (Employees worker : workers) {
            if (worker instanceof Chefs) {
                ((Chefs) worker).setCooking(randomBoolean());
                if (((Chefs) worker).isCooking()) {
                    setChefIsCooking(true);
                }
            }
        }
    }

    private void takeIngredients() {
        String requiredIngredient = randomIngredients();
        for (Employees worker : workers) {
            if (worker instanceof Helpers) {
                Map<String,Integer> helperIngredients = ((Helpers) worker).getHelperHand();
                if (helperIngredients.get(requiredIngredient) > 0) {
                    helperIngredients.put(requiredIngredient, helperIngredients.get(requiredIngredient)-1);
                }
            }
        }
    }
}
