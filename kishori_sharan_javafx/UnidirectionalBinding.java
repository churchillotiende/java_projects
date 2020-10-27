import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.binding.NumberBinding;

public class UnidirectionalBinding
{
	public static void main(String[] args) {
		IntegerProperty x = new SimpleIntegerProperty(10);
		IntegerProperty y = new SimpleIntegerProperty(20);
		IntegerProperty b = new SimpleIntegerProperty(30);
		IntegerProperty c = new SimpleIntegerProperty(40);
		IntegerProperty z = new SimpleIntegerProperty(50);
		//Binding c
		z.bind(x.add(y));
		System.out.println("After binding z Bound is " + z.isBound());
		System.out.println("z = " + z.get());
		z.bind(b.add(c));
		System.out.println("After binding z Bound is " + z.isBound());
		System.out.println("z = " + z.get());
	}
}