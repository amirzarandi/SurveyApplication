package edu.lawrence.survey_server;

public class Response {
    private int question; 
    private String response;
    
    
    public Response() {}
    
    public int getQuestion() { return question; }
    public String getResponse() { return response; }
    
    public void setQuestion(int question) { this.question = question; }
    public void setResponse(String response) { this.response = response; }
}

