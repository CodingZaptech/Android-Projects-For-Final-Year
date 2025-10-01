package com.example.leave.controller;

import com.example.leave.model.Model;
import com.example.leave.service.Service;
import java.util.List;

/**
 * Controller class to handle interactions for Leave Management System.
 */
public class Controller {

    private Service leaveService;

    public Controller() {
        leaveService = new Service();
    }

    public void submitLeave(String name, String id, int days, String reason) {
        Model leave = new Model(name, id, days, reason);
        leaveService.submitLeave(leave);
    }

    public void approveLeave(Model leave) {
        leaveService.approveLeave(leave);
    }

    public List<Model> getAllLeaveRequests() {
        return leaveService.getLeaveRequests();
    }
}
