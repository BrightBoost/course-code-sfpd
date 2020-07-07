package com.company.day6.exerciseconstructors;

public class Table extends Furniture {

    private int nrOfLegs;

    public int getNrOfLegs() {
        return nrOfLegs;
    }

    public void setNrOfLegs(int nrOfLegs) {
        this.nrOfLegs = nrOfLegs;
    }

    public Table(String brand) {
        super(brand);
    }

    public Table(String brand, int nrOfLegs){
        super(brand);
        this.nrOfLegs = nrOfLegs;
    }
}
