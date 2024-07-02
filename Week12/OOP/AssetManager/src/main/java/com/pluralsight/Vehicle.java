package com.pluralsight;

public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }


    @Override
    public double getValue() {
        double cost = getOriginalCost();
        switch (year) {
            case 0,1,2,3:
                cost *= .97;
            case 4,5,6:
                cost *= .94;
            case 7,8,9,10:
                cost *= .92;
            default:
                cost -= 1000.00;
        }
        if (odometer > 100_000 && !makeModel.contains("Toyota") || !makeModel.contains("Honda")) {
            cost *= .25;
        }
        return cost;
    }
}
