package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	private Stage primaryStage;
	@Override
	public void start(Stage primaryStage) 
	{
		this.primaryStage=primaryStage;
		mainWindow();
		
	}
	
	// pour charger la fenêtre principale
	public void mainWindow()
	{
		try {
			FXMLLoader loader=new FXMLLoader(Main.class.getResource("mainWindow.fxml"));
			AnchorPane pane=loader.load();
			Scene scene=new Scene(pane);
			mainWindowController mainwindowcontroller=loader.getController();
			mainwindowcontroller.setMain(this);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Identification");
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// pour charger la fenêtre secondaire
	public void secondWindow(String m)
	{
		try {
			FXMLLoader loader=new FXMLLoader(Main.class.getResource("secondWindow.fxml"));
			AnchorPane pane=loader.load();
			Scene scene=new Scene(pane);
			secondWindowController secondwindowcontroller=loader.getController();
			secondwindowcontroller.setText(m);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Bienvenue");
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// pour charger la troisième fenêtre 
	public void iReset()
	{
		try {
			FXMLLoader loader=new FXMLLoader(Main.class.getResource("Reprise.fxml"));
			AnchorPane pane=loader.load();
			Scene scene=new Scene(pane);
			RepriseController reprisecontroller=loader.getController();
			reprisecontroller.setMain(this);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Erreur");
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
