/**
 * ==============================================================
 * MAIN CLASS - UseCase7PaLindromeApp
 * ==============================================================
 *
 * Use Case 7: Dequeue Based Optimized Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Dequeue
 * (Double Ended Queue).
 *
 * Characters are inserted into dequeue and then
 * compared by removing elements from both ends:
 *
 * - removeFirst()
 * - removeLast()
 *
 * This avoids reversing the string and provides an 
 * efficient front-to-back comparison approach.
 *
 * This use case demonstrates optimal bidirectional 
 * traversal using Dequeue.
 *
 * @auhor Priankshi
 * @version 7.0
 */

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
public class UseCase7PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word to check if it's a palindrome: ");
        String word = scanner.nextLine();

        Deque<Character> deque = new LinkedList<>();

       
        for (int i = 0; i < word.length(); i++) {
            deque.add(word.charAt(i));
        }

        boolean isPalindrome = true;

        
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }

        scanner.close();
    }
}


