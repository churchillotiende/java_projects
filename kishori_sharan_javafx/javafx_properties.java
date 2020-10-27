import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.ReadOnlyStringProperty;
import javafx.beans.property.ReadOnlyIntegerProperty;

public Book
{
	private StringProperty title = new SimpleStringProperty(this , "title" , "unknown");
	private DoubleProperty price = new SimpleDoubleProperty(this , "price" , 0.0);
	private ReadOnlyStringWrapper ISBN = new ReadOnlyStringWrapper(this , "ISBN" , "unknown");
	// Empty Constructor
	public Book()
	{

	}
	// Parametized Constructor
	public Book(String title , Double price , String ISBN)
	{
		this.title.set(title);
		this.price.set(price);
		this.ISBN.set(ISBN);
	}
	public final String getTitle()
	{
		return title.get();
	}
	public final void setTitle(String title)
	{
		this.title.set(title);
	}
	public final StringProperty titleProperty()
	{
		return title;
	}
	
	public final Double getPrice()
	{
		return price.get();
	}
	public final void setPrice(Double price)
	{
		this.price.set(price);
	}
	public final DoubleProperty priceProperty()
	{
		return price;
	}
	public final String getISBN()
	{
		return ISBN.get();
	}
		public final ReadOnlyStringProperty ISBNProperty()
	{
		return ISBN.getReadOnlyProperty;
	}
}

