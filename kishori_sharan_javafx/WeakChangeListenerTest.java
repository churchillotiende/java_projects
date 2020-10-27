import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.WeakChangeListener;
import javafx.beans.value.ObservableValue;

public class WeakChangeListenerTest
{
	public static IntegerProperty counter = new SimpleIntegerProperty(100);
	public static ChangeListener<Number> listener;
	public static WeakChangeListener<Number> weakListener;

	public static void main(String[] args) {
		int value = counter.get();
		addWeakListener();
		//Will fire a change event
		counter.set(102);
		//Try Garbage collecting
		System.gc();
		//Check if the ChangeListener was garbage collected
		System.out.println("garbage Collected is :" + weakListener.wasGarbageCollected());
		counter.set(200);

		// You dont need a strong reference of the ChangeListener
		listener = null;
		//Try Garbage Collecting
		System.gc();
		// Check if the ChangeListener was garbage collected
		System.out.println("Garbage Collected :" + weakListener.wasGarbageCollected());
		//It wont fire a change if it was garbage collected
		counter.set(500);


	}
	public static void changed(ObservableValue<? extends Number> prop , 
		Number oldValue , Number newValue)
	{
		System.out.println("Counter Changed");
		System.out.println("Old = " + oldValue + " New = " + newValue);
	}
	public static void addWeakListener()
	{
		// Keep a strong reference to the ChangeListener
		listener = WeakChangeListenerTest::changed;

		//Wrap the ChangeListener inside a WeakChangeListener
		weakListener = new WeakChangeListener<>(listener);
		// Add a WeakChangeListener
		counter.addListener(weakListener);
	}
}