import java.util.Scanner;
/**
* This program calculates the number of logs that can fit on a truck.
*
* @author  Alexander Matheson
* @version 1.0
* @since   2023-02-16
*/

public final class Logging {

    /**
    * For style checker.
    *
    * @exception IllegalStateException Utility class.
    * @see IllegalStateException
    */
    private Logging() {
        throw new IllegalStateException("Utility class");
    }

    /**
    * Print messages.
    *
    * @param args Unused
    */
    public static void main(String[] args) {
        // Variables
        String stringInput = "";
        double length = 0;
        double weight = 0;
        double totalLogDouble = 0;
        int totalLog = 0;

        // Try ... catch statement
        try {
            // Get input
            System.out.println("Enter the length of the logs (in m): ");
            final Scanner line = new Scanner(System.in);
            stringInput = line.nextLine();
            // Change from string to double
            length = Double.parseDouble(stringInput);
            // Check for negative numbers
            if (length == 0.25 || length == 0.5 || length == 1) {
                // Math
                weight = length * 20;
                totalLogDouble = 1100.0 / weight;

                // parse to int.
                totalLog = (int) totalLogDouble;

                System.out.print("The total number of logs is " + totalLog);
                System.out.println(".");
            } else {
                System.out.println("That is an invalid input.");
            }
        } catch (NumberFormatException err) {
            System.out.println("Error, not a viable input.");
        }
    }
}
