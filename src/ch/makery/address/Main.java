package ch.makery.address;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	private Stage primaryStage;
	private AnchorPane passwordDemo;

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		primaryStage.setTitle("Password Demo");
		
		showPasswordDemo();
		
	}
	
	public void showPasswordDemo(){
		try{
			
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/PasswordDemo.fxml"));
			//loader.setLocation(Main.class.getResource("view/PasswordDemo.fxml"));
			passwordDemo = (AnchorPane) loader.load();
			
			Scene scene = new Scene(passwordDemo);
			primaryStage.setScene(scene);
			primaryStage.show();
	
		} catch (IOException e){
			e.printStackTrace();
			}
		
	}
	
    public Stage getPrimaryStage() {
        return primaryStage;
    }
	
	public static void main(String[] args) {
		launch(args);
	}
}
