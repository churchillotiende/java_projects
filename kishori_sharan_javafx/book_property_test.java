import javafx.beans.ReadOnlyProperty;
public class BookPropertyTest{
	public static void main(String[] args) {
		Book book = new Book("Harnessing javafx" , 9.99 , "0123456789");
		System.out.println("After creating the book object");

		    printDetails(book.titleProperty()); 
    		printDetails(book.priceProperty());
            printDetails(book.ISBNProperty());                   
	}
	public static void printDetails(ReadOnlyProperty<?> p)
	{
			 String name = p.getName();
			 Object value = p.getValue();
			 Object bean = p.getBean();
			 String beanClassName = (bean == null)?"null":bean.getClass().getSimpleName();
			 String propClassName = p.getClass().getSimpleName();

			 System.out.print(propClassName);   
		     System.out.print("[Name:" + name); 
	         System.out.print(", Bean Class:" + beanClassName);  
		     System.out.println(", Value:" + value + "]"); 
	}
}