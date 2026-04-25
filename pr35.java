import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.geometry.Pos;

public class BarChartFX extends Application {

    @Override
    public void start(Stage stage) {

        int scale = 5;

        VBox projectBox = createBar("Projects — 20%", 20 * scale, Color.RED);
        VBox quizBox = createBar("Quizzes — 10%", 10 * scale, Color.BLUE);
        VBox midtermBox = createBar("Midterm Exams — 30%", 30 * scale, Color.GREEN);
        VBox finalBox = createBar("Final Exam — 40%", 40 * scale, Color.ORANGE);

        HBox root = new HBox(20, projectBox, quizBox, midtermBox, finalBox);
        root.setAlignment(Pos.BOTTOM_CENTER);

        Scene scene = new Scene(root, 400, 300);
        stage.setTitle("Grade Distribution Bar Chart");
        stage.setScene(scene);
        stage.show();
    }

    private VBox createBar(String labelText, int height, Color color) {
        Rectangle rect = new Rectangle(50, height);
        rect.setFill(color);

        Text label = new Text(labelText);

        VBox box = new VBox(10, rect, label);
        box.setAlignment(Pos.BOTTOM_CENTER);

        return box;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
