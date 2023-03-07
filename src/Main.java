import Modelo.Persona;
import Vista.Registro;

public class Main {
    public static void main(String[] args) {

        Registro vista = new Registro();
        Modelo.Cliente miCliente = new Modelo.Cliente();
        Modelo.Persona miPersona = new Modelo.Persona();

        Controle.controlador miControlador = new Controle.controlador(miCliente, miPersona);
    }
}