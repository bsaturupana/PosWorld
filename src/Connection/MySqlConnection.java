package Connection;

import java.sql.*;

public class MySqlConnection {

    public Connection conn = null;

    public static Connection ConnectDB() {
        String user = "root";
        String pass = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/posworld", user, pass);

            return conn;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
