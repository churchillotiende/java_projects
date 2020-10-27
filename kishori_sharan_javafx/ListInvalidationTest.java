import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ListInvalidationTest
{
	public static void main(String[] args) {
		ObservableList<String> list = FXCollections.<String>observableArrayList("one" , 
			"two");
		list.addListener(ListInvalidationTest::validated);
		System.out.println();
		list.addAll("three");
		System.out.println("After adding three" +list);
	}
	public static void validated(Observable list)
	{
		System.out.println("List is invalid");
	}
}