import java.util.Scanner;

public class Examples {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] a = {2, 3, 4, 5, 6, 7, 8, 9};
        int[] b = {2, 3, 4, 5, 6, 7, 8, 9};
        int x = 0, y = 0, z = 0, l = 1;
        for (int i = 0; i < 5; i++) {
            x = (int) (Math.random() * a.length);
            y = (int) (Math.random() * b.length);
            z = a[x] * a[y];

            switch (l++) {
                case 1:
                    System.out.println("Задание номер 1: " + a[x] + " x " + a[y] + " = ");
                    getNumb();
                    //использовать дальнейший код как проверку (возможно), имеются проблемы с проверкой z
                    /*if (getNumb() == z){
                        System.out.println("Верно!");
                    }
                    else
                        System.out.println("Не верно!");
                    */
                    break;
                case 2:
                    System.out.println("Задание номер 2: " + a[x] + " x " + a[y] + " = ");
                    getNumb();
                    break;
                case 3:
                    System.out.println("Задание номер 3: " + a[x] + " x " + a[y] + " = ");
                    getNumb();
                    break;
                case 4:
                    System.out.println("Задание номер 4: " + a[x] + " x " + a[y] + " = ");
                    getNumb();
                    break;
                case 5:
                    System.out.println("Задание номер 5: " + a[x] + " x " + a[y] + " = ");
                    getNumb();
                    break;
            }
        }
    }

    private static int getNumb() {
        System.out.println("Ответ:");
        int numb;
        if (scanner.hasNext()) {
            numb = scanner.nextInt();
        } else {
            System.out.println("Возможно ты ввёл не целове число, попробуй ещё раз..");
            scanner.next();
            numb = getNumb();
        }
        return numb;


    }
}
