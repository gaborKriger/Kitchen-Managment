import Employees.Employees;
import Employees.KitchenStaff.Chefs;
import Employees.KitchenStaff.Cooks;
import Employees.KitchenStaff.Helpers;

import java.util.ArrayList;
import java.util.List;

public class WorkingKitchenStaff {

    private final List<Employees> workers = new ArrayList<>();

    public void createKitchenStaff(Employees employee) {
        workers.add(employee);
    }

    public void helperHand() {
        for (Employees worker : workers) {
            if (worker instanceof Helpers) {
                System.out.println(((Helpers) worker).getHelperHand());
            }
        }
    }

}
