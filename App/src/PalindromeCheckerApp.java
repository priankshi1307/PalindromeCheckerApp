/**
 * ==============================================================
 * MAIN CLASS - UseCase5PaLindromeApp
 * ==============================================================
 *
 * Use Case 5: Stack Based Palindrome Checker 
 *
 * Description:
 * This class validates a palindrome using a Stack
 * data structure which follows the LIFO principle.
 *
 * At this stage, the application:
 * - Pushes characters into a stack
 * - Pops them in reverse order 
 * - Compares with the original sequence
 * - Displays the result
 *
 * This maps stack behavior to reversal logic.
 *
 * @auhor Priankshi
 * @version 5.0
 */

import java.util.Scanner;
import java.util.Stack;
public class UseCase5PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word to check if it's a palindrome: ");
        String word = scanner.nextLine();

        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        // Pop characters to build reversed string
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
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
