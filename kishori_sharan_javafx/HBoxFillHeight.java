import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.CheckBox;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBoxFillHeight extends Application
{
	HBox root = new HBox(10); 
	public static void main(String[] args) {
		Application.launch(args);
	}
	@Override
	public void start(Stage stage)
	{
		Label descLbl = new Label("Description");
		TextArea desc = new TextArea();
		desc.setPrefColumnCount(10);
		desc.setPrefRowCount(3);

		Button okBtn = new Button("Ok");
		okBtn.setOnAction(e ->
			System.out.println("Ok Buddy"));
		Button cancelBtn = new Button("Cancel");
		// Let the cancel button expand vertically
		cancelBtn.setMaxHeight(Double.MAX_VALUE);
		cancelBtn.setOnAction(e ->Platform.exit());
		CheckBox fillHeightCbx = new CheckBox("Fill Height");
		fillHeightCbx.setSelected(true);
		root.setStyle("-fx-padding:10;" 
			+ "-fx-style:solid inside;"
			+ "-fx-border-width:2;" 
			+ "-fx-border-color:maroon;"
			+ "-fx-border-radius:5;"
			+ "-fx-border-insets:5;");
		// Add an event Handler to the CB so that the user can set the fillHeight property using the CB
		fillHeightCbx.setOnAction(e ->
			root.setFillHeight(fillHeightCbx.isSelected()));
		root.getChildren().addAll(descLbl , desc , okBtn  ,cancelBtn , fillHeightCbx);
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("fillHeight ");
		stage.show();

	}
}