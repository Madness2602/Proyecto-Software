package Conector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public static Connection creaConexion(){
        try{
            String url = "jdbc:mysql://localhost:3306/moason?useLegacyDatetimeCode=false&serverTimezone=America/Lima&useSSL=false";
            String user = "root";
            String password = "Contingencia2532";
            Connection conn = DriverManager.getConnection(url, user, password);
            return conn;
            
        }catch(SQLException e){
            System.out.println("Error: "+e);
        }
        return null;
    }
}
