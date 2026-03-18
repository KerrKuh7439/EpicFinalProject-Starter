import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Utility methods used throughout the project.
 *
 * Student Notes:
 * - This class stores helper methods that can be reused in multiple places.
 * - You may add more helper methods here as your project grows.
 */
public class Utils {

    /**
     * Prints a formatted console header.
     *
     * @param title the title to display
     */
    public static void printHeader(String title) {
        System.out.println();
        System.out.println("========================================");
        System.out.println(title);
        System.out.println("========================================");
    }

    /**
     * Reads an integer safely from the user.
     *
     * @param input the Scanner object
     * @param prompt the message shown to the user
     * @return a valid integer
     */
    public static int readInt(Scanner input, String prompt) {
        while (true) {
            System.out.print(prompt);

            try {
                int value = input.nextInt();
                input.nextLine(); // clear leftover newline
                return value;
            } catch (InputMismatchException e) {
                input.nextLine(); // clear invalid input
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }

    /**
     * Reads a non-empty string from the user.
     *
     * @param input the Scanner object
     * @param prompt the message shown to the user
     * @return a non-empty string
     */
    public static String readNonEmptyString(Scanner input, String prompt) {
        while (true) {
            System.out.print(prompt);
            String value = input.nextLine().trim();

            if (!value.isEmpty()) {
                return value;
            }

            System.out.println("Input cannot be empty. Please try again.");
        }
    }
}
