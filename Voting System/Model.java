package com.example.voting.model;

/**
 * Model class representing a voter and candidate in the Voting System.
 */
public class Model {

    private String voterName;
    private String voterId;
    private String candidateName;

    // Constructor
    public Model(String voterName, String voterId) {
        this.voterName = voterName;
        this.voterId = voterId;
    }

    // Getters and Setters
    public String getVoterName() {
        return voterName;
    }

    public void setVoterName(String voterName) {
        this.voterName = voterName;
    }

    public String getVoterId() {
        return voterId;
    }

    public void setVoterId(String voterId) {
        this.voterId = voterId;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void vote(String candidateName) {
        this.candidateName = candidateName;
    }
}
