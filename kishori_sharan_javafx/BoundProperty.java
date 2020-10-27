import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.binding.NumberBinding;

public class BoundProperty
{
	public static void main(String[] args) 
	{
		IntegerProperty x = new SimpleIntegerProperty(20);
		IntegerProperty y= new SimpleIntegerProperty(30);
		IntegerProperty z= new SimpleIntegerProperty(50);

		//Creting the bound method()
		z.bind(x.add(y));
		System.out.println("After binding  Bound is : " + z.isBound());
		System.out.println("z = " + z.get());

		// Changing the value of x and y
		x.set(300);
		y.set(200);
		
		System.out.println("After binding  Bound is : " + z.isBound());
		System.out.println("z = " + z.get());

		//unbind z
		z.unbind();
		x.set(100);
		y.set(200);
		System.out.println("After ubinding z Bound is :" + z.isBound());
		System.out.println("z = "+ z.get());

	}
	

}