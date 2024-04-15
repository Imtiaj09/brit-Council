/////*
//// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
//// * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
//// */
////package britcouncil_ahmimtiaj;
////
//import britcouncil_ahmimtiaj.OnBoard_Training_Bin;
//import java.io.EOFException;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.net.URL;
//import java.util.ResourceBundle;
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.fxml.FXMLLoader;
//import javafx.fxml.Initializable;
//import javafx.scene.Node;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.control.TableColumn;
//import javafx.scene.control.TableView;
//import javafx.scene.control.cell.PropertyValueFactory;
//import javafx.stage.Stage;
//
///**
// * FXML Controller class
// *
// * @author a.h.m.imtiaj
// */
//public class Onboarding_Training_HRM_DashboardController implements Initializable {
//
//    @FXML
//    private TableView<OnBoard_Training_Bin> otTableViewfxid;
//    @FXML
//    private TableColumn<OnBoard_Training_Bin, String> otNewEmployeeNamefxml;
//    @FXML
//    private TableColumn<OnBoard_Training_Bin, String> otNewEmployeeIDfxml;
//    @FXML
//    private TableColumn<OnBoard_Training_Bin, String> otNewEmployeeEmailfxml;
//    
//    ArrayList<Rectruitment_HRM_Bin> rectruitmentHRMList;
//    ObservableList<Rectruitment_HRM_Bin> tempList = FXCollections.observableArrayList();
//    /**
//     * Initializes the controller class.
//     */
//    @Override
//    public void initialize(URL url, ResourceBundle rb) {
//        otNewEmployeeNamefxml.setCellValueFactory(new PropertyValueFactory<>("EmployeeName"));
//        otNewEmployeeIDfxml.setCellValueFactory(new PropertyValueFactory<>("EmployeeID"));
//        otNewEmployeeEmailfxml.setCellValueFactory(new PropertyValueFactory<>("EmployeeEmail"));
//        loadOnboardTrainingHRMFile(); // Load data when initializing
//    }    
//    
//    private void loadOnboardTrainingHRMFile() {
//        ObjectInputStream ois = null;
//        try {
//            ois = new ObjectInputStream(new FileInputStream("Employee.bin"));
//            while (true) {
//                try {
//                    OnBoard_Training_Bin ms = (OnBoard_Training_Bin) ois.readObject();
//                    tempList.add(ms);
//                } catch (EOFException e) {
//                    break; // Reached end of file, exit the loop
//                } catch (ClassNotFoundException e) {
//                    System.err.println("Class not Found");
//                }
//            }
//            otTableViewfxid.setItems(tempList); // Set the items to the TableView
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//         finally {
//            try {
//                if (ois != null) {
//                    ois.close();
//                }
//            } catch (IOException x) {
//                x.printStackTrace();
//            }
//        }
//    }
//    
//
//    @FXML
//    private void otBackOnClick(ActionEvent event) throws IOException {
//        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("HRM_Dashboard.fxml"));
//        Scene scene1 = new Scene(mainSceneParent);
//        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
//        window.setScene(scene1);
//        window.show();
//    }
//
//    @FXML
//    private void addTrainningEmployeeOnClick(ActionEvent event) {
//    }
//
//    @FXML
//    private void otShowListOnClick(ActionEvent event) {
//    }
//    
//}
