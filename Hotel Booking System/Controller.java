package com.example.hotel.controller;

import com.example.hotel.model.Model;
import com.example.hotel.service.Service;
import java.util.List;

/**
 * Controller class to handle interactions for Hotel Booking System App.
 */
public class Controller {

    private Service hotelService;

    public Controller() {
        hotelService = new Service();
    }

    public void addRoom(String roomId, String roomType, double price) {
        Model room = new Model(roomId, roomType, price);
        hotelService.addRoom(room);
    }

    public void bookRoom(Model room) {
        hotelService.bookRoom(room);
    }

    public List<Model> getAllRooms() {
        return hotelService.getAllRooms();
    }
}
