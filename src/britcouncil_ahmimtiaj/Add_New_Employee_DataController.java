/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package britcouncil_ahmimtiaj;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author a.h.m.imtiaj
 */
public class Add_New_Employee_DataController implements Initializable {

    @FXML
    private TextField employeeNamefxid;
    @FXML
    private TextField employeeEducationfxid;
    @FXML
    private TextField joiningDatefxid;
    @FXML
    private ComboBox<String> experiancefxid;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        experiancefxid.getItems().addAll("HSC", "Bsc", "BBA", "A level",
                "O level","SSC", "PSD");
    }    

    @FXML
    private void submitOnClick(ActionEvent event) {
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            f = new File("Rectruitment.bin");
            if(f.exists()){
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            Rectruitment_HRM_Bin d = new Rectruitment_HRM_Bin(employeeNamefxid.getText(), 
                    employeeEducationfxid.getText(),joiningDatefxid.getText(), 
                    experiancefxid.getValue());

            oos.writeObject(d);

            employeeNamefxid.clear();employeeEducationfxid.clear(); 
            joiningDatefxid.clear();experiancefxid.getSelectionModel().clearSelection();
            
            
            fos.close();
            oos.close();
            
        }
        catch(IOException e){
            Logger.getLogger(Add_New_Employee_DataController.class.getName()).log(Level.SEVERE, null, e);
    
        }
        finally{
            try{
                if(oos != null) oos.close();
            }
            catch(IOException e){
                Logger.getLogger(Add_New_Employee_DataController.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }

    @FXML
    private void backOnClick(ActionEvent event) throws IOException {
                Parent mainSceneParent = FXMLLoader.load(getClass().getResource("rectruitment_HRM_Dashboard.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }
    
}
