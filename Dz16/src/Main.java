import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static Store store = new Store();
    public static Revizor revizor = new Revizor();


    public static void main(String[] args) {

        System.out.println("1 - closeStore\n" + "2 - rebrand");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();
        store.setName(scanner.nextLine());
        if (num == 1){
            store.setName(revizor.closeStore(store.getName()));
            System.out.println("closeStore: " + store.getName());
        } else if (num == 2) {
            store.setName(revizor.rebrand(store.getName()));
            System.out.println("rebrand: " + store.getName());
        }else{
            System.out.println("команда введена неверно");
        }







    }
}