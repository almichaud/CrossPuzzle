package application.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

import application.ViewSwitcher;
import application.model.CrossPuzzle;
import application.model.CurrentPuzzle;

public class MainController implements Initializable{
	@FXML
	private Button startButt;
	@FXML
	private TextField puzzleName;
	//public CrossPuzzle currentPuzzle = new CrossPuzzle();
	@FXML
	void crossStart(ActionEvent event) {
		try {
		    String newPuzzleName = puzzleName.getText();
			CrossPuzzle currentPuzzle = CurrentPuzzle.getInstance().getPuzzle();
			currentPuzzle.setName(newPuzzleName);
			ViewSwitcher.getInstance().switchView(2);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
}
