/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package datepicker_bryanayala;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author ROCIO
 */
public class Datepicker_BryanAyala extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // Estableciendo los DatePicker y ColorPicker
        Label fecha = new Label("Bienvenido, seleccione una fecha:");
        DatePicker Selectorfecha = new DatePicker();

        Label color = new Label("Seleccione un color que desee:");
        ColorPicker Slectorcolor = new ColorPicker();
        //Creando el botón de confirmacion
        Button btnconfirmacion = new Button("Seleccione si desea confirmar su elección");

        Label resultado = new Label();

        // Estableciendo el VBOx
        VBox vbox = new VBox(20); 
        vbox.setPadding(new Insets(15)); 

        vbox.getChildren().addAll(fecha, Selectorfecha, color, Slectorcolor, btnconfirmacion, resultado);

        btnconfirmacion.setOnAction(e -> {
            String selectedDate = Selectorfecha.getValue() != null ? Selectorfecha.getValue().toString() : "SIn seleccion";
            String selectedColor = Slectorcolor.getValue() != null ? Slectorcolor.getValue().toString() : "Sin seleccion";
            resultado.setText("La fecha seleccionada fue: " + selectedDate + "     Color seleccionado: " + selectedColor);
            System.out.println("La fecha seleccionada fue: " + selectedDate);
            System.out.println("El color seleccionado fue: " + selectedColor);
        });

        Scene scene = new Scene(vbox, 450, 350);
        
        primaryStage.setTitle("ColorPicker y DatePicker -  Bryan Ayala");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
