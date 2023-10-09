import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your language:");
        String lang = scanner.nextLine();

        switch (lang) {
            case "TR" ->
                System.out.println("Merhaba Dünya!");
            case "DE" ->
                System.out.println("Hallo Welt!");
            case "FR" ->
                System.out.println("Bonjour le monde!");
            default ->
                System.out.println("Hello World!");
        }
    }
}
