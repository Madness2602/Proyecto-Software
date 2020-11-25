package dao;

import Conector.Conexion;
import Modelo.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class productoDao implements DAO<Producto>{
    @Override
    public List<Producto> listarTodos() {
        Connection con = Conexion.creaConexion();
        String sql = "SELECT producto_id, producto_nombre, producto_stock, producto_marca,producto_precio"
                + " FROM producto";
        List<Producto> lista = new ArrayList<>();
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Producto u = new Producto(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getDouble(5));
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5));
                lista.add(u);
            }
            rs.close();
            ps.close();
            con.close();
        }catch(SQLException e){
            System.out.println("Error: " + e);
        }
        return lista;
    }
    public List<Producto> listarNombre(String nombre) {
        Connection con = Conexion.creaConexion();
        String sql = "select producto_id, producto_nombre, producto_stock, producto_marca,producto_precio"
                + " FROM producto WHERE producto_nombre like ?";
        List<Producto> lista = new ArrayList<>();
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "%" + nombre + "%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Producto m = new Producto(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getDouble(5));
                lista.add(m);
            }
            rs.close();
            ps.close();
            con.close();
        }catch(SQLException e){
            System.out.println("Error: " + e);
        }
        return lista;
    }
    @Override
    public void insertar(Producto prod){
        Connection con = Conexion.creaConexion();
        String sql = "insert into producto" 
        + "(producto_nombre, producto_stock, producto_marca,producto_precio)"
                + "VALUES(?,?,?,?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, prod.getNombre());
            ps.setInt(2, prod.getStock());
            ps.setString(3, prod.getMarca());
            ps.setDouble(4, prod.getPrecio());
            ps.execute();
            ps.close();
            con.close();
        }catch(SQLException e){
            System.out.println("Error: " + e);
        }
    }
    @Override
    public void modificar(Producto prod){
        Connection con = Conexion.creaConexion();
        String sql = "update producto " + 
                "set producto_nombre = ?, producto_stock = ?, producto_marca = ?, producto_precio = ?"
                + " WHERE producto_id = ?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, prod.getNombre());
            ps.setInt(2, prod.getStock());
            ps.setString(3, prod.getMarca());
            ps.setDouble(4, prod.getPrecio());
            ps.setInt(5, prod.getID());
            ps.execute();
            ps.close();
            con.close();
        }catch(SQLException e){
            System.out.println("Error: " + e);
        }
    }
    @Override
    public void borrar(Producto prod){
        Connection con = Conexion.creaConexion();
        String sql = "DELETE FROM producto"
                + " WHERE producto_id = ?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, prod.getID());
            ps.execute();
            ps.close();
            con.close();
        }catch(SQLException e){
            System.out.println("Error: " + e);
        }
    }
}
