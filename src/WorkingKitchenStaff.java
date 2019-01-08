import Employees.Employees;

import java.util.ArrayList;
import java.util.List;

public class WorkingKitchenStaff {

    private final List<Employees> workers = new ArrayList<>();

    public void createKitchenStaff(Employees employee) {
        workers.add(employee);
    }


    public void working() {
        for (int i = 0; i < 100; i++) {
            for (Employees worker : workers) {

            }
        }
    }

}
