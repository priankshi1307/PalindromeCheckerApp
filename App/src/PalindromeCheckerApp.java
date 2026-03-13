/**
 * ==============================================================
 * MAIN CLASS - UseCase11PaLindromeApp
 * ==============================================================
 *
 * Use Case 11: Object-Oriented Palindrome Service 
 *
 * Description:
 * This class demonstrates palindrome validation using
 * object-oriented design.
 *
 * The palindrome logic is encapsulated inside a 
 * PalindromeService class.
 *
 * This improves:
 * - Resuability
 * - Readability
 * - Separation of concerns
 *
 * @auhor Priankshi
 * @version 11.0
 */


import java.util.Scanner;

class PalindromeService {
    public boolean checkPalindrome(String str) {
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
}

public class UseCase11PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PalindromeService service = new PalindromeService();

        System.out.print("Enter a word to check if it's a palindrome: ");
        String word = scanner.nextLine();

        if (service.checkPalindrome(word)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }

        scanner.close();
    }
}


