import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

public class InlineStyles extends Application
{
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
		// Adding an inline style
		yesBtn.setStyle("-fx-text-fill:red;-fx-font-weight:bold;");

		Button openBtn = new Button("Open Button");
		Button saveBtn = new Button("Save Button");
		Button closeBtn = new Button("Close Button");

		VBox vb1 = new VBox();
		vb1.setPadding(new Insets(10 , 10 , 10 ,10));
		vb1.setStyle("-fx-border-width:4.0;-fx-border-color:blue;");
		vb1.getChildren().addAll(yesBtn  ,noBtn ,cancelBtn);

		VBox vb2 = new VBox();
		vb2.setPadding(new Insets(10 , 10 , 10 ,10));
		vb2.setStyle("-fx-border-width:4.0;-fx-border-color:blue;");
		vb2.getChildren().addAll(openBtn  ,saveBtn ,closeBtn);

		HBox root = new HBox();
		root.setPadding(new Insets(10 , 10 , 10 ,10));
		root.setSpacing(20);
		root.setStyle("-fx-border-width:10.0;-fx-border-color:navy;");
		root.getChildren().addAll(vb1 , vb2);
		Scene scene = new Scene(root);
		// scene.getStylesheets().add("resources/css/buttonstyles.css");
		stage.setScene(scene);
		stage.setTitle("Button Styles");
		stage.show();
	}
}