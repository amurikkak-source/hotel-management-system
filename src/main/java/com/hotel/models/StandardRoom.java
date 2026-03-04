package com.hotel.models;

public class StandardRoom {
    private String roomNumber;
    private String bedType;
    private boolean hasBalcony;
    private double price;

    public StandardRoom(String roomNumber, String bedType, boolean hasBalcony, double price) {
        this.roomNumber = roomNumber;
        this.bedType = bedType;
        this.hasBalcony = hasBalcony;
        this.price = price;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public String getBedType() {
        return bedType;
    }

    public boolean isHasBalcony() {
        return hasBalcony;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}