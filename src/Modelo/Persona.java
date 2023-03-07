package Modelo;

public class Persona {
    private String Nombre;
    private String Apellido;
    private String Direccion;
    private String Email;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String direccion, String email) {
        Nombre = nombre;
        Apellido = apellido;
        Direccion = direccion;
        Email = email;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
