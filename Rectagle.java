import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.Alert;
import java.util.Optional;
	public class Rectagle extends Application {
		@Override
		public void start(Stage primarystage){
			TextInputDialog dialog = new TextInputDialog();
		dialog.setHeaderText("Input the width and height of the Rectangle");
			Optional<String> input = dialog.showAndWait();
			String [] side = input.get().split(" ");
			double width = Double.parseDouble(side[0]);
			double height = Double.parseDouble(side[1]);
			double perimeter = 2*width + 2*height;
			double area = width*height;
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setContentText("The perimeter of the Rectangle is : " + perimeter + "/n the area of the Rectangle" + area);
				alert.showAndWait();
				}
}

