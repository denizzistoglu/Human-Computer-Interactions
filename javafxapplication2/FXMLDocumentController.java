/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputControl;
import javafx.scene.control.*;

/**
 *
 * @author deniz
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label labelsol;
    @FXML
    private TextField textField1;
    @FXML
    private TextField textField2;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {   
        try {
            String in1 = textField1.getText();
            int int1 = Integer.parseInt(in1);
            String in2 = textField2.getText();
            int int2 = Integer.parseInt(in2);
            int sol = int1 + int2;
            labelsol.setText(String.valueOf(sol));
            
        } catch (NumberFormatException e) {
            labelsol.setText("Invalid input");
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
