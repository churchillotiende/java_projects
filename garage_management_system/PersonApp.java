package app;
import view.*;
import model.*;
import presenter.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PersonApp extends Application
{
	public static void maim(String[] args)
	{
		Application.launch(args);
	}

	@Override
	public void start(Stage stage)
	{
		Person person = new Person();
		String dateFormat = "MM/dd/yyyy";
		PersonView view = new PersonView(person , dateFormat);

		// Must set the scene before creating the presenter that uses
		// the scene to listen to the focus change
		Scene scene = new Scene(view);
		PersonPresenter presenter = new PersonPresenter(person , view);
		view.setStyle("-fx-padding:10;" +
			"-fx-border-style:solid inside;" +
			"-fx-border-width:2;" +"-fx-border-insets:5;" +
			"-fx-border-radius:5;" +
			"-fx-border-color:blue;");
		stage.setScene(scene);
		stage.setTitle("Person Management");
		stage.show();
	}
}