package Modelo;

public class Cliente {
    private int id;
    private String nombre;
    private String dni;
    private String telf;
    private String direccion;
    private String email;

    public Cliente() {
    }

    public Cliente(int id, String nombre, String dni, String telf, String direccion, String email) {
        this.id = id;
        this.nombre = nombre;
        this.dni = dni;
        this.telf = telf;
        this.direccion = direccion;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelf() {
        return telf;
    }

    public void setTelf(String telf) {
        this.telf = telf;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", dni=" + dni + ", telf=" + telf + ", direccion=" + direccion + ", email=" + email + '}';
    }
    
}
