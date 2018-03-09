import java.sql.*;

public class DataBaseManager {
    private static String URL = "jdbc:h2:tcp://localhost/~/test";
    private static Connection connection = null;
    private static String SqlQuery = "SELECT * FROM marks";


    public static Connection getConnection(){
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found , try again , later ...");
            //e.printStackTrace();
        }

        try {
            connection = DriverManager.getConnection(URL, "sa", "");
        } catch (SQLException e) {
            System.out.println("Connection failed");
            //e.printStackTrace();
        }
        return connection;
    }
}
