package App;
import model.*;
import view.*;
import presenter.*;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class App extends Application
{

	private final Person person;
	private final  PersonView personView;
	public static void main(String[]args)
	{
		launch(args);
	}
	@Override
	public void start(Stage stage)
	{
		String dateFormat = "dd/mm/yy";
		PersonView personView = new PersonView(person , dateFormat);
		Scene scene = new Scene(personView);
		PersonPresenter personPresenter = new PersonPresenter(person , personView);
		stage.setScene(scene);
		stage.setTitle("Hey");
		stage.show();
		
	}
}