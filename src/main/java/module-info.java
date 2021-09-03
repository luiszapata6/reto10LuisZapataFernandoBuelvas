module com.mycompany.reto10luiszapatafernandobuelvas {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.reto10luiszapatafernandobuelvas to javafx.fxml;
    exports com.mycompany.reto10luiszapatafernandobuelvas;
}
