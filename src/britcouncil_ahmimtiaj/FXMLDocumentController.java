/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package britcouncil_ahmimtiaj;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author a.h.m.imtiaj
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button manageExamfxid;
    @FXML
    private Button examRegistrationfxid;
    @FXML
    private Button venueCoordinatorfxid;
    @FXML
    private Button studentResultfxml;
    @FXML
    private Button feedbackfxid;
    @FXML
    private Button stakeholderfxid;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void manageExamOnClick(ActionEvent event) {
    }

    @FXML
    private void examRegistrationOnClick(ActionEvent event) {
    }

    @FXML
    private void venueCoordinatorOnClick(ActionEvent event) {
    }

    @FXML
    private void studentResultOnClick(ActionEvent event) {
    }

    @FXML
    private void feedbackOnClick(ActionEvent event) {
    }

    @FXML
    private void stakeholderOnClick(ActionEvent event) {
    }
    
}
