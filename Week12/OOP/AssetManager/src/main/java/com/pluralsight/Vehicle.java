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
                cost -= cost * (.03 * year);
                break;
            case 4,5,6:
                cost -= cost * (.06 * year);
                break;
            case 7,8,9,10:
                cost -= cost * (.08 * year);
                break;
            default:
                cost = 1000.00;
        }
        if (odometer > 100_000 && !makeModel.contains("Toyota") && !makeModel.contains("Honda")) {
            cost *= .75;
        }
        return cost;
    }
}
