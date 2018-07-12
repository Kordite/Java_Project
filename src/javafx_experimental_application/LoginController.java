/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx_experimental_application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 *
 * @author revoniuk
 */
public class LoginController implements Initializable {
    
    @FXML private Label label;
    @FXML private TextArea textAreaMain;
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        textAreaMain.setText(textAreaMain.getText() + "I've been clicked!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
