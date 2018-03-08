import java.util.Scanner;

public class Main extends Examples{

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Привет! Я подготовил несколько задач для тебя. Но для начала, скажи как тебя зовут с: ");
        String name = scanner.next();
        System.out.println("Очень приятно, " + name + ", и так, начнём тест:");
        // Вызываем методы из экзампла которые выдают нам 5 примеров
        Examples.main(args);
        // Вызываем так же оценочный класс( возможно ) который подсчитает количество правильных ответов и выведет их
    }

}
