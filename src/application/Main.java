package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;

public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/fxml/UserCollection.fxml"));
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.setResizable(true);
			stage.getIcons().add(new Image("C:\\Users\\lonk9\\eclipse-workspace\\KeepToMyList_App\\icons\\list-rich-32 (Window).png"));
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
