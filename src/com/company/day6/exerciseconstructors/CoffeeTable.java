package com.company.day6.exerciseconstructors;

public class CoffeeTable extends Table {
    private int maxCapacityForCupsOfCoffee;

    public int getMaxCapacityForCupsOfCoffee() {
        return maxCapacityForCupsOfCoffee;
    }

    public void setMaxCapacityForCupsOfCoffee(int maxCapacityForCupsOfCoffee) {
        this.maxCapacityForCupsOfCoffee = maxCapacityForCupsOfCoffee;
    }

    public CoffeeTable(String brand) {
        super(brand);
    }

    public CoffeeTable(int maxCapacityForCupsOfCoffee, String brand){
        super(brand);
        this.maxCapacityForCupsOfCoffee = maxCapacityForCupsOfCoffee;
    }

    public CoffeeTable(int maxCapacityForCupsOfCoffee, String brand, int nrOfLegs){
        super(brand, nrOfLegs);
        this.maxCapacityForCupsOfCoffee = maxCapacityForCupsOfCoffee;
    }
}
