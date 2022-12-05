module br.edu.poo {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.edu.poo to javafx.fxml;
    exports br.edu.poo;
}
