import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class PaneTest extends Application
{
	public static void main(String[] args) {
		Application.launch(args);
	}
	@Override
	public void start(Stage stage)
	{
		Pane p = new Pane();
		Button okBtn = new Button("OK");
		okBtn.relocate(10 , 10);
		Button cancelBtn = new Button("Cancel");
		cancelBtn.relocate(60 , 10);
		cancelBtn.setOnAction(e ->
			Platform.exit());
		p.getChildren().addAll(okBtn , cancelBtn);
		p.setStyle("-fx-border-style:solid inside;"
			+ "-fx-border-width:3;"+
			 "-fx-border-color:red;"
			);
		Scene scene = new Scene(p);
		stage.setScene(scene);
		stage.setTitle("Pane Test");
		stage.show();
	}
}
