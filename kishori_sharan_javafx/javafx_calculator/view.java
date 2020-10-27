package view;
import controller.*;
import javax.swing.JFrame;
import model.*;
// import java.net.*;
// import java.util.*;
// import javafx.beans.property.*;
import javafx.geometry.*;
import javafx.scene.shape.Rectangle;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
// import javafx.scene.image.*;
import javafx.scene.text.Text;
import javafx.scene.control.Button;

public class view{
	
	private final model Model;

	public view(model Model)
	{
		this.Model = Model;
	}

	// <fx:controller = "" xmlns:fx = "http://javafx.com/fxml">
	// <VBox spacing = "10" , prefWidth = "300" , prefHeight = "300">

	// 	<StackPane alignment ="CENTER">

	// 		<Rectangle fill = "TRANSPARENT" height = "50" width = "300" stroke = "GRAY">
	// 			<Text fx:id = "output"/>
	// 		</Rectangle>
	// 	</StackPane>

	// 	<HBox spacing  ="10">
	// 	<Button text = "7" prefWidth = "50" onAction = "#processNumpad">
	// 	<Button text = "8" prefWidth = "50" onAction = "#processNumpad">
	// 	<Button text = "9" prefWidth = "50" onAction = "#processNumpad">
	// 	</HBox>
		
	// </VBox>
}
