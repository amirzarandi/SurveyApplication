package edu.lawrence.survey_server;

public class Vote {
    private String response;
    private int votes;
    
    
    public Vote() {}
    
    public String getResponse() { return response; }
    public int getVotes() { return votes; }
    
    public void setResponse(String response) { this.response = response; }
    public void setVotes(int votes) { this.votes = votes; }
}