import Employees.KitchenStaff.Chefs;
import Employees.KitchenStaff.Cooks;
import Employees.KitchenStaff.Helpers;

public class Main {

    public static void main(String[] args) {

        WorkingKitchenStaff wks = new WorkingKitchenStaff();

        wks.createKitchenStaff(new Chefs("Gordon Ramsey", "July 12, 1980", 100_000));
        wks.createKitchenStaff(new Chefs("Jamie Oliver", "October 5, 1975", 95_000));
        wks.createKitchenStaff(new Chefs("Rachael Ray", "May 22, 1984", 80_000));
        wks.createKitchenStaff(new Chefs("Bobby Flay", "June 2, 1986", 75_000));

        wks.createKitchenStaff(new Cooks("Banana Joe", "September 28, 1972", 25_000));

        wks.createKitchenStaff(new Helpers("Slave Steve", "December 1, 2000", 15_000));
        wks.createKitchenStaff(new Helpers("Slave Hank", "March 31, 1998", 17_500));
        wks.createKitchenStaff(new Helpers("Slave Robot", "January 1, 2018", 0));

        wks.working(1_000);
    }
}
