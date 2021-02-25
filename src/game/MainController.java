package game;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class MainController implements Initializable {

	@FXML Label piLabel;
	@FXML Label statusLabel;
	//@FXML Button leaderBoardBtn;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		initialSetting();
		
	}
	
	public void initialSetting() {
		// TODO Auto-generated method stub
		
		piLabel.setText("Time : 0 sec(s), 0 digit(s) per second");
		statusLabel.setText("3.");
		
	}

	public void showLeaderBoard() {
		
		//leaderBoardBtn.setDisable(true);
		Stage leaderboard = new Stage();
		
		try {
			leaderboard.setScene(new Scene(FXMLLoader.load(getClass().getResource("Main.fxml"))));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		leaderboard.setOnCloseRequest(new EventHandler<WindowEvent>() {
			
			@Override
			public void handle(WindowEvent event) {
				// TODO Auto-generated method stub
			//	leaderBoardBtn.setDisable(false);
			}
			
		});
		
		leaderboard.show();
		
	}
	
}
