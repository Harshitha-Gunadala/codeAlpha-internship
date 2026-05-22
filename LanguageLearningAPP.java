import java.util.ArrayList;
import java.util.Scanner;

// Class to store word details
class Word {

    String english;
    String meaning;

    // Constructor
    Word(String english, String meaning) {
        this.english = english;
        this.meaning = meaning;
    }

    // Method to display word details
    void display() {
        System.out.println("Word    : " + english);
        System.out.println("Meaning : " + meaning);
        System.out.println("---------------------------");
    }
}

// Main Class
public class LanguageLearningApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ArrayList to store words
        ArrayList<Word> words = new ArrayList<>();

        // Default words
        words.add(new Word("Hello", "Namaste"));
        words.add(new Word("Thank You", "Dhanyavadham"));
        words.add(new Word("Water", "Neellu"));
        words.add(new Word("Friend", "Snehithudu"));

        int choice;

        do {

            System.out.println("\n===== LANGUAGE LEARNING APP =====");
            System.out.println("1. View All Words");
            System.out.println("2. Add New Word");
            System.out.println("3. Take Quiz");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:

                    System.out.println("\n===== WORD LIST =====");

                    if (words.isEmpty()) {
                        System.out.println("No words available.");
                    } else {

                        for (Word w : words) {
                            w.display();
                        }
                    }

                    break;

                case 2:

                    System.out.print("Enter English Word: ");
                    String english = sc.nextLine();

                    System.out.print("Enter Meaning: ");
                    String meaning = sc.nextLine();

                    words.add(new Word(english, meaning));

                    System.out.println("New word added successfully!");

                    break;

                case 3:

                    int score = 0;

                    System.out.println("\n===== QUIZ =====");

                    for (Word w : words) {

                        System.out.print("What is the meaning of \"" + w.english + "\" ? ");

                        String answer = sc.nextLine();

                        if (answer.equalsIgnoreCase(w.meaning)) {

                            System.out.println("Correct Answer!");
                            score++;

                        } else {

                            System.out.println("Wrong Answer!");
                            System.out.println("Correct Meaning: " + w.meaning);
                        }
                    }

                    System.out.println("\nYour Score: " + score + "/" + words.size());

                    break;

                case 4:

                    System.out.println("Exiting Application...");
                    break;

                default:

                    System.out.println("Invalid Choice! Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}