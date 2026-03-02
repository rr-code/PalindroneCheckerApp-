import java.util.*;

// =======================================================
// MAIN CLASS - UseCase12PalindromeCheckerApp
// =======================================================
public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        System.out.println("Choose Palindrome Checking Strategy:");
        System.out.println("1. Stack Strategy");
        System.out.println("2. Deque Strategy");
        System.out.print("Enter choice (1 or 2): ");
        int choice = scanner.nextInt();

        // Strategy reference
        PalindromeStrategy strategy;

        if (choice == 1) {
            strategy = new StackStrategy();
        } else if (choice == 2) {
            strategy = new DequeStrategy();
        } else {
            System.out.println("Invalid choice. Defaulting to Stack Strategy.");
            strategy = new StackStrategy();
        }

        // Execute selected strategy
        boolean result = strategy.check(input);

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? " + result);

        scanner.close();
    }
}


// =======================================================
// INTERFACE - PalindromeStrategy
// =======================================================
interface PalindromeStrategy {
    boolean check(String input);
}


// =======================================================
// CLASS - StackStrategy
// =======================================================
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {

        Stack<Character> stack = new Stack<>();

        // Push all characters into stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare original string with reversed (stack pop)
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}


// =======================================================
// CLASS - DequeStrategy
// =======================================================
class DequeStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {

        Deque<Character> deque = new ArrayDeque<>();

        // Add characters to deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        // Compare front and rear
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}