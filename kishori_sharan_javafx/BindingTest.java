import javafx.beans.binding.NumberBinding;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class BindingTest
{
	public static void main(String[] args) {
		IntegerProperty x = new SimpleIntegerProperty(100);
		IntegerProperty y = new SimpleIntegerProperty(200);
		//Creating the binding sum
		NumberBinding sum = x.add(y);
		//Testing whether the sum is valid
		System.out.println("Sum.isValid() " + sum.isValid());
		//Requesting the value of sum

		int value = sum.intValue();
		//Check whether the binding isValid()
		System.out.println("Sum.isValid() " + sum.isValid());
		System.out.println("Sum = :" + sum);
	}

}