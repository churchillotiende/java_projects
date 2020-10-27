package view;
import model.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class PersonView extends GridPane
{
	 private final Person person;

	// Labels      
      Label personIdLbl =    new Label("Person Id:");
      Label fNameLbl   =     new Label("First Name:");
      Label lNameLbl   =     new Label("Last Name:");    
      Label bDateLbl   =     new Label("Birth Date:");  
      Label ageCategoryLbl = new Label("Age Category:");

    // Fields
      TextField personIdTfd = new TextField();
      TextField fNameTfd = new TextField();
      TextField lNameTfd = new TextField();
      TextField bDateTfd = new TextField();
      TextField ageCategoryTfd = new TextField();

    // Buttons
      Button saveBtn  = new Button("Save");
      Button closeBtn = new Button("Close");
    // Date format
      String dateFormat;

      public PersonView(Person person , String dateFormat)
      {
      	this.person = person;
      	this.dateFormat = dateFormat;
      	layoutForm();
      	initFieldData();
      	bindFieldsToperson();
      }

      private void initFieldData()
      {
      	// Id and names are populated using bindings
      	// Populate birth date and age category
      	syncBirthDate();
      }

      public void bindFieldsToperson()
      {
      	personIdTfd.textProperty().bind( person.personIdProperty().asString());
      	fNameTfd.textProperty().bindBidirectional(person.firstNameProperty());
      	lNameTfd.textProperty().bindBidirectional(person.lastNameProperty());
      }

      private void layoutForm(){
	       this.setHgap(5);
	       this.setVgap(5);

	       this.add(personIdLbl, 1, 1);  
	       this.add(fNameLbl, 1, 2);     
	       this.add(lNameLbl, 1, 3);   
	       this.add(bDateLbl, 1, 4);
	       this.add(ageCategoryLbl, 1, 5);

           this.add(personIdTfd, 2, 1);    
           this.add(fNameTfd, 2, 2);  
           this.add(lNameTfd, 2, 3);   
           this.add(bDateTfd, 2, 4);
           this.add(ageCategoryTfd, 2, 5);

           // Add buttons and make them the same width

           VBox buttonBox = new VBox(saveBtn , closeBtn);
           saveBtn.setMaxWidth(Double.MAX_VALUE);
           closeBtn.setMaxWidth(Double.MAX_VALUE);

           this.add(buttonBox ,3 ,1,1,5);

           // Disable the personId field

           personIdTfd.setDisable(true);
           ageCategoryTfd.setDisable(true);

           // Set the prompt text for the birth date field
           bDateTfd.setPromptText(dateFormat.toLowerCase());

 
      }

      public void syncAgeCategory()
      {
      	ageCategoryTfd.setText(person.getAgeCategory().toString());
      }

      public void syncBirthDate(){
      	LocalDate bDate = person.getBirthDate();
      	if(bDate != null)
      	{
      		bDateTfd.setText(bDate.format(DateTimeFormatter.ofPattern(dateFormat)));
      	}

      	syncAgeCategory();
      }
}

