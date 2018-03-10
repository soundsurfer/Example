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
    public static boolean isExist(String name){
        try {
            Statement statement = DataBaseManager.getConnection().createStatement();
            ResultSet rs = statement.executeQuery(String.format("select * from marks where name = '%s'",name));
            if (rs.next()){
                return true;
            }
        } catch (SQLException e) {
            // e.printStackTrace();
        }
        return false;
    }
    public static void dataBaseCreate(String name, int mark){
        try {
            Statement statement = DataBaseManager.getConnection().createStatement();
            statement.execute(String.format("INSERT INTO MARKS (name,mark) VALUES ('%s',%d)",name,mark));
        } catch (SQLException e) {
            System.out.println("Can't create statement!!!");
            e.printStackTrace();
        }
    }
}
