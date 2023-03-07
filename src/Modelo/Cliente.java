package Modelo;

public class Cliente extends Persona{

    private String fecha;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String direccion, String email, String fecha) {
        super(nombre, apellido, direccion, email);
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
