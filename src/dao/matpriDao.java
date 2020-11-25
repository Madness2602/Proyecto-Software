package dao;

import Conector.Conexion;
import Modelo.Materia_Prima;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class matpriDao implements DAO<Materia_Prima>{
    @Override
    public List<Materia_Prima> listarTodos() {
        Connection con = Conexion.creaConexion();
        String sql = "select matpri_id, matpri_nom, matpri_costo, matpri_cant"
                + " FROM materia_prima";
        List<Materia_Prima> lista = new ArrayList<>();
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Materia_Prima u = new Materia_Prima(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4));
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
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
    public List<Materia_Prima> listarNombre(String nombre) {
        Connection con = Conexion.creaConexion();
        String sql = "select matpri_id, matpri_nom, matpri_costo, matpri_cant"
                + " FROM materia_prima WHERE matpri_nom like ?";
        List<Materia_Prima> lista = new ArrayList<>();
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "%" + nombre + "%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Materia_Prima m = new Materia_Prima(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4));
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
    public void insertar(Materia_Prima matpri){
        Connection con = Conexion.creaConexion();
        String sql = "insert into materia_prima" 
        + "(matpri_nom, matpri_costo,matpri_cant)"
                + "VALUES(?,?,?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, matpri.getNombre());
            ps.setDouble(2, matpri.getPrecio());
            ps.setInt(3, matpri.getCantidad());
            ps.execute();
            ps.close();
            con.close();
        }catch(SQLException e){
            System.out.println("Error: " + e);
        }
    }
    @Override
    public void modificar(Materia_Prima matpri){
        Connection con = Conexion.creaConexion();
        String sql = "update materia_prima " + 
                "set matpri_nom = ?, matpri_costo = ?, matpri_cant = ?"
                + " WHERE matpri_id = ?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, matpri.getNombre());
            ps.setDouble(2, matpri.getPrecio());
            ps.setInt(3, matpri.getCantidad());
            ps.setInt(4, matpri.getID());
            ps.execute();
            ps.close();
            con.close();
        }catch(SQLException e){
            System.out.println("Error: " + e);
        }
    }
    @Override
    public void borrar(Materia_Prima matpri){
        Connection con = Conexion.creaConexion();
        String sql = "delete from materia_prima"
                + " WHERE matpri_id = ?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, matpri.getID());
            ps.execute();
            ps.close();
            con.close();
        }catch(SQLException e){
            System.out.println("Error: " + e);
        }
    }
}
