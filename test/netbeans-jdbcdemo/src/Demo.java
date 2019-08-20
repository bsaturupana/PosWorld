//		https://www.youtube.com/watch?v=nW13FmTdkjc

//		https://www.youtube.com/watch?v=BAege1_oi9w

//		https://www.youtube.com/watch?v=VtDBsy_enkE

//		https://www.youtube.com/watch?v=P0opfx23Czw

Look
//		https://www.youtube.com/watch?v=EAWBakeU3CM&t=768s


import java.sql.*;

/**
 *
 * @author www.luv2code.com
 */
public class Demo {

    public static void main(String[] args) throws SQLException {

        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRs = null;

        String user = "root";
        String pass = "root";

        try {
            // 1. Get a connection to database
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/posworld", user, pass);

            // 2. Create a statement
            myStmt = myConn.createStatement();

            // 3. Execute SQL query
            myRs = myStmt.executeQuery("select * from usemasternew");

            // 4. Process the result set
            while (myRs.next()) {
                System.out.println(myRs.getString("um_username") + ", " + myRs.getString("um_password"));
            }

        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {
            if (myRs != null) {
                myRs.close();
            }

            if (myStmt != null) {
                myStmt.close();
            }

            if (myConn != null) {
                myConn.close();
            }
        }
    }    

}
