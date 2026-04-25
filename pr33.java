import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import java.util.Random;
public class TextDisplayFX extends Application {
    @Override
    public void start(Stage stage) {
        VBox vbox = new VBox(15); // spacing = 15
        vbox.setAlignment(Pos.CENTER); // center horizontally
        Random rand = new Random();
        for (int i = 1; i <= 5; i++) {
            Text text = new Text("Text " + i);
            text.setFont(Font.font("Times New Roman",
                    FontWeight.BOLD,
                    FontPosture.ITALIC,
                    22));
            Color color = Color.color(rand.nextDouble(),
                                      rand.nextDouble(),
                                      rand.nextDouble());
            text.setFill(color);
            double opacity = 0.3 + (0.7 * rand.nextDouble());
            text.setOpacity(opacity);
            vbox.getChildren().add(text);
        }
        Scene scene = new Scene(vbox, 400, 300);
        stage.setTitle("JavaFX Text Display");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
