
package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class conexion {
    private String basedatos="databaseName=sweet_cake_bd";
    public  String user;
    public  String password;
    private String url="jdbc:sqlserver://aldana-server.database.windows.net:1433;"+basedatos;
    private Connection con=null;
    
    public Connection getConexion(String usuario, String contraseña){
        this.user=usuario;
        this.password=contraseña;
        try {
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con=DriverManager.getConnection(url, user, password);
            System.out.print("estoy en la clase conexion sin problema......");
            
        } catch (ClassNotFoundException | SQLException ex ) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;
    }
}
