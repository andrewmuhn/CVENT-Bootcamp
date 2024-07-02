package com.pluralsight;

public class Reservation {
    private final Float price;
    private RoomType roomType;
    private int numberOfNights;
    private boolean weekend;

    public Reservation(RoomType roomType, int numberOfNights, boolean weekend) {
        this.roomType = roomType;
        this.price = roomType == RoomType.KING ? 139.00f : 124.00f;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public Float getPrice() {
        return price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }

    public float getReservationTotal() {
        return weekend ? price * 1.10f : price;
    }
}

