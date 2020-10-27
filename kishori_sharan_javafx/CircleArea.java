import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.binding.DoubleBinding;

public class CircleArea
{
	public static void main(String[] args) {
	DoubleProperty radius = new SimpleDoubleProperty(7.0);
	DoubleProperty area = new SimpleDoubleProperty();
	area.bind(radius.multiply(radius).multiply(Math.PI));
	System.out.println("After binding bound is :" + area.isBound());
	System.out.println("Area is :" + area.get());
	}
}