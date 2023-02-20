import java.util.Scanner;

public class LibrarySystem {
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
                input.nextLine();
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 4.");
                input.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = input.nextLine();
                    System.out.print("Enter book author: ");
                    String author = input.nextLine();
                    System.out.print("Enter quantity: ");
                    if (input.hasNextInt()) {
                        int quantity = input.nextInt();
                        addBook(title, author, quantity);
                    } else {
                        System.out.println("Invalid quantity. Must be a number.");
                    }
                    break;
                case 2:
                    System.out.print("Enter book title to borrow: ");
                    String borrowTitle = input.nextLine();
                    System.out.print("Enter quantity to borrow: ");
                    if (input.hasNextInt()) {
                        int borrowQty = input.nextInt();
                        borrowBook(borrowTitle, borrowQty);
                    } else {
                        System.out.println("Invalid quantity. Must be a number.");
                    }
                    break;
                case 3:
                    System.out.print("Enter book title to return: ");
                    String returnTitle = input.nextLine();
                    System.out.print("Enter quantity to return: ");
                    if (input.hasNextInt()) {
                        int returnQty = input.nextInt();
                        returnBook(returnTitle, returnQty);
                    } else {
                        System.out.println("Invalid quantity. Must be a number.");
                    }
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

    static void addBook(String title, String author, int quantity) {
        if (quantity <= 0) {
            System.out.println("Error: Quantity must be greater than zero.");
            return;
        }

        for (int i = 0; i < bookCount; i++) {
            if (titles[i].equalsIgnoreCase(title)) {
                quantities[i] += quantity;
                System.out.println("Book already exists. Updated total quantity to: " + quantities[i]);
                return;
            }
        }

        if (bookCount < titles.length) {
            titles[bookCount] = title;
            authors[bookCount] = author;
            quantities[bookCount] = quantity;
            bookCount++;
            System.out.println("New book added to the library successfully!");
        } else {
            System.out.println("Error: Library database is full!");
        }
    }

    static void borrowBook(String title, int quantity) {
        if (quantity <= 0) {
            System.out.println("Error: Borrow quantity must be greater than zero.");
            return;
        }

        for (int i = 0; i < bookCount; i++) {
            if (titles[i].equalsIgnoreCase(title)) {
                if (quantities[i] >= quantity) {
                    quantities[i] -= quantity;
                    System.out.println("Success! You borrowed " + quantity + " copies of '" + title + "'.");
                    return;
                } else {
                    System.out.println("Error: Only " + quantities[i] + " copies available.");
                    return;
                }
            }
        }
        System.out.println("Error: Book not found in the library.");
    }

    static void returnBook(String title, int quantity) {
        if (quantity <= 0) {
            System.out.println("Error: Return quantity must be greater than zero.");
            return;
        }

        for (int i = 0; i < bookCount; i++) {
            if (titles[i].equalsIgnoreCase(title)) {
                quantities[i] += quantity;
                System.out.println("Success! You returned " + quantity + " copies of '" + title + "'.");
                return;
            }
        }
        System.out.println("Error: This book does not belong to our library system.");
    }
}
