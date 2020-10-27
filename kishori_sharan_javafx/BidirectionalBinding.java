import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class BidirectionalBinding
{
	public static void main(String[] args) {
		IntegerProperty a = new SimpleIntegerProperty(10);
		IntegerProperty b = new SimpleIntegerProperty(11);
		IntegerProperty c = new SimpleIntegerProperty(12);
		IntegerProperty d = new SimpleIntegerProperty(13);
		IntegerProperty e = new SimpleIntegerProperty(14);

		//before binding
		System.out.println("a = " + a.get() + " b = " + b.get() 
			+ " c = " + c.get() + " d = " + d.get() +
			" e = " + e.get());
		//Binding a to b
		a.bindBidirectional(b);
		System.out.println("After the first binding");
		System.out.println("a = " + a.get() + " b = " + b.get() 
			+ " c = " 			+ c.get() + " d = " + d.get() +
			" e = " + e.get());
		a.unbindBidirectional(b);
		a.set(100);
		System.out.println("After setting the value of a to 100");
		System.out.println("a = " + a.get() + " b = " + b.get() 
			+ " c = " 			+ c.get() + " d = " + d.get() +
			" e = " + e.get());
	}
}