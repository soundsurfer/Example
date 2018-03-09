import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main{

    public static void main(String [] args) {
       start();
    }
    private static boolean isExist(String name){
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
    private static void start(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Привет! Я подготовил несколько задач для тебя. Но для начала, скажи как тебя зовут с: ");
        String name = scanner.next();
        if (isExist(name)){
            System.out.println("Такое имя уже существует, попробуй ещё раз");
            start();
        }
        else {
            System.out.println("Очень приятно, " + name + ", и так, начнём тест:");
            Examples.run(name);
            Examples.getMark();
        }
    }

}
