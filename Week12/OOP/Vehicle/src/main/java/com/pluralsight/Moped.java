package com.pluralsight;

public class Moped extends Vehicle {
    private int maxSpeed;
    private int engineSize;

    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int maxSpeed, int engineSize) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.maxSpeed = maxSpeed;
        this.engineSize = engineSize;
    }

    public Moped() {
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }
}

