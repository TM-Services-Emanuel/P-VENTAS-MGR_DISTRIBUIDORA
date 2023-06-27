package Componentes;

import java.sql.Connection;
import org.mariadb.jdbc.MariaDbConnection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    
    private final String servidor = "127.0.0.1:3306";
    //private final String servidor = "192.168.0.1:3306";
    private final String bd = "pventasbd";
    private final String bdmovil = "bd_mgr";
    private final String usuario = "root";
    private final String password = "emanuel4744832";
    //private final String password = "";

    public Connection getConexion() {
        MariaDbConnection cn;
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            cn = (MariaDbConnection) DriverManager.getConnection("jdbc:mariadb://"+servidor+"/"+bd+"", ""+usuario+"", ""+password+"");            
        } catch (ClassNotFoundException | SQLException e) {
            Mensajes.error("ERR_ClassConect: "+e.getMessage());
            cn = null;
        }
        return cn;
    }
    
    public Connection getConexionMovil() {
        MariaDbConnection cn;
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            cn = (MariaDbConnection) DriverManager.getConnection("jdbc:mariadb://"+servidor+"/"+bdmovil+"", ""+usuario+"", ""+password+"");            
        } catch (ClassNotFoundException | SQLException e) {
            Mensajes.error("ERR_ClassConectM: "+e.getMessage());
            cn = null;
        }
        return cn;
    }

}
