import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBoxTest extends Application
{
	public static void main(String[] args) {
		Application.launch(args);
	}
	@Override
	public void start(Stage stage)
	{
		Label nameLbl = new Label("Name");
		TextField nameField = new TextField();
		Button okBtn = new Button("OK");
		Button cancelBtn = new Button("Cancel");
		HBox root = new HBox(10);
		root.getChildren().addAll(nameLbl , nameField  , okBtn , cancelBtn);
		root.setStyle("-fx-padding:10;" 
			+ "-fx-style:solid inside;"
			+ "-fx-border-width:2;" 
			+ "-fx-border-color:maroon;"
			+ "-fx-border-radius:5;"
			+ "-fx-border-insets:5;");
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("HBox Test");
		stage.show();
	}
}