package DZ;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static ArrayList<Dictionary> dict = new ArrayList<>(){{
        add(new Dictionary("Abdication", "отречение; отказ; сложение полномочий"));
        add(new Dictionary("Aperitif", "аперитив"));
        add(new Dictionary("Mead", "– мёд; луг"));
        add(new Dictionary("Zizz", "жужжание"));
        add(new Dictionary("lol", "х"));
    }};

    private static Scanner scan = new Scanner(System.in);
    private static boolean ifThereThisWord(String word) {
        return dict.stream().anyMatch(x -> x.getEng().equals(word));
    }
    public static void addWord() {
        System.out.println("Введите на английском");
        String eng = scan.nextLine();
        System.out.println("Введите на русском");
        String rus = scan.nextLine();
        if (ifThereThisWord(eng)){
        }
        else {
            dict.add(new Dictionary(eng, rus));
        }
        start();
    }

    public static void delByWord(){
        System.out.println("Введите слово");
        String eng = scan.nextLine();
        Iterator<Dictionary> iter = dict.iterator();
        while (iter.hasNext()) {
            Dictionary c = iter.next();
            if (c.getRus().equals(eng)) iter.remove();
        }
        start();
    }

    public static void printAll(){
        System.out.println(dict.toString());start();
    }
    public static void start() {
        System.out.println("Выберите действие: ");
        System.out.println("1: добавить новое слово в список \n" +
                "2: удалить слово из списка \n" +
                "3: вывести весь список \n" +
                "4: выход \n");
        int choose = scan.nextInt();
        scan.nextLine();
        switch (choose) {
            case 1: {
                addWord();
                break;
            }
            case 2: {
                delByWord();
                break;
            }
            case 3: {
                printAll();
                break;
            }
            case 4:
                break;
        }
    }


    public static void main(String[] args) {
        start();
    }
}
