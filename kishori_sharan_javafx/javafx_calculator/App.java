package App;
import model.*;
import view.*;
import controller.*;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application{

	private final model Model;
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) 
	{
		view View = new view(Model);
		Scene scene = new Scene(View);
		controller Controller = new controller(Model , View);
		stage.setScene(scene);
		stage.show();
	}
	
}