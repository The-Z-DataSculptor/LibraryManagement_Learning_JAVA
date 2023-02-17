import java.util.Scanner;

public class LibrarySystem {
    // Parallel arrays to store book data
    static String[] titles = new String[100];
    static String[] authors = new String[100];
    static int[] quantities = new int[100];
    static int bookCount = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--- Library System Initialized ---");
        input.close();
    }
}
