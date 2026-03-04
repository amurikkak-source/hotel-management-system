package com.hotel.models;

public class LuxuryRoom {
    private String roomNumber;
    private double price;
    private boolean hasOceanView;
    
    public LuxuryRoom(String roomNumber, double price, boolean hasOceanView) {
        this.roomNumber = roomNumber;
        this.price = price;
        this.hasOceanView = hasOceanView;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public double getPrice() {
        return price;
    }

    public boolean hasOceanView() {
        return hasOceanView;
    }
}