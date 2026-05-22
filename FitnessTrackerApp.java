import java.util.ArrayList;
import java.util.Scanner;

class FitnessRecord {

    String activity;
    int duration;
    int calories;

    // Constructor
    FitnessRecord(String activity, int duration, int calories) {
        this.activity = activity;
        this.duration = duration;
        this.calories = calories;
    }

    // Display Method
    void display() {
        System.out.println("Activity : " + activity);
        System.out.println("Duration : " + duration + " minutes");
        System.out.println("Calories : " + calories);
        System.out.println("----------------------------");
    }
}

public class FitnessTrackerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<FitnessRecord> records = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n===== FITNESS TRACKER APP =====");
            System.out.println("1. Add Fitness Activity");
            System.out.println("2. View All Activities");
            System.out.println("3. View Total Calories Burned");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Activity Name: ");
                    String activity = sc.nextLine();

                    System.out.print("Enter Duration (minutes): ");
                    int duration = sc.nextInt();

                    System.out.print("Enter Calories Burned: ");
                    int calories = sc.nextInt();
                    sc.nextLine();

                    // Add Record
                    records.add(new FitnessRecord(activity, duration, calories));

                    System.out.println("Fitness activity added successfully!");
                    break;

                case 2:

                    if (records.isEmpty()) {

                        System.out.println("No fitness records found.");

                    } else {

                        System.out.println("\n===== FITNESS RECORDS =====");

                        for (FitnessRecord record : records) {
                            record.display();
                        }
                    }

                    break;

                case 3:

                    int totalCalories = 0;

                    for (FitnessRecord record : records) {
                        totalCalories += record.calories;
                    }

                    System.out.println("Total Calories Burned: " + totalCalories);

                    break;

                case 4:

                    System.out.println("Exiting Fitness Tracker App...");
                    break;

                default:

                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}