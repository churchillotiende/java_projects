package viewTest;
import modelTest.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;

public class PersonViewTest extends GridPane
{
	private final PersonTest person;

	// Label
	Label firstNameLbl = new Label("FirstName");
	// TextField
	TextField firstNameFld = new TextField();
	// Buttons
	Button saveBtn = new Button("Save");
	Button closeBtn = new Button("Close");

	public PersonViewTest(PersonTest person)
	{
		this.person = person;
		bindFieldsToPerson();
	}
	public void bindFieldsToPerson()
	{
		firstNameFld.textProperty().bindBidirectional(person.firstNameProperty());
	}
}