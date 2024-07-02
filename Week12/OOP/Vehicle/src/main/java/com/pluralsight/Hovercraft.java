package com.pluralsight;

public class Hovercraft extends Vehicle{
    private int maxAltitude;
    private boolean hasRadar;
    public Hovercraft(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int maxAltitude, boolean hasRadar) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.maxAltitude = maxAltitude;
        this.hasRadar = hasRadar;
    }

    public int getMaxAltitude() {
        return maxAltitude;
    }

    public void setMaxAltitude(int maxAltitude) {
        this.maxAltitude = maxAltitude;
    }

    public boolean isHasRadar() {
        return hasRadar;
    }

    public void setHasRadar(boolean hasRadar) {
        this.hasRadar = hasRadar;
    }
}
