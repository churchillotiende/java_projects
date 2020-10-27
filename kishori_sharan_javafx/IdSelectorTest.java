import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class IdSelectorTest extends Application
{
	public static void main(String[] args) {
		Application.launch(args);
	}
	@Override
	public void start(Stage stage)
	{
		Button openBtn = new Button("Open");
		Button saveBtn = new Button("Save");
		Button closeBtn = new Button("Close");

		closeBtn.setId("closeBtn");

		double hSpacing = 10;
		HBox root = new HBox( hSpacing, openBtn , saveBtn , closeBtn);
		Scene scene = new Scene(root);
		scene.getStylesheets().add("resources/css/idselector.css");
		stage.setScene(scene);
		stage.show();
	}
}