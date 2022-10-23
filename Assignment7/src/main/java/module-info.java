module com.example.assignment7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.assignment7 to javafx.fxml;
    exports com.example.assignment7;
}