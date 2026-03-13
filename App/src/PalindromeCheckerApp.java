/**
 * ==============================================================
 * MAIN CLASS - UseCase13PaLindromeApp
 * ==============================================================
 *
 * Use Case 13: Performance Comparison
 *
 * Description:
 * This class reassures and compares the execution
 * performance of palindrome validation algorithms.
 *
 * At this stage, the application:
 * - Uses a palindrome strategy implementation
 * - Captures execution start and end time
 * - Calculates total execution duration
 * - Displays benchmarking results
 *
 * This use case focuses purely on performance
 * measurement and algorithm comparison.
 *
 * The goal is to introduce benchmarking concepts.
 *
 * @auhor Priankshi
 * @version 13.0
 */


import java.util.Scanner;
import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

interface PalindromeStrategy {
    boolean checkPalindrome(String str);
}

class StackStrategy implements PalindromeStrategy {
    public boolean checkPalindrome(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            stack.push(c);
        }
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }
        return str.equals(reversed);
    }
}

class DequeStrategy implements PalindromeStrategy {
    public boolean checkPalindrome(String str) {
        Deque<Character> deque = new LinkedList<>();
        for (char c : str.toCharArray()) {
            deque.add(c);
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
}

public class UseCase13PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word to check performance: ");
        String word = scanner.nextLine();

        PalindromeStrategy stackStrategy = new StackStrategy();
        PalindromeStrategy dequeStrategy = new DequeStrategy();

        long startStack = System.nanoTime();
        boolean stackResult = stackStrategy.checkPalindrome(word);
        long endStack = System.nanoTime();
        long durationStack = endStack - startStack;

        long startDeque = System.nanoTime();
        boolean dequeResult = dequeStrategy.checkPalindrome(word);
        long endDeque = System.nanoTime();
        long durationDeque = endDeque - startDeque;

        System.out.println("Stack Strategy: " + (stackResult ? "Palindrome" : "Not Palindrome") + " | Time: " + durationStack + " ns");
        System.out.println("Deque Strategy: " + (dequeResult ? "Palindrome" : "Not Palindrome") + " | Time: " + durationDeque + " ns");

        scanner.close();
    }
}


