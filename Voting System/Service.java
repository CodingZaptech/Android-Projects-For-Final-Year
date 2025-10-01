package com.example.voting.service;

import com.example.voting.model.Model;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Service class to manage voting and candidates.
 */
public class Service {

    private List<Model> voters;
    private Map<String, Integer> votesCount;

    public Service() {
        voters = new ArrayList<>();
        votesCount = new HashMap<>();
    }

    public void registerVoter(Model voter) {
        voters.add(voter);
        System.out.println("Voter registered: " + voter.getVoterName());
    }

    public void vote(Model voter, String candidateName) {
        voter.vote(candidateName);
        votesCount.put(candidateName, votesCount.getOrDefault(candidateName, 0) + 1);
        System.out.println(voter.getVoterName() + " voted for " + candidateName);
    }

    public Map<String, Integer> getResults() {
        return votesCount;
    }

    public List<Model> getVoters() {
        return voters;
    }
}
