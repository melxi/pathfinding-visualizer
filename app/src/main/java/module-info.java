module com.melxi.app {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.melxi.app to javafx.fxml;
    exports com.melxi.app;
}