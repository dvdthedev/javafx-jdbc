module com.example.javafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;



    opens com.example.javafxjdbc to javafx.fxml;
    exports com.example.javafxjdbc;
}