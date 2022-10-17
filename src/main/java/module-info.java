module com.example.widget {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.datatransfer;
    requires java.desktop;


    opens com.example.widget to javafx.fxml;
    exports com.example.widget;
}