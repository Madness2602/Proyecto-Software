package dao;

import Conector.Conexion;
import Modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class clienteDao implements DAO<Cliente>{
    @Override
    public List<Cliente> listarTodos() {
        Connection con = Conexion.creaConexion();
        String sql = "select cliente_id, cliente_nombre, cliente_DNI, cliente_telf,cliente_direccion,cliente_email"
                + " FROM cliente";
        List<Cliente> lista = new ArrayList<>();
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Cliente u = new Cliente(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6));
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
    public List<Cliente> listarNombre(String nombre) {
        Connection con = Conexion.creaConexion();
        String sql = "SELECT cliente_id, cliente_nombre, cliente_DNI, cliente_telf,cliente_direccion,cliente_email"
                + " FROM cliente WHERE cliente_nombre like ?";
        List<Cliente> lista = new ArrayList<>();
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "%" + nombre + "%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Cliente m = new Cliente(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
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
    public void insertar(Cliente cli){
        Connection con = Conexion.creaConexion();
        String sql = "INSERT INTO cliente" 
        + "(cliente_nombre, cliente_DNI, cliente_telf,cliente_direccion,cliente_email)"
                + "VALUES(?,?,?,?,?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cli.getNombre());
            ps.setString(2, cli.getDni());
            ps.setString(3, cli.getTelf());
            ps.setString(4, cli.getDireccion());
            ps.setString(5, cli.getEmail());
            ps.execute();
            ps.close();
            con.close();
        }catch(SQLException e){
            System.out.println("Error: " + e);
        }
    }
    @Override
    public void modificar(Cliente cli){
        Connection con = Conexion.creaConexion();
        String sql = "UPDATE cliente " + 
                "SET cliente_nombre = ?, cliente_DNI = ?, cliente_telf = ?, cliente_direccion = ?, cliente_email = ?"
                + " WHERE cliente_id = ?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cli.getNombre());
            ps.setString(2, cli.getDni());
            ps.setString(3, cli.getTelf());
            ps.setString(4, cli.getDireccion());
            ps.setString(5, cli.getEmail());
            ps.setInt(6, cli.getId());
            ps.execute();
            ps.close();
            con.close();
        }catch(SQLException e){
            System.out.println("Error: " + e);
        }
    }
    @Override
    public void borrar(Cliente cli){
        Connection con = Conexion.creaConexion();
        String sql = "DELETE from cliente"
                + " WHERE cliente_id = ?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cli.getId());
            ps.execute();
            ps.close();
            con.close();
        }catch(SQLException e){
            System.out.println("Error: " + e);
        }
    }
}
