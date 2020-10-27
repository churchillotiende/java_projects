import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class MicroHelp extends Application
{
	private Text helpText = new Text();
	public static void main(String[] args) {
		Application.launch(args);
	}
	@Override
	public void start(Stage stage)
	{
		Label fnameLbl = new Label("First Name");
		fnameLbl.setFont(Font.font(null, FontWeight.BOLD ,14));
		Label lnameLbl = new Label("Last Name");
		lnameLbl.setFont(Font.font(null,FontWeight.BOLD ,  14));
		Label salaryLbl = new Label("Salary");
		salaryLbl.setFont(Font.font(null, FontWeight.BOLD ,14));
		TextField fName = new TextField();
		TextField lName = new TextField();
		TextField salary = new TextField();
		Button saveButton = new Button("Save");
		saveButton.setTooltip (new Tooltip("Saves the data"));
		Button closeButton = new Button("Close");
		// saveButton.setOnAction(e ->
				
		// 		Platform.exit()
		// 		);
		fName.getProperties().put("microHelpText" , "Enter the First Name");
		lName.getProperties().put("microHelpText" , "Enter the Last Name");
		salary.getProperties().put("microHelpText" , "Enter Salary more than $2000");

		 // The help text node is unmanaged     
        helpText.setManaged(false);           
        helpText.setTextOrigin(VPos.TOP); 
        helpText.setFill(Color.RED);   
        helpText.setFont(Font.font(null, 12));
        helpText.setMouseTransparent(true); 

		GridPane root = new GridPane();
		root.add(fnameLbl, 1, 1);  
	    root.add(fName, 2  , 1); 
	    root.add(lnameLbl, 1, 2);     
	    root.add(lName, 2, 2);

	    root.add(salaryLbl, 1, 3); 
	    root.add(salary, 2, 3);  
	    root.add(saveButton ,3 , 3 );
	    root.add(helpText , 2,2);

	    root.setStyle("-fx-padding:10;" 
			+ "-fx-style:solid inside;"
			+ "-fx-border-width:2;" 
			+ "-fx-border-color:maroon;"
			+ "-fx-border-radius:5;"
			+ "-fx-border-insets:5;");
	    root.setHgrow(fName , Priority.ALWAYS);
		
		Scene scene = new Scene(root , 400 , 120);
		// Add a change listener to the scene so as to know when the focus owner
		// Changes and displays the MicroHelp
		scene.focusOwnerProperty().addListener(
			(ObservableValue<? extends Node>value, Node oldNode , Node newNode)
					-> focusChanged(value , oldNode , newNode));
		scene.getStylesheets().add("resources/css/buttonstyles.css");
		scene.getStylesheets().add("resources/css/hbox.css");

		stage.setScene(scene);
		stage.setTitle("Garage Management System");
		stage.show();
	}

	public void focusChanged(ObservableValue<? extends Node> value , 
			Node oldNode , Node newNode)
	{
			String microHelpText = (String)newNode.getProperties().get("microHelpText");
			if(microHelpText != null && microHelpText.trim().length() > 0)
			{
				helpText.setText(microHelpText);
				helpText.setVisible(true);

                         // Position the help text node   
                double x =  newNode.getLayoutX() +   
			                newNode.getLayoutBounds().getMinX() - 
			                helpText.getLayoutBounds().getMinX();  
                double y =  newNode.getLayoutY() +
			                newNode.getLayoutBounds().getMinY() +  
			                newNode.getLayoutBounds().getHeight() -  
                helpText.getLayoutBounds().getMinX();
                helpText.setLayoutX(x);       
                helpText.setLayoutY(y);    
                helpText.setWrappingWidth(newNode.getLayoutBounds().getWidth()); 
			}
			else
			{
				helpText.setVisible(false);
			}
	}
}