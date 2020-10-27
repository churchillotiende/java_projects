package controller;
import view.*;
import model.*;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;

public class controller
{

	private Text output;
	private final model Model;
	private final view View;
	
	public controller(model Model , view View)
	{
		this.Model = Model;
		this.View = View;
	}
	private void processNumpad(ActionEvent event)
	{

	}
	private void processOperator(ActionEvent event)
	{

	}
	
}
