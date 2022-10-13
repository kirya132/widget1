module com.example.widget {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.widget to javafx.fxml;
    exports com.example.widget;
}