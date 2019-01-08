import Employees.Employees;
import Employees.KitchenStaff.Chefs;

import java.util.ArrayList;
import java.util.List;

public class WorkingKitchenStaff {

    private final List<Employees> workers = new ArrayList<>();

    public void createKitchenStaff() {
        workers.add(new Chefs("Gordon Ramsey", "July 12, 1980", 100_000));

    }

}
