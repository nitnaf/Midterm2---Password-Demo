package ch.makery.address.view;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Tooltip;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Text;

public class PasswordDemoController {
	
	@FXML
	private EventHandler<KeyEvent> listener;
	
	@FXML
	private PasswordField password;
	
	@FXML
	private Text text;
	
	@FXML
	private Button help;
	
	@FXML
	private void onAccept(){
		if (password.getText().equals("bugaboo")){
			text.setText("Success!");
		} else {
			text.setText("Incorrect password :'(");
		}
		
	}
	
	@FXML
	private Tooltip tooltip;
	
	
	@FXML
	private void onHelp(){
//		help.setTooltip(tooltip);
//		tooltip.setText("Help button pressed!);
//		tooltip.show(help, 500, 500);
	
		// Can't figure out how to get the ToolTip working... here is a ghetto ToolTip instead.
		
		text.setText("Help button pressed!");
		
	}
	
	@FXML
	private void handleKey(KeyEvent event){
		if (event.getCode() == KeyCode.ENTER){
			onAccept();
			
		}
	}

}
