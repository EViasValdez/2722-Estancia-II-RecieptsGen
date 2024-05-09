package recieptsgen;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */
public class Conectar {
    Connection conect = null;
    
    public Connection Conexion()
    {
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            conect = DriverManager.getConnection("jdbc:mysql://localhost/ejemplouniversidad", "root", "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e);
        }
        return conect;
    }
}