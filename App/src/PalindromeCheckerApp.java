/**
 * ==============================================================
 * MAIN CLASS - UseCase4PaLindromeApp
 * ==============================================================
 *
 * Use Case 4: Character Array Based Validation
 *
 * Description:
 * This class validates a palindrome by converting 
 * the string into a character array and comparing
 * characters using the two-pointer technique.
 *
 * At this stage, the application:
 * - Converts string to char array
 * - Uses start and end pointers
 * - Compares characters efficiently
 * - Displays the result
 *
 * This reduces extra memory usage. 
 *
 * @auhor Priankshi
 * @version 4.0
 */

import java.util.Scanner;

public class UseCase4PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word to check if it's a palindrome: ");
        String word = scanner.nextLine();

        char[] chars = word.toCharArray();  // Convert string to char array
        int left = 0;
        int right = chars.length - 1;
        boolean isPalindrome = true;

        // Two-pointer comparison
        while (left < right) {
            if (chars[left] != chars[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }

        scanner.close();
    }
}



