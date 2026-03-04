package com.hotel.models;

import java.util.ArrayList;
import java.util.List;

public class RoomList {
    private List<Room> rooms;

    public RoomList() {
        this.rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void removeRoom(Room room) {
        rooms.remove(room);
    }

    public List<Room> getRooms() {
        return rooms;
    }

    // Additional features can be implemented here
}