import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
public class ObservableListTest
{
	public static void main(String[] args) {
		ObservableList<String> list = 
			FXCollections.observableArrayList("one" , "two");
		System.out.println("After creating the list" + list);

		// After adding elements to the list
		list.addAll("three" , "four");
		System.out.println("After adding elements" + list);

		// Removing the elements at pos 1 & 3
		list.remove(1 , 3);

		System.out.println("After removing  two and four" + list);

		list.retainAll("one");
		System.out.println("After retaining one " + list);

		// Creating another ObservableArrayList
		ObservableList<String> list1 =
			 FXCollections.<String>observableArrayList("1" , "2" , "3");
		System.out.println("List 2 is :" + list1);

		// Replacing list with list1 values
		list.setAll(list1);
		System.out.println("List is " + list);


	}
}