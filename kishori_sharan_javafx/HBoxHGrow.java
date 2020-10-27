import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

public class HBoxHGrow extends Application
{
	public static void main(String[] args) {
		Application.launch(args);
	}
	@Override
	public void start(Stage stage)
	{
		HBox root = new HBox(10);
		Label descLbl = new Label("Description");
		TextField desc = new TextField();
		Button okBtn = new Button("Ok");
		okBtn.setOnAction(e ->
			System.out.println("Ok Buddy"));
		Button cancelBtn = new Button("Cancel");
		root.setStyle("-fx-padding:10;" 
			+ "-fx-style:solid inside;"
			+ "-fx-border-width:2;" 
			+ "-fx-border-color:maroon;"
			+ "-fx-border-radius:5;"
			+ "-fx-border-insets:5;");
		root.setHgrow(desc , Priority.ALWAYS);
		
		root.getChildren().addAll(descLbl , desc , okBtn  ,cancelBtn);
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("HBoxHGrow ");
		stage.show();
	}
}