import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class PharmacyManagementSystem extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create labels and text fields for medication details
        Label nameLabel = new Label("Medication Name:");
        TextField nameField = new TextField();

        Label quantityLabel = new Label("Quantity:");
        TextField quantityField = new TextField();

        Label priceLabel = new Label("Price:");
        TextField priceField = new TextField();

        // Create buttons for actions
        Button addButton = new Button("Add Medication");
        Button searchButton = new Button("Search Medication");
        Button updateButton = new Button("Update Medication");
        Button deleteButton = new Button("Delete Medication");

        // Create a GridPane layout
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(8);
        gridPane.setHgap(10);

        // Add components to the grid
        gridPane.add(nameLabel, 0, 0);
        gridPane.add(nameField, 1, 0);
        gridPane.add(quantityLabel, 0, 1);
        gridPane.add(quantityField, 1, 1);
        gridPane.add(priceLabel, 0, 2);
        gridPane.add(priceField, 1, 2);
        gridPane.add(addButton, 0, 3);
        gridPane.add(searchButton, 1, 3);
        gridPane.add(updateButton, 0, 4);
        gridPane.add(deleteButton, 1, 4);

        // Set the scene and stage
        Scene scene = new Scene(gridPane, 400, 300);
        primaryStage.setTitle("Pharmacy Management System");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}