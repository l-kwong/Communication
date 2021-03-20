package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class RepriseController 
{
	@FXML
	Button mReset;
	private Main main;
	
	public void setMain(Main main)
	{
		this.main=main;
	}
	
	public void lReset()
	{
		main.mainWindow();
	}
}
