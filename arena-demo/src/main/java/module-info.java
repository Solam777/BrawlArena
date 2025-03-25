module g62415.prj4.BrawlArena {
    requires javafx.controls;
    requires javafx.fxml;


    opens g62415.prj4.BrawlArena to javafx.fxml;
    exports g62415.prj4.BrawlArena;
    exports g62415.prj4.BrawlArena.Controller;
    opens g62415.prj4.BrawlArena.Controller to javafx.fxml;
}