package modelTest;
// import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
// import java.util.concurrent.atomic.AtomicInteger;
// import javafx.beans.property.ObjectProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleStringProperty;

public class PersonTest
{
	// Instance variables
	private final StringProperty firstName = new SimpleStringProperty(this , 
		"firstName" , null);

	// Constructor
    // Default
	public PersonTest()
	{
		this(null);
	}

	// Parametized

	public PersonTest(String firstName)
	{
		this.firstName.set(firstName);
	}
	public final StringProperty firstNameProperty()
	{
		return firstName;
	}
	public final void setFirstName(String firstName)
	{
		firstNameProperty().set(firstName);
	}
	public final String getFirstName()
	{
		return firstName.get();
	}
	public boolean isValidPerson(PersonTest p , List<String> errorList)
	{
		boolean isValid = true;
		String fn = p.firstName.get();
		if(fn ==null || fn.trim().length() ==0)
		{
			errorList.add("First Name must contain atleast one Character");
			isValid = false;
		}
		return isValid;
	}
	public boolean isValidPerson(List<String> errorList)
	{
	  	return isValidPerson(this , errorList);
	}
	public boolean save(List<String> errorList)
	{
		boolean isSaved = true;
		if(isValidPerson(errorList))
		{
			System.out.println("Saved "+ toString());
			isSaved = true;
		}
		return isSaved;
	}
	@Override
	public String toString()
	{
		return "[firstName = " + firstName.get() + "]";
	}

}
