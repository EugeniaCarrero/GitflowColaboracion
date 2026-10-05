package ejemplo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controlador {

    @FXML
    private TextField txtNombre;

    @FXML
    private Label lblResultado;

    @FXML
    private void saludar() {
        String nombre = txtNombre.getText();
        lblResultado.setText("Hola, " + nombre);
    }
}