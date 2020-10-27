import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class InvalidationTest
{
	public static void main(String[] args) {
		IntegerProperty counter = new SimpleIntegerProperty(100);

		//Adding an invalidationTest to the counter property

		counter.addListener(InvalidationTest::invalidated);
		counter.set(101);
		int value = counter.get();
		System.out.println("Counter value is :" + value);
		counter.set(102);
	}
	public static void invalidated(Observable property)
	{
		System.out.println("Counter is Invalid");
	}
}