package Modelo;

public class Materia_Prima {
    private int ID;
    private String nombre;
    private double precio;
    private int cantidad;

    public Materia_Prima() {
    }

    public Materia_Prima(int ID, String nombre, double precio, int cantidad) {
        this.ID = ID;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Materia_Prima{" + "ID=" + ID + ", nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + '}';
    }
    
}
