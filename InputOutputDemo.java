import java.util.Scanner;

public class InputOutputDemo {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);
        
        // Prompt for an integer
        System.out.print("Enter an integer: ");
        int userInt = input.nextInt();
        
        // Prompt for a decimal number
        System.out.print("Enter a decimal number: ");
        double userDouble = input.nextDouble();
        
        // Consume newline to avoid input skipping issue
        input.nextLine();
        
        // Prompt for a string
        System.out.print("Enter a word or sentence: ");
        String userString = input.nextLine();
        
        // Output with formatting
        System.out.printf("Your integer: %d%n", userInt);
        System.out.printf("Your decimal number: %.2f%n", userDouble);
        System.out.printf("Your string: %s%n", userString);
        
        // Close the scanner
        input.close();
    }
}

