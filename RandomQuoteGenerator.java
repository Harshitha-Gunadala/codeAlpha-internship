import java.util.Random;
import java.util.Scanner;

public class RandomQuoteGenerator {

    public static void main(String[] args) {

        String[] quotes = {
                "Success is not final, failure is not fatal.",
                "Believe you can and you're halfway there.",
                "Dream big and dare to fail.",
                "Push yourself, because no one else will do it for you.",
                "Do something today that your future self will thank you for."
        };

        String[] authors = {
                "Winston Churchill",
                "Theodore Roosevelt",
                "Norman Vaughan",
                "Unknown",
                "Sean Patrick Flanery"
        };

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        char choice;

        do {
            int index = random.nextInt(quotes.length);

            System.out.println("\n----------------------------");
            System.out.println("Quote: " + quotes[index]);
            System.out.println("Author: " + authors[index]);
            System.out.println("----------------------------");

            System.out.print("\nDo you want another quote? (y/n): ");
            choice = scanner.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("\nThank you for using Random Quote Generator!");
        scanner.close();
    }
}
    

