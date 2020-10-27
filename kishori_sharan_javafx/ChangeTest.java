import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.ObservableValue;
import javafx.beans.InvalidationListener;

public class ChangeTest
{
	public static void main(String[] args) {
		IntegerProperty counter = new SimpleIntegerProperty(100);
		//Adding change Listener to the counter property
		counter.addListener(ChangeTest::invalidated);
		counter.set(102);
		int value = counter.get();
		// System.out.println("Counter value is "+ value);
		counter.set(103);

	}
	public static void invalidated(ObservableValue<? extends Number> prop , 
		Number oldValue , Number newValue)
	{
		System.out.println("counter changed");
		System.out.println("Old Value ="+ oldValue + " New Value =" + newValue);
	}
}
