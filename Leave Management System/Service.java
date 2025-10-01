package com.example.leave.service;

import com.example.leave.model.Model;
import java.util.ArrayList;
import java.util.List;

/**
 * Service class to manage leave requests.
 */
public class Service {

    private List<Model> leaveRequests;

    public Service() {
        leaveRequests = new ArrayList<>();
    }

    public void submitLeave(Model leave) {
        leaveRequests.add(leave);
        System.out.println("Leave submitted for: " + leave.getName());
    }

    public void approveLeave(Model leave) {
        leave.approve();
        System.out.println("Leave approved for: " + leave.getName());
    }

    public List<Model> getLeaveRequests() {
        return leaveRequests;
    }
}
