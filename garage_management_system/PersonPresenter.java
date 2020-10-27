package presenter;
import model.*;
import view.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class PersonPresenter {
	// Instance variables
	private final Person person;
	private final PersonView view;
	public static void main(String[]args)
	{
		Application.launch(args);
	}

	// Parametized constructor
	public PersonPresenter(Person person , PersonView view)
	{
		this.person = person;
		this.view = view;
		attatchEvents();
 	}
 	private void attatchEvents()
 	{
 		// handleBirthDateChange

		view.bDateTfd.setOnAction(e -> handleBirthDateChange());
		view.bDateTfd.getScene().focusOwnerProperty().
								addListener(this::focusChanged);

		// Save the data
		view.saveBtn.setOnAction(e -> saveData());

 		// Close window when close button is pressed;
		view.closeBtn.setOnAction(e -> view.getScene().getWindow().hide());

 	}

 	public void focusChanged(ObservableValue<? extends Node>value , 
 		Node oldNode  ,Node newNode)
	{
 		// The birthdateTfd has lost focus
 		if(oldNode == view.bDateTfd)
 		{
			handleBirthDateChange();
 		}
 	}

 	private void handleBirthDateChange()
 	{
 		String bdateStr = view.bDateTfd.getText();
 		if(bdateStr == null || bdateStr.trim().equals(""))
 		{
 			person.setBirthDate(null);
 			view.syncBirthDate();
 		}
 		else
 		{
			try
			{
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern(view.dateFormat);
				LocalDate bdate = LocalDate.parse(bdateStr , formatter);

				List<String> errorList = new ArrayList<>();
				if(person.isValidBirthDate(bdate , errorList))
				{
 					person.setBirthDate(bdate);
 					view.syncAgeCategory();
 				}
 				else
 				{
 					this.showError(errorList);
 					view.syncBirthDate();

 				}
			}

			catch(DateTimeParseException e)
			{
				// BDate is not in the spcified date format
 				List<String>errorList = new ArrayList<>();
 				errorList.add("Birth Date must be in the " + view.dateFormat.toLowerCase() +
 					"format.");
 				this.showError(errorList);

 				// Refresh the view
 				view.syncBirthDate();
 			}
 		}
 	}

 	private void saveData()
	{
		List<String> errorList = new ArrayList<>();
		boolean isSaved = person.save(errorList);
		if(!isSaved)
 		{
 			this.showError(errorList);
 		}
 	}

 	public void showError(List<String> errorList)
 	{
		String msg = "";
 		if(errorList.isEmpty())
 		{
 			msg = "No message to display";
 		}
 		else 

 		{
 			// for each loop
 			for(String s:errorList)
			{
				msg = msg + s + "\n";
			}
		}
 		Label msgLbl = new Label(msg);
 		Button okBtn = new Button("OK");
 		VBox root = new VBox(new StackPane(msgLbl) , new StackPane(okBtn));
 		root.setSpacing(10);

 		Scene scene = new Scene(root);
 		Stage stage = new Stage(StageStyle.UTILITY);
 		stage.initModality(Modality.WINDOW_MODAL);
 		stage.setScene(scene);
 		stage.initOwner(view.getScene().getWindow());

 		// Set the Action Listener fo the ok button
 		okBtn.setOnAction(e -> stage.close());

 		stage.setTitle("Error");
 		stage.sizeToScene();
 		stage.showAndWait();
 	}


 }

