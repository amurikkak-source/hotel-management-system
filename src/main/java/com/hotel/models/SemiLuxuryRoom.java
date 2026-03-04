package com.hotel.models;

public class SemiLuxuryRoom {
    private int roomNumber;
    private double price;
    private boolean isAvailable;

    public SemiLuxuryRoom(int roomNumber, double price) {
        this.roomNumber = roomNumber;
        this.price = price;
        this.isAvailable = true;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void bookRoom() {
        if (isAvailable) {
            isAvailable = false;
        } else {
            throw new IllegalStateException("Room is already booked");
        }
    }

    public void releaseRoom() {
        isAvailable = true;
    }
}