import javafx.util.Callback;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ListChangeTest
{
	public static void main(String[] args)
	{
		Callback<Person  , Observable[]>cb =
		( Person p) ->new Observable[]
		{
			p.firstNameProperty(),
			p.lastNameProperty()
		};

		//Create a list
		ObservableList<Person> list = FXCollections.observableArrayList(cb);
		//Add a change listener
		list.addListener(new PersonListChangeListener());

		// Creating the first person object

		Person p1 = new Person("Li" ,"Na");
		System.out.println("Before adding the first person object");
		list.add(p1);
		System.out.println("After adding + p1" + list);


	}
}