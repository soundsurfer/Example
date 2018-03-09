import java.util.Scanner;

public class Main extends Examples{

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Привет! Я подготовил несколько задач для тебя. Но для начала, скажи как тебя зовут с: ");
        String name = scanner.next();
        System.out.println("Очень приятно, " + name + ", и так, начнём тест:");
        Examples.run(args);
        Examples.getMark();
        //TODO Создать оценочный класс который подсчитает количество правильных ответов и выведет их
    }

}
