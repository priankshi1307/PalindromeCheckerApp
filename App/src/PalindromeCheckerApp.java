/**
 * ==============================================================
 * MAIN CLASS - UseCase10PaLindromeApp
 * ==============================================================
 *
 * Use Case 10: Normalized Palindrome Validation
 *
 * Description:
 * Thhis class validates a palindrome after preprocessing
 * the input string
 *
 * Normalization includes:
 * - Removing spaces and symbols
 * - Converting to lowercase
 *
 * This ensures the palindrome check is logical rather
 * than charcater-format dependent.
 * 
 * Example:
 * " A man a plan a canal Panama "
 *
 * @auhor Priankshi
 * @version 10.0
 */

import java.util.Scanner;

public class UseCase10PalindromeCheckerApp {

    public static String normalize(String str) {
        return str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a phrase to check if it's a palindrome: ");
        String input = scanner.nextLine();

        String normalized = normalize(input);

        if (isPalindrome(normalized)) {
            System.out.println("\"" + input + "\" is a palindrome (ignoring case and spaces).");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }

        scanner.close();
    }
}


