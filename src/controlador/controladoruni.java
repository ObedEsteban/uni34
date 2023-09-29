package controlador;

import modelo.consultas;
import modelo.producto;
import vista.vistaformulario;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class controladoruni implements ActionListener {

    private final producto modelo;
    private final consultas consultas;
    private final vistaformulario vista;

    public controladoruni(producto modelo, consultas consultas, vistaformulario vista) {
        this.modelo = modelo;
        this.consultas = consultas;
        this.vista = vista;
        this.vista.GUARDARButton.addActionListener(this);
        this.vista.MODIFICARButton.addActionListener(this);
        this.vista.ELIMINARButton.addActionListener(this);
        this.vista.LIMPIARButton.addActionListener(this);
    }

    public void iniciar() {
        vista.setTitle("productos");
        vista.setLocationRelativeTo(null);
        vista.textField1.setVisible(false);
    }


    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vista.GUARDARButton) {
            modelo.setId(Integer.parseInt(vista.textField1.getText()));
            modelo.setNombre(vista.textField2.getText());
            modelo.setApellido(vista.textField3.getText());
            modelo.setFecha(vista.textField4.getText());
            modelo.setSueldo(Double.parseDouble(vista.textField5.getText()));
            modelo.setSexo(vista.textField6.getText());
            modelo.setEdad(Integer.parseInt(vista.textField7.getText()));
            modelo.setComentarios(Integer.parseInt(vista.textField8.getText()));
            if (consultas.registrar(modelo)) {
                JOptionPane.showMessageDialog(null, "Registro Guardado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guardar");
                limpiar();
            }
        }
        if (e.getSource() == vista.MODIFICARButton) {
            modelo.setId(Integer.parseInt(vista.textField1.getText()));
            modelo.setNombre(vista.textField2.getText());
            modelo.setApellido(vista.textField3.getText());
            modelo.setFecha(vista.textField4.getText());
            modelo.setSueldo(Double.parseDouble(vista.textField5.getText()));
            modelo.setSexo(vista.textField6.getText());
            modelo.setEdad(Integer.parseInt(vista.textField7.getText()));
            modelo.setComentarios(Integer.parseInt(vista.textField8.getText()));
            if (consultas.modificar(modelo)) {
                JOptionPane.showMessageDialog(null, "Registro Modificado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Modificar");
                limpiar();
            }
        }

        if (e.getSource() == vista.ELIMINARButton) {
            modelo.setId(Integer.parseInt(vista.textField1.getText()));

            if (consultas.eliminar(modelo)) {
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Eliminar");
                limpiar();
            }
        }
}

    public void limpiar() {
        vista.textField1.setText(null);
        vista.textField2.setText(null);
        vista.textField3.setText(null);
        vista.textField5.setText(null);
        vista.textField6.setText(null);
        vista.textField7.setText(null);
        vista.textField8.setText(null);
    }
}