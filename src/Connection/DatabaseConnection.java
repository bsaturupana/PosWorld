package Connection;

import java.sql.*;

public class DatabaseConnection {

    public Connection myConn = null;

    String user = "root";
    String pass = "";

    public Connection dbCon() throws SQLException {
        try {
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/posworld", user, pass);
        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {

            if (myConn != null) {
                myConn.close();
            }
        }
        
        return myConn;
    }
}
