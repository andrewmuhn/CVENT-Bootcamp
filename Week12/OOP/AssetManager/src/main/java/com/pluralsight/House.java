package com.pluralsight;

import java.util.HashMap;

public class House extends Asset {
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;
    private final HashMap<Integer, Double> conditionValue;

    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
        conditionValue = new HashMap<>();
        conditionValue.put(1, 180.00);
        conditionValue.put(2, 130.00);
        conditionValue.put(3, 90.00);
        conditionValue.put(4, 80.00);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double getValue () {
        return squareFoot * conditionValue.get(condition) + .25 * lotSize;
    }
}
