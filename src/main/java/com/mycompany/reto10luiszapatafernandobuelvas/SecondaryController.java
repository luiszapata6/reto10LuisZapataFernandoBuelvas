package com.mycompany.reto10luiszapatafernandobuelvas;
import com.mycompany.reto10luiszapatafernandobuelvas.modelpackage.Esfera;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.util.Scanner;
import javafx.scene.image.ImageView;

public class SecondaryController {
    
    
    
    Esfera miEsfera = new Esfera();
    
    Scanner input = new Scanner(System.in);

    @FXML
    private TextField inputRadio;
    @FXML
    private Button calcularEsfera;
    @FXML
    private TextArea volumenEsfera;
    @FXML
    private TextArea superficieEsfera;
    @FXML
    private TextArea areaCirculo;
    @FXML
    private TextArea perimetroCirculo;
    @FXML
    private TextArea errorBox;
    @FXML
    private ImageView image1;

    public void switchToPrimary() throws IOException {
        App.setRoot("primary");
        
    }


    @FXML
    private void hacerCalculo(ActionEvent event) {             
        // Obtener dato del TextFieldd
            try
            {
                miEsfera.setR(Double.parseDouble(inputRadio.getText())); 
            }
            catch (NumberFormatException e)
            {
                System.out.println("Ingrese un valor valido en el campo");
            }
        
        // Uso de fórmulas
        
        volumenEsfera.setText(miEsfera.volumen().toString());
        superficieEsfera.setText(miEsfera.superficie().toString());
        areaCirculo.setText(miEsfera.areaCirculo().toString());
        perimetroCirculo.setText(miEsfera.perimetroCirculo().toString());
        
        
    }
}
