package com.pluralsight;

public class SemiTruck extends Vehicle {
    private int numberOfAxles;
    private boolean hasSleeperCab;

    public SemiTruck(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int numberOfAxles, boolean hasSleeperCab) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.numberOfAxles = numberOfAxles;
        this.hasSleeperCab = hasSleeperCab;
    }

    public int getNumberOfAxles() {
        return numberOfAxles;
    }

    public void setNumberOfAxles(int numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
    }

    public boolean isHasSleeperCab() {
        return hasSleeperCab;
    }

    public void setHasSleeperCab(boolean hasSleeperCab) {
        this.hasSleeperCab = hasSleeperCab;
    }
}
