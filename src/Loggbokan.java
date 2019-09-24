import java.util.ArrayList;
import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;

public class Loggbokan {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int securance = 1;
        int countarray = 1;
        ArrayList array = new ArrayList<LogEntry>();
        while (securance == 1) {
            printMenu();
            int choice = in.nextInt();
            in.nextLine();
            if (choice == 1) {

                System.out.println(array);

            } else if (choice == 2) {

                String p = in.nextLine();
                array.add(0, new LogEntry(p));

            } /* else if (choice == 3) {



            } else if (choice == 4) {



            } else if (choice == 5) {



            } */ else if (choice == 6) {

                securance = securance - 1;

            }
        }
    }

    private static void printMenu() {
        System.out.println("1. Visa loggboken" + "\n" +
        "2. Skriv in en ny post i loggboken" + "\n" +
        "3. Redigera en gammal post i loggboken" + "\n" +
        "4. Spara loggboken" + "\n" +
        "5. Läs in en loggbok" + "\n" +
        "6. Avsluta" + "\n");
    }
}