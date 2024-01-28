module edu.gyarb.doublependulum {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.gyarb.doublependulum to javafx.fxml;
    exports edu.gyarb.doublependulum;
}