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
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author a.h.m.imtiaj
 */
public class Recruitment_HRM_DashboardController implements Initializable {

    @FXML
    private TextField rdEmlopyeNamefxid;
    @FXML
    private TextField rdEducationfxid;
    @FXML
    private TextField experiencefxid;
    @FXML
    private TableView<?> rdTablefxid;
    @FXML
    private TableColumn<?, ?> rdEmployeeTablefxid;
    @FXML
    private TableColumn<?, ?> rdEducationTablefxid;
    @FXML
    private TableColumn<?, ?> rdExperienceTablefxid;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void rdSubmitOnclick(ActionEvent event) {
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            f = new File("Employee.bin");
            if(f.exists()){
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            Rectruitment_HRM_Bin d = new Rectruitment_HRM_Bin(rdEmlopyeNamefxid.getText(), rdEducationfxid.getText(),
                    experiencefxid.getText());
            
            oos.writeObject(d); 
            
            rdEmlopyeNamefxid.clear(); rdEducationfxid.clear();
            experiencefxid.clear(); 
            
            fos.close();
            oos.close();
            
        }
        catch(IOException e){
            Logger.getLogger(Recruitment_HRM_DashboardController.class.getName()).log(Level.SEVERE, null, e);
    
        }
        finally{
            try{
                if(oos != null) oos.close();
            }
            catch(IOException e){
                Logger.getLogger(Recruitment_HRM_DashboardController.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    
    }

    

    @FXML
    private void rdShowOnClick(ActionEvent event) {
        
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            f = new File("Employee.bin");
            if(f.exists()){
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            Rectruitment_HRM_Bin d = new Rectruitment_HRM_Bin(rdEmlopyeNamefxid.getText(), rdEducationfxid.getText(),
                    experiencefxid.getText());
            
            oos.writeObject(d); 
            
            rdEmlopyeNamefxid.clear(); rdEducationfxid.clear();
            experiencefxid.clear(); 
            
            fos.close();
            oos.close();
            
        }
        catch(IOException e){
            Logger.getLogger(Recruitment_HRM_DashboardController.class.getName()).log(Level.SEVERE, null, e);
    
        }
        finally{
            try{
                if(oos != null) oos.close();
            }
            catch(IOException e){
                Logger.getLogger(Recruitment_HRM_DashboardController.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    
    }


    @FXML
    private void rdBackOnClick(ActionEvent event) {
        
    }
    
}
