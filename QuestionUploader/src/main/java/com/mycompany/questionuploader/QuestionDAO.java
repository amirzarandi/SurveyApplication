package com.mycompany.questionuploader;

import java.io.IOException;
import javafx.fxml.FXML;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

public class QuestionDAO {
    private Statement statement;
    private PreparedStatement insertStatement;

    public QuestionDAO() throws IOException, SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/survey?user=student&password=Cmsc250!");
        System.out.println("Database connected");
        Statement statement = connection.createStatement();
        String insertSql= "Insert into survey.questions(question,choices,date) values (?,?,?)";
        this.insertStatement = connection.prepareStatement(insertSql);
    }
    

    public void  InsertQuestion(String question,String choices,LocalDate Date){
        java.sql.Date dateSql =java.sql.Date.valueOf(Date);
        try {
            insertStatement.setString(1,question);
            insertStatement.setString(2,choices);
            insertStatement.setDate(3,dateSql);
            insertStatement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(QuestionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
