package edu.lawrence.survey_server;

public class Question {
    private int id;
    private String question;
    private String choices;
    private java.sql.Date date;
    
    public Question() {}
    
    public int getId() { return id; }
    public String getQuestion() { return question; }
    public String getChoices() { return choices; }
    public java.sql.Date getDate() { return date; }
    
    public void setId(int id) { this.id = id; }
    public void setQuestion(String question) { this.question = question; }
    public void setChoices(String choices) { this.choices = choices; }
    public void setDate(java.sql.Date date) { this.date = date; }
}
