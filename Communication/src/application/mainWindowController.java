package application;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class mainWindowController 
{

    @FXML
    private TextField txtUser;

    @FXML
    private PasswordField txtPasse;
    
    private Main main;
    
    public void setMain(Main main)
    {
    	this.main=main;
    }
    
    // pour ouvrir la fenêtre secondaire avec informations de l'usager
    public void openNewWindow()
    {
    	String user=txtUser.getText();
    	String passe=txtPasse.getText();
    	
    	if((user.equalsIgnoreCase("admin")) && (passe.equals("passe123")))
    		{
    			main.secondWindow(user);
    		}
     	else
        	{
    		 	main.iReset();
        	}
    }

}
