package g62415.prj4.arenademo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ArenaController {


    public ArenaController() {
        System.out.println("ArenaController created!");
    }

    @FXML
    private void initialize() {
        System.out.println("ArenaController initialized!");
    }


    public void ClickedBtn() {
        System.out.println("clicked!");
    }
}