module JavaFXEjemplo {
    requires javafx.controls;
    requires javafx.fxml;

    opens ejemplo to javafx.fxml;
    exports ejemplo;
}