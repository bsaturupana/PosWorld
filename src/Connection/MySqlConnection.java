package Connection;
import java.sql.*;
import javax.swing.*;

public class MySqlConnection {
    Connection conn = null;
    
    public static Connection ConnectDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/posworld","root","root");
//            JOptionPane.showMessageDialog(null, "Connectioned to Database.");
            
            return conn;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
