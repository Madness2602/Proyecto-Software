package Modelo;

public class Producto {
    private int ID;
    private String nombre;
    private int stock;
    private String marca;
    private double precio;

    public Producto() {
    }

    public Producto(int ID, String nombre, int stock, String marca, double precio) {
        this.ID = ID;
        this.nombre = nombre;
        this.stock = stock;
        this.marca = marca;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Producto{" + "ID=" + ID + ", nombre=" + nombre + ", stock=" + stock + ", marca=" + marca + ", precio=" + precio + '}';
    }
    
}
