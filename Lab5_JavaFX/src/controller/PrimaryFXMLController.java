/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author samps
 */
public class PrimaryFXMLController implements Initializable {

    /**
     * Initializes the controller class.
     * @param url
     */
    @FXML
    TextField nameTextField;
    @FXML
    TextField ageTextField;
    @FXML
    TextField emailTextField;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
            
    public void submit() {
        String name =nameTextField.getText();
        String age = ageTextField.getText();
        String email = emailTextField.getText();
        
        // Validation
        if (name.isEmpty()) {
            showAlert("Validation Error", "Name field must not be blank.");
            return;
        }
        
        if (age.isEmpty() || !age.matches("\\d+")) {
            showAlert("Validation Error", "Age field must be numeric.");
            return;
        }

        if (email.isEmpty()) {
            showAlert("Validation Error", "Email field must not be blank.");
            return;
        }
        
        // Success message
        System.out.println("Thanks for submitting "+name);
        System.out.println(age);
        System.out.println(email);
        
        //Alert
        Alert userAlert = new Alert(AlertType.INFORMATION);
        userAlert.setTitle("Success");
        userAlert.setHeaderText("Thanks for submitting. Please confirm your details below");
        userAlert.setContentText("Name: " + name + "\nAge: " + age + "\nEmail: " + email);
        Optional<ButtonType> showAndWait = userAlert.showAndWait();
    }

   private void showAlert(String title, String message) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
    
}
