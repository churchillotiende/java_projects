import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.stage.Screen;
import javafx.geometry.Rectangle2D;

public class ScreenDetailsApp extends Application
{
	public static void main(String[] args) {
		Application.launch(args);
	}
	@Override
	public void start(Stage stage)
	{
		ObservableList<Screen> screenList = Screen.getScreens();
		System.out.println("Screen Count :" + screenList.size());

		//Print the Details of all Screens
		for (Screen screen : screenList) {
		print(screen);			
		}
		Platform.exit();
	}

	public void print(Screen s)
	{
		System.out.println("Get DPI :" + s.getDpi());

		//Get Bounds
		System.out.println("Get Screen Bounds :" + s.getBounds());
		//Get Visual Bounds
		System.out.println("Get Screen VisualBounds :" + s.getVisualBounds());

	}
	
}
