/**
 * ==============================================================
 * MAIN CLASS - UseCase1PaLindromeApp
 * ==============================================================
 *
 * Use Case 1: Application Entry & Welcome Message
 *
 * Description:
 * This class represents the entry point of the
 * Palindrome Checker Management System.
 *
 * At this stage, the application:
 * - Starts execution from the main() method
 * - Displays a welcome message
 * - Shows application version
 *
 * No palindrome logic is implemented yet.
 *
 * The goal is to establish a clear startup flow.
 *
 * @auhor Priankshi
 * @version 1.0
 */

import java.util.Scanner;
public class PalindromeCheckerApp {
    public static boolean isPalindrome(String text) {
        text = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0, right = text.length() - 1;
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
            return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args ){
        System.out.println("Welcome to Palindrome Checker App Management System");
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Palindrome Checker App ===");
        System.out.print("Enter a word, phrase, or number: ");
        String input = scanner.nextLine();
        if (isPalindrome(input)) {
            System.out.println("yes" + input + "' is a palindrome!");
        } else {
            System.out.println("no" + input + "' is NOT a palindrome.");
        }
        scanner.close();
    }

}

