import javafx.beans.value.ObservableValue;
import javafx.beans.value.ChangeListener;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class CleanUpListener
{
	public static void main(String[] args)
	{
		IntegerProperty counter = new SimpleIntegerProperty(100);
		// Adding ChangeListener to the counter property
		ChangeListener<Number> listener = CleanUpListener::changed;
		counter.addListener(listener);
		counter.set(101);
		counter.removeListener(listener);
		// Will not fire a change because the ChangeListener has been removed
		counter.set(102);

	}
	public static void changed(ObservableValue<?extends Number>prop , 
		Number oldValue , Number newValue)
	{
			System.out.println("Counter Changed");
			System.out.println("Old = " + oldValue + " New = " + newValue);
	}
}