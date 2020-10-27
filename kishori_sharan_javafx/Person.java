import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleStringProperty;

public class Person implements Comparable<Person>
{
	private StringProperty firstName = new SimpleStringProperty();
	private StringProperty lastName = new SimpleStringProperty();

	//Empty constructor

	public Person()
	{
		this.setFirstName("Unknown");
		this.setLastName("Unknown");
	}

	//Parametized Constructor

	public Person(String firstName , String lastName)
	{
		this.setFirstName(firstName);
		this.setLastName(lastName);
	}

	//Getter for the firstName

	public final String getFirstName()
	{
		return firstName.get();
	}

	// The setter method for the firstName

	public final void setFirstName(String newFirstName)
	{
		firstName.set(newFirstName);
	}

	// StringProperty

	public  StringProperty firstNameProperty()
	{
		return firstName;
	}

	public final String getLastName()
	{
		return lastName.get();
	}

	// The setter method for the lastName

	public final void setLastName(String newLastName)
	{
		lastName.set(newLastName);
	}

	// StringProperty

	public  StringProperty lastNameProperty()
	{
		return lastName;
	}

	@Override
	public int compareTo(Person p)
	{
		int diff = this.getFirstName().compareTo(p.getFirstName());
		if(diff == 0)
		{
			diff = this.getLastName().compareTo(p.getLastName());
		}
		return diff;
	}
	@Override
	public String toString()
	{
		return getFirstName() + " " + getLastName();
	}
}