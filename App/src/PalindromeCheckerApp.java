/**
 * ==============================================================
 * MAIN CLASS - UseCase3PaLindromeApp
 * ==============================================================
 *
 * Use Case 3: Reverse String Based Palindrome Check 
 *
 * Description:
 * This class checks whether a string is a palindrome
 * by reversing the string and comparing it with
 * the original value.
 *
 * At this stage, the application:
 * - Iterates the string in reverse order
 * - Builds a reversal version
 * - Compares original and reversed strings
 * - Displays the validation result
 *
 * This introduces transformation-based validation. 
 *
 * @auhor Priankshi
 * @version 3.0
 */

import java.util.Scanner;

public class UseCase3PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word to check if it's a palindrome: ");
        String word = scanner.nextLine();

        // Reverse the string using a loop
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Compare original and reversed
        if (word.equals(reversed)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }

        scanner.close();
    }
}


