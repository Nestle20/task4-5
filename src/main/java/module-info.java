module com.example.task44 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.task44 to javafx.fxml;
    exports com.example.task44;
}