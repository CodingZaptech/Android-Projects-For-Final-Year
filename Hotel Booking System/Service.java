package com.example.hotel.service;

import com.example.hotel.model.Model;
import java.util.ArrayList;
import java.util.List;

/**
 * Service class to manage hotel rooms and bookings.
 */
public class Service {

    private List<Model> rooms;

    public Service() {
        rooms = new ArrayList<>();
    }

    public void addRoom(Model room) {
        rooms.add(room);
        System.out.println("Room added: " + room.getRoomId());
    }

    public void bookRoom(Model room) {
        room.bookRoom();
    }

    public List<Model> getAllRooms() {
        return rooms;
    }
}
