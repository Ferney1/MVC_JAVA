package Controle;

import Modelo.Cliente;
import Modelo.Persona;
import Vista.Registro;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class controlador  implements ActionListener {
 Cliente micliete;
    private JButton iniciarButton;
 Registro regitro;
 public controlador(Cliente miCliente, Persona miPersona){
     micliete = new Cliente();
     regitro = new Registro();
     iniciarButton.addActionListener(this);
 }

    public  void Guardar (String nombre, String apellido, String direccion, String email, String fecha){
        JOptionPane.showMessageDialog(null, "Nombre " + nombre + "Apellido :" + apellido + " direccion :" + direccion + " email :" + fecha + " fecha");
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null,"Se guardo la informacion ");
    }
}
