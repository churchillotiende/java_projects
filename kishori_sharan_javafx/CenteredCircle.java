import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.scene.shape.Circle;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.stage.Stage;

public class CenteredCircle extends Application
{
	@Override
	public void start(Stage stage)
	{
		Circle c = new Circle();
		Group root = new Group(c);
		Scene scene = new Scene(root , 100 ,100);

		//Actual centering of the circle
		// Half of the scene width
		
		c.centerXProperty().bind(scene.widthProperty().divide(2));
		// Half of the scene height

		c.centerYProperty().bind(scene.heightProperty().divide(2));
		c.radiusProperty().bind(Bindings.min(scene.widthProperty(),
			 scene.heightProperty()).divide(2));

		stage.setTitle("Centered Circle");
		stage.setScene(scene);
		stage.sizeToScene();
		stage.show();

	}
}