package vista;

import javax.swing.*;
import modelo.producto;
import modelo.consultas;
import controlador.controladoruni;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de las clases necesarias
        producto modelo = new producto();
        consultas consultas = new consultas();
        vistaformulario vista = new vistaformulario();

        // Crear una instancia del controlador y pasar las instancias de las clases
        controladoruni controlador = new controladoruni(modelo, consultas, vista);

        // Inicializar la interfaz gráfica y mostrarla
        controlador.iniciar();

        // Configurar la operación de cierre al cerrar la ventana
        vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Hacer visible la ventana
        vista.setVisible(true);
    }
}
