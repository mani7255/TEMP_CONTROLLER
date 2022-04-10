package sample;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import java.net.URL;
import java.util.ResourceBundle;
public class Controller implements Initializable {
    public TextField temperature;
    public Label disptemp;
    public Rectangle coolindi;
    public Rectangle normindi;
    public Rectangle hotindi;
    public Label disptemp2;
    public Label disptemp3;
    public Slider slide;
    public void initialize(URL location, ResourceBundle resources) {
    }
    public void identifyslidetemp(MouseEvent mouseEvent) {
        String x = "The Temperature is cool";
        String x1 = "The Temperature is normal";
        String x2 = "The Temperature is hot";
        double temp = 0;
        temp = slide.getValue();
        if (temp >= 0 && temp <= 20) {
            disptemp.textProperty().set(x);
            disptemp.setTextFill(Color.rgb(0, 200, 0));
            coolindi.setFill(Color.rgb(0, 200, 0));
            hotindi.setFill(Color.rgb(255, 255, 255));
            normindi.setFill(Color.rgb(255, 255, 255));
            disptemp2.textProperty().set("");
            disptemp3.textProperty().set("");
        } else if (temp > 20 && temp <= 50) {
            disptemp2.textProperty().set(x1);
            disptemp2.setTextFill(Color.rgb(100, 0, 155));
            normindi.setFill(Color.rgb(100, 0, 155));
            coolindi.setFill(Color.rgb(255, 255, 255));
            hotindi.setFill(Color.rgb(255, 255, 255));
            disptemp.textProperty().set("");
            disptemp3.textProperty().set("");
        } else if (temp > 50) {
            disptemp3.textProperty().set(x2);
            disptemp3.setTextFill(Color.rgb(255, 0, 0));
            hotindi.setFill(Color.rgb(255, 0, 0));
            coolindi.setFill(Color.rgb(255, 255, 255));
            normindi.setFill(Color.rgb(255, 255, 255));
            disptemp.textProperty().set("");
            disptemp2.textProperty().set("");
        }
    }
}
