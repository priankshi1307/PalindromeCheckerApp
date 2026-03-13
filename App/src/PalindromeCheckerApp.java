/**
 * ==============================================================
 * MAIN CLASS - UseCase9PaLindromeApp
 * ==============================================================
 *
 * Use Case 9: Recursive Palindrome Checker
 *
 * Description:
 * This class validates a palindromes using recursion.
 * 
 * Characters are compared from the outer positions
 * moving inward using recursive calls.
 *
 * The recursion stops when:
 * - All characters are matched, or 
 * - A mismatch is found.
 *
 * This use case demonstrates divide-and-conquer
 * logic using method recursion.
 *
 * @auhor Priankshi
 * @version 9.0
 */

import java.util.Scanner;
public class UseCase9PalindromeCheckerApp {

    
    public static boolean isPalindrome(String str, int left, int right) {
        
        if (left >= right) {
            return true;
        }
        
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
       
        return isPalindrome(str, left + 1, right - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word to check if it's a palindrome: ");
        String word = scanner.nextLine();

        if (isPalindrome(word, 0, word.length() - 1)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }

        scanner.close();
    }
}

