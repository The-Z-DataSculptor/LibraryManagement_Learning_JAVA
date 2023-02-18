import java.util.Scanner;

public class LibrarySystem {
    // Parallel arrays to store book data
    static String[] titles = new String[100];
    static String[] authors = new String[100];
    static int[] quantities = new int[100];
    static int bookCount = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- Library System Menu ---");
            System.out.println("1. Add Books");
            System.out.println("2. Borrow Books");
            System.out.println("3. Return Books");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");

            int choice;
            if (input.hasNextInt()) {
                choice = input.nextInt();
                input.nextLine(); // Clear newline
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 4.");
                input.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("Add book selected (implementation in progress).");
                    break;
                case 2:
                    System.out.println("Borrow book selected (implementation in progress).");
                    break;
                case 3:
                    System.out.println("Return book selected (implementation in progress).");
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting Library System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please select 1-4.");
            }
        }
        input.close();
    }
}
