

import java.util.Scanner;

/**
 *
 * @author НР
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Вариант 5, РИБО-01-22, Гуровский Игорь Дмитриевич");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите путь к файлу: ");
        String yourPath = scan.nextLine();
        LoaderRunnable lr = new LoaderRunnable(yourPath);
        Thread th = new Thread(lr);
        th.start();
    }
}