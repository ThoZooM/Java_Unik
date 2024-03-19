import java.util.*;

public class Dictionary {

    public static HashMap<String, HashSet<String>> setHashMap = new LinkedHashMap<>() {{
        put("Abdication", new HashSet<>(){{
            add("отказ");
            add("отречение");
            add("сложение полномочий");
        }});
        put("Aperitif", new HashSet<>() {{
            add("аперитив");
        }});
        put("Mead", new HashSet<>() {{
            add("мёд");
            add("луг");
        }});
        put("Zizz", new HashSet<>() {{
            add("жужжание");
        }});
    }};

    public static void addNewWord(String string) {
        Scanner scanner = new Scanner(System.in);
        boolean isExist = false;
        for (Map.Entry<String, HashSet<String>> entrySet : setHashMap.entrySet()) {
            if (entrySet.getKey().equalsIgnoreCase(string)) isExist = true;
        }
        if (isExist) {
            System.out.println("Введите перевод - ");
            HashSet<String> stringHashSet = setHashMap.get(string);
            stringHashSet.add(scanner.nextLine());
            setHashMap.put(string, stringHashSet);
        } else {
            System.out.println("Введите новое слово - ");
            String key = scanner.nextLine();
            HashSet<String> stringHashSet = new HashSet<>();
            System.out.println("Введите перевод - ");
            stringHashSet.add(scanner.nextLine());
            setHashMap.put(key, stringHashSet);
        }
        showWords();
    }

    public static void deleteWord(String string) {
        setHashMap.remove(string);
        showWords();
    }

    public static void showWords() {
        for (Map.Entry<String, HashSet<String>> entrySet : setHashMap.entrySet()) {
            System.out.println(entrySet.getKey() + " - " + entrySet.getValue().toString());
        }
    }

    public static void main(String[] args) {
        System.out.println("Гуровский Игорь РИБО-01-22 Вариант 5");
        System.out.println("1 - добавить слово\n2 - удалить слово\n3 - вывести список\n");
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        if (message.equals("1")) {
            System.out.print("Введите слово - ");
            addNewWord(scanner.nextLine());
        } else if (message.equals("2")) {
            System.out.print("Введите слово - ");
            deleteWord(scanner.nextLine());
        }else if (message.equals("3")) {
            showWords();
        }else {
            return;
        }
    }
}