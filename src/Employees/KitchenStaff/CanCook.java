package Employees.KitchenStaff;

import Employees.Employees;

public abstract class CanCook extends Employees {

    private boolean hasKnife;

    public boolean isHasKnife() {
        return hasKnife;
    }

    public void setHasKnife(boolean hasKnife) {
        this.hasKnife = hasKnife;
    }
}
