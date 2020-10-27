import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class StyleClassTest extends Application
{
	public static void main(String[] args) {
		Application.launch(args);
	}
	@Override
	public void start(Stage stage)
	{
		Label name = new Label("Name");
		TextField nameTf = new TextField("");
		Button closeBtn = new Button("Close");
		HBox root = new HBox();
		root.getChildren().addAll(name , nameTf , closeBtn);
		root.getStyleClass().add("hbox");
		Scene scene = new Scene(root);
		scene.getStylesheets().add("resources/css/hbox.css");
		stage.setScene(scene);
		stage.setTitle("StyleClassTest");
		stage.show();
	}
}