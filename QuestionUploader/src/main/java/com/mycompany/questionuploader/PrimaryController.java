/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questionuploader;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author eugenesegbefia
 */
public class PrimaryController implements Initializable {

    private QuestionDAO dao;

    @FXML
    private TextField QuestionInput;
    @FXML
    private TextField ChoicesInput;
    @FXML
    private DatePicker SqlDate;
    @FXML
    private Label rex;
    @FXML
    private Label rep;
    @FXML
    private Label rat;
    @FXML
    private Label rob;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            dao = new QuestionDAO();
            rex.setText("   Enter Question :  ");
            rat.setText("   Enter Choices seperated by a Comma : ");
            rep.setText("   Select Date Question Should be Displayed : ");
        } catch (IOException ex) {
            Logger.getLogger(PrimaryController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PrimaryController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PrimaryController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void AddToTable(ActionEvent event) {
        String question = QuestionInput.getText();
        String choices = ChoicesInput.getText();
        LocalDate date = SqlDate.getValue();
        dao.InsertQuestion(question, choices, date);
        rob.setText(" Question has been added to the database! ");
    }
}
