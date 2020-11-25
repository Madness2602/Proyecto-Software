package Modelo;

import java.util.Arrays;

public class Boleta {
    private int id;
    private String tipo;
    private double total;
    private Cliente cliente;
    private Producto producto[];

    public Boleta() {
    }

    public Boleta(int id, String tipo, double total, Cliente cliente, Producto[] producto) {
        this.id = id;
        this.tipo = tipo;
        this.total = total;
        this.cliente = cliente;
        this.producto = producto;
    }

    public Producto[] getProducto() {
        return producto;
    }

    public void setProducto(Producto[] producto) {
        this.producto = producto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Boleta{" + "id=" + id + ", tipo=" + tipo + ", total=" + total + ", cliente=" + cliente + ", producto=" + Arrays.toString(producto) + '}';
    }

    
}
