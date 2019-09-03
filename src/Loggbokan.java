import java.util.Scanner;

public class Loggbokan {
    public static void main(String[] args) {

        printMenu();
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        if (choice == 6) {

            System.exit(0);

        }

    }

    private static void printMenu() {
        System.out.println("1. Visa loggboken" + "\n" +
        "2. Skriv in en ny post i loggboken" + "\n" +
        "3. Redigera en gammal post i loggboken" + "\n" +
        "4. Spara loggboken" + "\n" +
        "5. Läs in en loggbok" + "\n" +
        "6. Avsluta");
    }
}