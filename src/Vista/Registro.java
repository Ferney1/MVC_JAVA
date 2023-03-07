package Vista;

import javax.swing.*;

public class Registro  extends javax.swing.JFrame{

    private JPanel Main;
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JTextField txtDireccion;
    private JTextField txtEmail;
    private JButton iniciarButton;
    private JButton cancelarButton;


    public JPanel getFrame() {
        return Main;
    }

    public JTextField getNombreField() {
        return txtNombre;
    }

    public JTextField getTxtApellido() {
        return txtApellido;
    }

    public JTextField getTxtDireccion() {
        return txtDireccion;
    }

    public JTextField getTxtEmail() {
        return txtEmail;
    }

    public JButton getIniciarButton() {
        return iniciarButton;
    }




}
