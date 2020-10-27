import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

public class ButtonStyleTest extends Application{
	public static void main(String[] args) {
		Application.launch(args);
	}
	@Override
	public void start(Stage stage)
	{
		Button yesBtn = new Button("Yes Button");
		Button noBtn = new Button("No Button");
		Button cancelBtn = new Button("Cancel Button");
		cancelBtn.setOnAction(e -> 
			Platform.exit());
		HBox root = new HBox();
		root.getChildren().addAll(yesBtn , noBtn , cancelBtn);
		Scene scene = new Scene(root , 300 , 300);
		scene.getStylesheets().add("resources/css/buttonstyles.css");
		stage.setScene(scene);
		stage.setTitle("Button Styles");
		stage.show();
	}
}