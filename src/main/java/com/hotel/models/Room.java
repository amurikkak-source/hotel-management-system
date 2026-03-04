package com.hotel.models;

/**
 * Represents a Room in the hotel management system.
 */
public class Room {
    private int roomNumber;
    private String roomType;
    private boolean isAvailable;
    private double price;

    public Room(int roomNumber, String roomType, boolean isAvailable, double price) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isAvailable = isAvailable;
        this.price = price;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public double getPrice() {
        return price;
    }

    public void setAvailability(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}