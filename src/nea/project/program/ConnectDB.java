package nea.project.program;
import java.sql.*;
import javax.swing.JOptionPane;

//This class will be called by other forms to get a connection the the database

public class ConnectDB {
    Connection Connector = null;
    public static Connection ConnectDB() {
    try {
        Class.forName("com.mysql.jdbc.Driver");
        //Connects to this server, with username 'root' and password ''
        Connection Connector = DriverManager.getConnection("jdbc:mysql://localhost:3306/nea database", "root", "");
        return Connector;
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, ex);
        return null;
    }
}
}
