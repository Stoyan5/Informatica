/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxml;

import it.zuccante.pop3fxclient.Pop3Client;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 *
 * @author stoyan.botusharov
 */
public class loginController {
	private Pop3Client p;
    
    @FXML
    private TextField usernameField;
	@FXML
    private PasswordField passwordField;
	@FXML
	private Button connect;
	
	@FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        System.out.println("connecting...");
			p.connect();
    }

	@FXML
	private void handleTextFieldUpdate(ActionEvent event){
		p.setUser(usernameField.getText());
		System.out.println("username set to"+p.getUser());
	}
	
	@FXML
	private void handlePasswordUpdate(ActionEvent event){
		p.setPass(passwordField.getText());
		System.out.println("password set to"+p.getPass());
	}
}
