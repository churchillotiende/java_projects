import javafx.application.Application;
import javafx.binding.When;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class SlidingLeftNodeTest
{
	public static void main(String[] args) {
		Application.launch(args);
	}
	@Override
	public void start(Stage stage)
	{
		Button b1 = new Button("B1");
		Button b2 = new Button("B2");
		Button b1 = new Button("B3");
		Button visibleBtn = new Button("Make Visible");
		// Add an Action Listener to the Button to make b2 visible
		// If it is Invisible and Invisible if it visible
		visibleBtn.setOnAction(e ->
			b2.setVisible(!b2.isVisible()));

	}
}