package com.example.voting.controller;

import com.example.voting.model.Model;
import com.example.voting.service.Service;
import java.util.List;
import java.util.Map;

/**
 * Controller class to handle interactions for Voting System App.
 */
public class Controller {

    private Service votingService;

    public Controller() {
        votingService = new Service();
    }

    public void registerVoter(String name, String id) {
        Model voter = new Model(name, id);
        votingService.registerVoter(voter);
    }

    public void vote(Model voter, String candidateName) {
        votingService.vote(voter, candidateName);
    }

    public Map<String, Integer> getVotingResults() {
        return votingService.getResults();
    }

    public List<Model> getAllVoters() {
        return votingService.getVoters();
    }
}
