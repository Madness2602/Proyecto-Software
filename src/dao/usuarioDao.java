package dao;

import Conector.Conexion;
import Modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
//ORIGINAL
public class usuarioDao implements DAO<Usuario>{
    @Override
    public List<Usuario> listarTodos() {
        Connection con = Conexion.creaConexion();
        String sql = "select usuario_usuario, usuario_contra, usuario_privilegio"
                + " FROM usuario";
        List<Usuario> lista = new ArrayList<>();
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Usuario u = new Usuario(rs.getString(1), rs.getString(2), rs.getString(3));
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
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
    
    @Override
    public void insertar(Usuario usuario){
        Connection con = Conexion.creaConexion();
        String sql = "insert into usuario" + 
                "(usuario_usuario, usuario_contra, usuario_privilegio)"
                + "VALUES(?,?,?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, usuario.getUsuario());
            ps.setString(2, usuario.getContra());
            ps.setString(3, usuario.getPrivilegio());
            ps.execute();
            ps.close();
            con.close();
        }catch(SQLException e){
            System.out.println("Error: " + e);
        }
    }
}
