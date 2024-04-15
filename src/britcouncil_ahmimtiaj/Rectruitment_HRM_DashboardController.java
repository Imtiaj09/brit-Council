/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package britcouncil_ahmimtiaj;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author a.h.m.imtiaj
 */
public class Rectruitment_HRM_DashboardController implements Initializable {

    @FXML
    private TableView<Rectruitment_HRM_Bin> rdTableViewfxml;
    @FXML
    private TableColumn<Rectruitment_HRM_Bin, String> rdEmployeeNamexid;
    @FXML
    private TableColumn<Rectruitment_HRM_Bin, String> rdEducationBackgroundfxid;
    @FXML
    private TableColumn<Rectruitment_HRM_Bin, String> rdExperiencefxid;
    @FXML
    private TableColumn<Rectruitment_HRM_Bin, String> rdJoiningDatefxid;

    /**
     * Initializes the controller class.
     */
    
    ArrayList<Rectruitment_HRM_Bin> addEmployeeFileList;
    ObservableList<Rectruitment_HRM_Bin> tempList = FXCollections.observableArrayList();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        addEmployeeFileList = new ArrayList <Rectruitment_HRM_Bin>();
        
        rdEmployeeNamexid.setCellValueFactory(new PropertyValueFactory<Rectruitment_HRM_Bin,String>("employeeName"));
        rdEducationBackgroundfxid.setCellValueFactory(new PropertyValueFactory<Rectruitment_HRM_Bin,String>("employeeEducation"));
        rdExperiencefxid.setCellValueFactory(new PropertyValueFactory<Rectruitment_HRM_Bin,String>("experience"));
        rdJoiningDatefxid.setCellValueFactory(new PropertyValueFactory<Rectruitment_HRM_Bin,String>("joiningDate"));
    }    
    
    
    private void loadEmployeeFileList() throws IOException {
        ObjectInputStream ois = null;
         {
            Rectruitment_HRM_Bin i;
            ois = new ObjectInputStream(new FileInputStream("Rectruitment.bin"));
            while(true){
                try {
                    Rectruitment_HRM_Bin ms = (Rectruitment_HRM_Bin) ois.readObject();
                    tempList.add(ms);
                } catch (EOFException e) {
                    break;
                } catch (ClassNotFoundException e) {
                    System.err.println("Class not Found");
                }
            }
            for(Rectruitment_HRM_Bin y : tempList){
                 rdTableViewfxml.getItems().add(y);
             }
        }
        
  }
    

    @FXML
    private void addEmployeeOnClick(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("add_New_Employee_Data.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show(); 
    }

    @FXML
    private void showAllOnClick(ActionEvent event) {
         ObjectInputStream ois = null;
        try{
            Rectruitment_HRM_Bin i;
            ois = new ObjectInputStream(new FileInputStream("Rectruitment.bin"));
            while(true){
                i = (Rectruitment_HRM_Bin) ois.readObject();
                rdTableViewfxml.getItems().add(i);
            }
        }
        catch(Exception e){
            try{
                if(ois != null)
                    ois.close();
            }
            catch(IOException x){
                x.printStackTrace();
            }
            e.printStackTrace();
        }
    }

    @FXML
    private void backOnClick(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("Rectruitment.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }
    
}
