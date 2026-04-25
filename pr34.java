import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class RegistrationFormFX extends Application {

    @Override
    public void start(Stage stage) {

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setHgap(10);
        grid.setVgap(10);

        Label lblRoll = new Label("Roll No:");
        TextField tfRoll = new TextField();

        Label lblName = new Label("Name:");
        TextField tfName = new TextField();

        Label lblAge = new Label("Age:");
        TextField tfAge = new TextField();

        Label lblEmail = new Label("Email:");
        TextField tfEmail = new TextField();

        Button btnSubmit = new Button("Submit");

        grid.add(lblRoll, 0, 0);
        grid.add(tfRoll, 1, 0);
        grid.add(lblName, 0, 1);
        grid.add(tfName, 1, 1);
        grid.add(lblAge, 0, 2);
        grid.add(tfAge, 1, 2);
        grid.add(lblEmail, 0, 3);
        grid.add(tfEmail, 1, 3);
        grid.add(btnSubmit, 1, 4);

        btnSubmit.setOnAction(e -> {
            try {
                String rollText = tfRoll.getText();
                String name = tfName.getText();
                String ageText = tfAge.getText();
                String email = tfEmail.getText();

                int rollNo = Integer.parseInt(rollText);
                int age = Integer.parseInt(ageText);

                if (!email.contains("@") || !email.contains(".")) {
                    throw new Exception("Invalid email format.");
                }

                if (name.isEmpty()) {
                    throw new Exception("Name cannot be empty.");
                }

                FileChooser fileChooser = new FileChooser();
                fileChooser.setTitle("Save Data");
                fileChooser.getExtensionFilters().add(
                        new FileChooser.ExtensionFilter("Text Files", "*.txt"));

                File file = fileChooser.showSaveDialog(stage);

                if (file != null) {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
                    writer.write("RollNo: " + rollNo + ", Name: " + name +
                            ", Age: " + age + ", Email: " + email);
                    writer.newLine();
                    writer.close();
                }

                Alert success = new Alert(Alert.AlertType.INFORMATION);
                success.setTitle("Success");
                success.setHeaderText("Registration Successful");
                success.setContentText(
                        "RollNo: " + rollNo +
                        "\nName: " + name +
                        "\nAge: " + age +
                        "\nEmail: " + email
                );
                success.showAndWait();

            } catch (NumberFormatException ex) {
                showError("Roll No and Age must be integers.");
            } catch (Exception ex) {
                showError(ex.getMessage());
            }
        });

        Scene scene = new Scene(grid, 350, 250);
        stage.setTitle("Registration Form");
        stage.setScene(scene);
        stage.show();
    }

    private void showError(String msg) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText("Validation Failed");
        alert.setContentText(msg);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
