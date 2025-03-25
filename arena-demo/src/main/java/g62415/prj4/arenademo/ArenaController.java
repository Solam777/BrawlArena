package g62415.prj4.arenademo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ArenaController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}