package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class secondWindowController 
{
	@FXML
	Label label;
	
	public void setText(String nom)
	{
		this.label.setText("Bienvenue " + nom + " à notre portail");
	}
}
